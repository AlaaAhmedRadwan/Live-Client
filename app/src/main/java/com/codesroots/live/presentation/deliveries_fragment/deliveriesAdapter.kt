package com.codesroots.live.presentation.deliveries_fragment

import android.app.Dialog
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.Window
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.RecyclerView
import com.codesroots.live.R
import com.codesroots.live.databinding.DeliveryItemBinding
import com.codesroots.live.helper.ClickHandler
import com.codesroots.live.helper.Error_MotionToast
import com.codesroots.live.helper.FormValidationLogin
import com.codesroots.live.helper.SUCCESS_MotionToast
import com.codesroots.live.models.auth.AuthModel
import com.codesroots.live.models.auth.Driver
import com.codesroots.live.models.current_orders.OrdersItem
import com.codesroots.live.models.current_orders.SetorderToDelivery
import com.codesroots.live.models.delivery.DeliveryItem
import com.codesroots.live.models.ordermodel.OrderModel
import com.codesroots.live.presentation.map_activity.MapActivity
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import kotlinx.android.synthetic.main.alert_dialog.*
import kotlinx.android.synthetic.main.delivery_login_fragment.*
import org.jetbrains.anko.layoutInflater


class DeliveriesAdapter(
    var context: Context,
    var data: ArrayList<DeliveryItem>,
    var frag: DeliveriesFragment,
) : RecyclerView.Adapter<DeliveriesAdapter.CustomViewHolders>() {

    var index = 0
    var orderData= OrderModel()

    override fun getItemCount(): Int {
        return data.size
    }


    override fun onBindViewHolder(p0: CustomViewHolders, position: Int) {
        p0.bind(data[position], context)
        ////////////// Socket ///////////////////////
        try {

            index = position
            p0.binding.send.setOnClickListener {
                p0.binding.progress.isVisible = true
                if (!FormValidationLogin().submitForm(p0.binding, context)) {
                    FormValidationLogin().invalidForm(p0.binding, context)
                } else {
                    FormValidationLogin().submitForm(p0.binding,context)
                    addOrder(p0)
                    it.isEnabled =false
                }

//            p0.sendNotificationToDevice(frag.data.id!!,
//                "طلب جديد",
//                "لديك طلب جديد يحتاج التوصيل")
//                if(itemClickable) {
                try {
                frag.viewModel.OrderInfoLD!!.observe(frag.requireActivity(), Observer {model->
               if (model!=null)
                   p0.binding.progress.isVisible = false
                    orderData =  model
                   dialog()

                })
            } catch (e: Exception) {}
            }


        } catch (e: Exception) {
        }

        (context as MapActivity).mSocket?.on("OrderCanceled") {
            val gson = Gson()
            val json = it.first().toString()

            val type = object : TypeToken<Driver?>() {}.type
            val newitem = gson.fromJson<Driver>(json, type)
            if (newitem.delivery_information == 1) {
                Handler(Looper.getMainLooper()).post {
                    Log.d("TAG", "socket// orderDelivery " + json)
                    SUCCESS_MotionToast("تم قبول الاوردر", context as MapActivity)
                    frag.view.progress.isVisible = false
                    frag.dismiss()
                }
            } else {
                Handler(Looper.getMainLooper()).post {
                    Error_MotionToast(" تم رفض الاوردر اختار مندوب  أخر ", context as MapActivity)

                }
                Log.d("TAG", "socket// orderCanceled " + json)
            }
        }

    }

    fun sendSocket() {
        val gson = Gson()
        val gsonPretty = GsonBuilder().setPrettyPrinting().create()
        val socketObject =
            SetorderToDelivery(orderData, (context as MapActivity).Pref.room_id)
        val jsonTut: String = gson.toJson(socketObject)
        println(jsonTut)
        val jsonTutPretty: String = gsonPretty.toJson(socketObject)
        println(jsonTutPretty)
        (context as MapActivity).mSocket?.emit("CreateDeliveryOrder", jsonTutPretty)
        (context as MapActivity).mSocket?.emit("CreateDeliveryRoom",
            (context as MapActivity).Pref.room_id)
        val user_id = data[index].user?.id!!
        Log.d("TAG", "socket// $user_id")
        Log.d("TAG", "socket// $jsonTutPretty")

        frag.view.progress.isVisible = true

    }
   fun dialog(){
       val pDialog = Dialog(context)
       pDialog.getWindow()?.requestFeature(Window.FEATURE_ACTION_BAR);
       pDialog.setContentView(context.layoutInflater.inflate(R.layout.alert_dialog, null)
       );
       pDialog.done.setOnClickListener {
           sendSocket()
           pDialog.hide()

       }
       pDialog.cancel.setOnClickListener {
           pDialog.hide()
       }
       pDialog.show();
   }

    fun addOrder(p0: CustomViewHolders){
        val orderModel = OrderModel(branch_id = 125,
            total = p0.binding.total.text.toString().toDouble(),
            delivery_serivce = p0.binding.total.text.toString().toInt())

        frag.viewModel.addOrder(orderModel)
    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolders {
        val binding: DeliveryItemBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(p0.context),
                R.layout.delivery_item, p0, false
            )

        return CustomViewHolders(binding)
    }

    inner class CustomViewHolders(
        var binding: DeliveryItemBinding,
    ) : RecyclerView.ViewHolder(binding.root) {


        fun bind(data: DeliveryItem, context: Context?) {
            binding.data = data
            binding.listener = ClickHandler()
            binding.context = context as MapActivity
        }

        fun sendNotificationToDevice(user_id: Int, title: String, message: String) {
            val notificationInfo = AuthModel(
                title = title, user_id = user_id, message = message)
            frag.viewModel.sendNotificationToDevice(notificationInfo)

        }
    }


}

