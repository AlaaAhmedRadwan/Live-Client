package com.codesroots.live_venodr.presentation.map_activity


import android.Manifest
import android.annotation.SuppressLint
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.media.MediaPlayer
import android.os.Build
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.beust.klaxon.Parser
import com.codesroots.live_venodr.databinding.MapActivityBinding
import com.codesroots.live_venodr.helper.*
import com.codesroots.live_venodr.models.auth.AuthModel
import com.codesroots.live_venodr.models.current_orders.OrdersItem
import com.codesroots.live_venodr.presentation.auth.LoginActivity
import com.codesroots.live_venodr.presentation.current_order_fragment.CurrentOrderFragment
import com.codesroots.live_venodr.presentation.current_order_fragment.mvi.CurrentOrderViewModel
import com.codesroots.live_venodr.presentation.history_order_fragment.DailyOrdersFragment
import com.codesroots.live_venodr.presentation.history_order_fragment.HistoryOrderFragment
import com.codesroots.live_venodr.presentation.new_order_bottomfragment.NewOrderFragment
import com.codesroots.live_venodr.presentation.profile_fragment.ProfileFragment
import com.codesroots.live_venodr.presentation.profile_fragment.ProfileFragment.Companion.TAG
import com.github.nkzawa.socketio.client.IO
import com.github.nkzawa.socketio.client.Socket
import com.google.android.gms.location.*
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.*
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.material.navigation.NavigationView
import com.google.firebase.messaging.FirebaseMessaging
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.satafood.core.entities.token.Token
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import junit.runner.Version.id
import kotlinx.android.synthetic.main.delivery_login_fragment.*
import kotlinx.android.synthetic.main.map_activity.*
import kotlinx.android.synthetic.main.nav_header_main.view.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import org.jetbrains.anko.custom.async
import org.jetbrains.anko.custom.onUiThread
import com.codesroots.live_venodr.R

import java.io.IOException
import java.net.URL
import javax.inject.Inject
import com.codesroots.live_venodr.databinding.NavHeaderMainBinding
import com.codesroots.live_venodr.models.auth.Coordinates
import com.codesroots.live_venodr.presentation.current_order_fragment.mvi.MainIntent
import com.codesroots.live_venodr.presentation.deliveries_fragment.DeliveriesFragment
import java.util.*
import kotlin.collections.ArrayList

class MapActivity : AppCompatActivity(), HasAndroidInjector, OnMapReadyCallback,
    NavigationView.OnNavigationItemSelectedListener {

    @Inject
    lateinit var Pref: PreferenceHelper
    internal var mFusedLocationClient: FusedLocationProviderClient? = null

    var map: GoogleMap? = null
    private var permissionDenied = false

    var latitude: Double? = null //-33.867
    var longitude: Double? = null // 151.206
    var PlaceId_2: String? = null
    var PlaceId_3: String? = null


    var deliveryLocation: Location? = null

    var address = ""

    var mDrawerLayout: DrawerLayout? = null

    var homeLatLng = LatLng(0.0, 0.0)


    var intent1: Intent? = null

    var mSocket: Socket? = null
    var data: ArrayList<OrdersItem>? = null

    var userLocationMarker: Marker? = null

    @Inject
    lateinit var socket: Socket

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory


    val viewModel by viewModels<CurrentOrderViewModel> { viewModelFactory }


    public override fun onCreate(icicle: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(icicle)
        PreferenceHelper(this)

        val binding: MapActivityBinding =
            DataBindingUtil.setContentView(this, R.layout.map_activity)

        // Get the SupportMapFragment and request notification when the map is ready to be used.
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as? SupportMapFragment

        mapFragment?.getMapAsync(this)

        FirebaseMessaging.getInstance().isAutoInitEnabled = true;

        mDrawerLayout = binding.drawerLayout

        statusCheck()

        var headerBinding: NavHeaderMainBinding =
            NavHeaderMainBinding.bind(binding.navView.getHeaderView(0))


        ////////////// Socket ///////////////////////
        val app: BaseApplication = application as BaseApplication
        mSocket = app.getMSocket()
        //connecting socket
        var options = IO.Options()
        options.reconnection = true //reconnection
        options.forceNew = true
        options.secure = true

        mSocket?.connect()

        socket.on(Socket.EVENT_CONNECT) {
            try {
                restaurantStatus(" متصل", true, R.drawable.online_ic)
                Log.d("TAG", "socket// ${"connect"}")

            } catch (e: Exception) {
                Log.d(TAG, e.message!!)
            }
        }
            .on(Socket.EVENT_CONNECT_ERROR) {
                val e = it[0]
                Log.e(TAG, "error $e")
                runOnUiThread {
                    WARN_MotionToast("error $e", this)
                }
            }
            .on(Socket.EVENT_DISCONNECT) {
                val e = it[0]
                Log.e(TAG, "Transport error $e")
                runOnUiThread {
                    restaurantStatus("غير متصل", false, R.drawable.offline_ic)
                    WARN_MotionToast("غير متصل", this)

                    Log.d("TAG", "sockety// ${mSocket?.connected()}")
                }
            }
            .on(Socket.EVENT_RECONNECT) {

                nav_view.getHeaderView(0).switch1.isChecked
                connectToSocket()
                restaurantStatus(" متصل", true, R.drawable.online_ic)

            }

        mSocket?.emit("CreateDeliveryRoom", Pref.room_id!!)

        connectToSocket()

        mSocket?.on("makeNewOrderToBranch") {
            var mp = MediaPlayer.create(this, R.raw.alarm);
            mp.start();
            runOnUiThread {
                val gson = Gson()
                val json = it.first().toString()
                val type = object : TypeToken<OrdersItem?>() {}.type
                val newitem = gson.fromJson<OrdersItem>(json, type)
                data?.add(0, newitem)
                ClickHandler().openDialogFragment(this, NewOrderFragment(newitem!!, viewModel), "")
                Log.d("socket", json)
            }

        }

        mSocket?.on("RetriveDriverCoordinate") {
            runOnUiThread {
                val gson = Gson()
                val json = it.first().toString()
                val type = object : TypeToken<Coordinates?>() {}.type
                val newitem = gson.fromJson<Coordinates>(json, type)
                getClientAddress(newitem,deliveryLocation!!)
            }

        }

        ////// Delivery Status online/offline ///////////
        viewModel.getBranchData(Pref.VendorId!!)
        try {
            viewModel.deliveryItemLD!!.observe(this) {
                if (!it.isNullOrEmpty()) {
                    headerBinding.data = it[0]
                    nav_view.getHeaderView(0).userName.text = it[0].name?.replace("\"", "")
                }
            }
        } catch (e: java.lang.Exception) {

        }

        nav_view.setNavigationItemSelectedListener(this)
        nav_view.getHeaderView(0).switch1
            ?.setOnClickListener {
                if (nav_view.getHeaderView(0).switch1.isChecked) {
                    // The switch enabled
                    connectToSocket()
                    restaurantStatus(" متصل", true, R.drawable.online_ic)
                    Log.d("TAG", "socket// ${mSocket?.connected()}")

                } else {
                    // The switch disabled
                    mSocket?.disconnect()
                    runOnUiThread {
                        restaurantStatus("غير متصل", false, R.drawable.offline_ic)
                        WARN_MotionToast("غير متصل", this)
                        Log.d("TAG", "socket// ${mSocket?.connected()}")

                    }
                }
            }

        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this)

        mDrawerLayout!!.addDrawerListener(object : SimpleDrawerListener() {
            override fun onDrawerStateChanged(newState: Int) {
                if (newState == DrawerLayout.STATE_SETTLING && !mDrawerLayout!!.isDrawerOpen(
                        GravityCompat.START
                    )
                ) {
                    viewModel.getBranchData(Pref.VendorId!!)

                }
            }
        })


        FireBase()
        clickHandlers()
        getMyLocation()

    }

    private fun clickHandlers() {
        siteDrawerMenuButton.setOnClickListener { view ->
            this.openCloseNavigationDrawer(view)
            note.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.note));

        }

        note.setOnClickListener {
            note.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.note_active));
            ClickHandler().openDialogFragment(this, DeliveriesFragment(), "")

        }
    }

    private fun FireBase() {
        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.d("TAG", "token:///:false ${task.exception?.message}")
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result
            registerTokenRequest(token)

            viewModel.updateUserToken(Pref.userId, Token(token))

            Log.d("TAG", "token:///:" + Pref.VendorId + "///" + token)
            if (!Pref.UserToken.isNullOrEmpty()) {
                lifecycleScope.launch {

                }
            }
            // Log and toast
        })
    }

    private fun checkLocationPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            ) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
                AlertDialog.Builder(this)
                    .setTitle("Location Permission Needed")
                    .setMessage("This app needs the Location permission, please accept to use location functionality")
                    .setPositiveButton(
                        "OK"
                    ) { _, _ ->
                        //Prompt the user once explanation has been shown
                        requestLocationPermission()
                        // selected Don't ask again
                    }
                    .create()
                    .show()
            } else {
                // No explanation needed, we can request the permission.
                requestLocationPermission()
            }
        } else {
            checkBackgroundLocation()
        }
    }


    private fun requestLocationPermission() {
        ActivityCompat.requestPermissions(
            this,
            arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
            ),
            MY_PERMISSIONS_REQUEST_LOCATION
        )
    }

    private fun checkBackgroundLocation() {
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_BACKGROUND_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            requestBackgroundLocationPermission()
        }
    }

    private fun requestBackgroundLocationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_BACKGROUND_LOCATION
                ),
                MY_PERMISSIONS_REQUEST_BACKGROUND_LOCATION
            )
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                MY_PERMISSIONS_REQUEST_LOCATION
            )
        }
    }

    companion object {
        private const val MY_PERMISSIONS_REQUEST_LOCATION = 1010
        private const val MY_PERMISSIONS_REQUEST_BACKGROUND_LOCATION = 1010
    }

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>
    override fun androidInjector(): AndroidInjector<Any> {
        return androidInjector
    }


    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        map!!.clear();
        MapHelper().setPoiClick(map!!)
        //    MapHelper().setMapStyle(map!!, this)
        //  statusCheck()

        //  getLocationPermission()
        // Add a marker in Sydney and mDrawermove the camera

        //  map.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(-34.0, 151.0), 16.0f))
        MapHelper().RequestPermission(this)
        checkLocationPermission()
        CheckForPermessionEnabled()

    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray,
    ) {
        Log.i(TAG, "onRequestPermissionsResult: " + requestCode)

        if (requestCode != MY_PERMISSIONS_REQUEST_LOCATION) {
            super.onRequestPermissionsResult(
                requestCode,
                permissions,
                grantResults
            )
            return
        }

        if (MapHelper().CheckPermission(this)) {
            if (MapHelper().isLocationEnabled(this)) {

                // Enable the my location layer if the permission has been granted.
                enableMyLocation(context = this)
            } else {
                // Permission was denied. Display an error message
                // Display the missing permission error dialog when the fragments resume.
                permissionDenied = true
            }
        }
    }

    fun CheckForPermessionEnabled(){
        if (MapHelper().CheckPermission(this)) {
            if (MapHelper().isLocationEnabled(this)) {
                //  enableMyLocation(this)
            } else {

                Toast.makeText(
                    this,
                    "Please Turn on Your device Location",
                    Toast.LENGTH_SHORT
                ).show()
            }
        } else {
            MapHelper().RequestPermission(this)
        }
    }

    @SuppressLint("MissingPermission")
    fun enableMyLocation(context: Context) {
        map?.isMyLocationEnabled = true
        map?.isTrafficEnabled = true
        mFusedLocationClient!!.lastLocation.addOnCompleteListener { task ->
            val location: Location? = task.result
            if (location == null) {
                MapHelper().NewLocationData(context)
            }
            deliveryLocation = location
            latitude = location!!.latitude
            longitude = location.longitude
            viewModel.intents.trySend(MainIntent.GetPlaceId(viewModel.state.value!!.copy(
                cliendLatitude = location.latitude,
                cliendLongitude = location.longitude,
                progress = true)))

            map!!.animateCamera(
                CameraUpdateFactory.newLatLngZoom(
                    LatLng(
                        latitude!!,
                        longitude!!
                    ), 16.0f
                )
            )
            homeLatLng = LatLng(latitude!!, longitude!!)

            map!!.addMarker(MarkerOptions()
                .position(homeLatLng)

            )
        }

    }

    fun getMyLocation() {
        lifecycleScope.launchWhenStarted {
            viewModel.state.collect {
                if (it != null) {
                    if (it.PlaceId_2 != null){
                      Pref.placeId_2 = it.PlaceId_2

                    }else if (it.PlaceId_3 != null) {
                        Pref.placeId_3 = it.PlaceId_3
                    }
                    else


                        Log.d("TAG", "PlaceId_3:///:" + PlaceId_3 + "///" + PlaceId_2)

                        SUCCESS_MotionToast("place "+ it.PlaceId_2.toString(),this@MapActivity)

                    }
                }



        }
    }

    fun getClientAddress(location: Coordinates, locationn: Location) {

        try {
            val end_latitude = location.latitude
            val end_longitude = location.longitude

            val clientLatLng = LatLng(end_latitude!!, end_longitude!!)
            if (userLocationMarker == null) {
                userLocationMarker = map!!.addMarker(MarkerOptions()
                    .position(clientLatLng)
                    .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.motor_ic))
                    .rotation(locationn.bearing)
                    .anchor(0.5f, 0.5f)
                )

            } else {
                // userLocationMarker!!.position = homeLatLng
                //     userLocationMarker!!.rotation = location.bearing

            }
//            map!!.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(
//                end_latitude,
//                end_longitude), 16.0f))

            // map!!.addMarker(MarkerOptions().position(clientLatLng))

            val options = PolylineOptions()
            options.color(this@MapActivity.getColor(R.color.black))
            options.width(10f)
            val url = getURL(homeLatLng, clientLatLng)

            async {
                // Connect to URL, download content and convert into string asynchronously
                val result = URL(url).readText()
                val LatLongB = LatLngBounds.Builder()

                onUiThread {
                    // When API call is done, create parser and convert into JsonObjec
                    val parser: Parser = Parser()
                    val stringBuilder: StringBuilder = StringBuilder(result)
                    val json: com.beust.klaxon.JsonObject =
                        parser.parse(stringBuilder) as com.beust.klaxon.JsonObject
                    // get to the correct element in JsonObject
                    try {

                        val routes =
                            json.array<com.beust.klaxon.JsonObject>("routes")

                        val points =
                            routes!!["legs"]["steps"][0] as com.beust.klaxon.JsonArray<com.beust.klaxon.JsonObject>

                        // For every element in the JsonArray, decode the polyline string and pass all points to a List

                        val polypts =
                            points.flatMap {
                                decodePoly(it.obj("polyline")
                                    ?.string("points")!!)
                            }
                        // Add  points to polyline and bounds

                        options.add(homeLatLng)
                        LatLongB.include(homeLatLng)
                        for (point in polypts) {
                            options.add(point)
                            LatLongB.include(point)
                        }
                        options.add(clientLatLng)
                        LatLongB.include(clientLatLng)
                        // build bounds
                        val bounds = LatLongB.build()
                        // add polyline to the map
                        map!!.addPolyline(options)
                        // show map with route centered
                        map!!.moveCamera(CameraUpdateFactory.newLatLngBounds(
                            bounds,
                            60))
                    } catch (e: Exception) {
                    }
                }
            }


        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    private fun getURL(from: LatLng, to: LatLng): String {

        val origin = "origin=" + from.latitude + "," + from.longitude

        val dest = "destination=" + to.latitude + "," + to.longitude

        val sensor = "sensor=false"

        val params = "$origin&$dest&$sensor"

        return "https://maps.googleapis.com/maps/api/directions/json?$params&key="//AIzaSyD_U2-w1Zald01AAXfi4vO6EH35YYc0-hM

    }

    private fun decodePoly(encoded: String): List<LatLng> {
        val poly = ArrayList<LatLng>()
        var index = 0
        val len = encoded.length
        var lat = 0
        var lng = 0

        while (index < len) {
            var b: Int
            var shift = 0
            var result = 0
            do {
                b = encoded[index++].toInt() - 63
                result = result or (b and 0x1f shl shift)
                shift += 5
            } while (b >= 0x20)
            val dlat = if (result and 1 != 0) (result shr 1).inv() else result shr 1
            lat += dlat

            shift = 0
            result = 0
            do {
                b = encoded[index++].toInt() - 63
                result = result or (b and 0x1f shl shift)
                shift += 5
            } while (b >= 0x20)
            val dlng = if (result and 1 != 0) (result shr 1).inv() else result shr 1
            lng += dlng

            val p = LatLng(
                lat.toDouble() / 1E5,
                lng.toDouble() / 1E5
            )
            poly.add(p)
        }

        return poly
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.current_orders -> {
                // Handle the camera action
                ClickHandler().openDialogCurrentOrderFragment(
                    this,
                    CurrentOrderFragment(),
                    CurrentOrderFragment.TAG, viewModel
                )
            }
            R.id.dailyOrder -> {
                ClickHandler().openDialogFragment(
                    this,
                    DailyOrdersFragment(),
                    DailyOrdersFragment.TAG
                )
            }
            R.id.archiveOrders -> {
                ClickHandler().openDialogFragment(
                    this,
                    HistoryOrderFragment(),
                    HistoryOrderFragment.TAG
                )
            }
//            R.id.nav_tools -> {
//
//            }
            R.id.logout -> {
                Pref.UserToken = ""
                val mainIntent = Intent(this, LoginActivity::class.java)
                startActivity(mainIntent)
                finish()

            }
            R.id.profile -> {
                ClickHandler().switchBetweenFragments(this, ProfileFragment())

            }
        }


        mDrawerLayout?.closeDrawer(GravityCompat.START)
        return true
    }

    fun openCloseNavigationDrawer(view: View) {

        if (mDrawerLayout!!.isDrawerOpen(GravityCompat.START)) {
            mDrawerLayout!!.closeDrawer(GravityCompat.START)

        } else {
            mDrawerLayout!!.openDrawer(GravityCompat.START)
        }
    }


    fun statusCheck() {
        val manager: LocationManager = getSystemService(LOCATION_SERVICE) as LocationManager
        if (!manager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            buildAlertMessageNoGps()

        }
    }

    val positiveButtonClick = { dialog: DialogInterface, which: Int ->
        gpsStatus()
    }
    val negativeButtonClick = { dialog: DialogInterface, which: Int ->
        dialog.cancel()
    }

    fun gpsStatus() {
        intent1 = Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        startActivity(intent1);
    }

    private fun buildAlertMessageNoGps() {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setMessage("Your GPS seems to be disabled, do you want to enable it?")
            .setCancelable(false)
        builder.setPositiveButton(android.R.string.yes, positiveButtonClick)
        builder.setNegativeButton(android.R.string.no, negativeButtonClick)
        val alert: AlertDialog = builder.create()
        alert.show()
    }


    override fun onResume() {
        super.onResume()

        connectToSocket()
    }

    fun restaurantStatus(resStatus: String, isChecked: Boolean, icon: Int) {
      //  nav_view.getHeaderView(0).switch1.isChecked = isChecked
        status.text = resStatus
        statusIcon.setImageResource(icon)
    }

    private fun connectToSocket() {
        mSocket?.connect()
        mSocket?.emit("create_user", Pref.VendorId)

    }

    fun registerTokenRequest(firebaseToken: String) {
        val registerTokenInfo = AuthModel(
            token = firebaseToken, user_id = Pref.userId)

        viewModel.registerToken(registerTokenInfo)

    }

}