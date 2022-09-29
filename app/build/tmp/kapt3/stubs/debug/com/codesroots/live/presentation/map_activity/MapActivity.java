package com.codesroots.live.presentation.map_activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00b7\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u00b7\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000f\u0010\u0018\u001a\t\u0012\u0004\u0012\u00020\u001a0\u008e\u0001H\u0016J\t\u0010\u008f\u0001\u001a\u00020jH\u0002J\t\u0010\u0090\u0001\u001a\u00020jH\u0002J\t\u0010\u0091\u0001\u001a\u00020jH\u0002J\t\u0010\u0092\u0001\u001a\u00020jH\u0002J\u0019\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020.0\u0094\u00012\u0007\u0010\u0095\u0001\u001a\u00020\u0007H\u0002J\u0013\u0010\u0096\u0001\u001a\u00020j2\b\u0010\u0097\u0001\u001a\u00030\u0098\u0001H\u0007J\u001a\u0010\u0099\u0001\u001a\u00020j2\b\u0010\u009a\u0001\u001a\u00030\u009b\u00012\u0007\u0010\u009c\u0001\u001a\u00020(J\u0007\u0010\u009d\u0001\u001a\u00020jJ\u001b\u0010\u009e\u0001\u001a\u00020\u00072\u0007\u0010\u009f\u0001\u001a\u00020.2\u0007\u0010\u00a0\u0001\u001a\u00020.H\u0002J\u0007\u0010\u00a1\u0001\u001a\u00020jJ\u0015\u0010\u00a2\u0001\u001a\u00020j2\n\u0010\u00a3\u0001\u001a\u0005\u0018\u00010\u00a4\u0001H\u0016J\u0012\u0010\u00a5\u0001\u001a\u00020j2\u0007\u0010\u00a6\u0001\u001a\u00020aH\u0016J\u0013\u0010\u00a7\u0001\u001a\u00020:2\b\u0010\u00a8\u0001\u001a\u00030\u00a9\u0001H\u0016J\t\u0010\u00aa\u0001\u001a\u00020jH\u0014J\u0011\u0010\u00ab\u0001\u001a\u00020j2\b\u0010\u00ac\u0001\u001a\u00030\u00ad\u0001J\u0010\u0010\u00ae\u0001\u001a\u00020j2\u0007\u0010\u00af\u0001\u001a\u00020\u0007J\t\u0010\u00b0\u0001\u001a\u00020jH\u0002J\t\u0010\u00b1\u0001\u001a\u00020jH\u0002J\"\u0010\u00b2\u0001\u001a\u00020j2\u0007\u0010\u00b3\u0001\u001a\u00020\u00072\u0007\u0010\u00b4\u0001\u001a\u00020:2\u0007\u0010\u00b5\u0001\u001a\u00020iJ\u0010\u0010\u0080\u0001\u001a\u00020j2\u0007\u0010\u009a\u0001\u001a\u00020(J\u0007\u0010\u00b6\u0001\u001a\u00020jR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR.\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00020!\u0018\u0001`\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00103\u001a\u0004\u0018\u000104X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u00020:X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010;\"\u0004\b<\u0010=R\u001e\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010K\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\bL\u0010A\"\u0004\bM\u0010CR\u001c\u0010N\u001a\u0004\u0018\u00010OX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010T\u001a\u0004\u0018\u00010UX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010Z\u001a\u0004\u0018\u00010[X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010`\u001a\u0004\u0018\u00010aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR#\u0010f\u001a\u0014\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020j0g\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u0014\u0010m\u001a\u00020nX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010pR#\u0010q\u001a\u0014\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020j0g\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010lR\u001e\u0010s\u001a\u00020[8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010]\"\u0004\bu\u0010_R\u001c\u0010v\u001a\u0004\u0018\u00010wX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001e\u0010|\u001a\u0004\u0018\u00010}X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010\u0082\u0001\u001a\u00030\u0083\u00018FX\u0086\u0084\u0002\u00a2\u0006\u0010\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R$\u0010\u0088\u0001\u001a\u00030\u0089\u00018\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001\u00a8\u0006\u00b8\u0001"}, d2 = {"Lcom/codesroots/live/presentation/map_activity/MapActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldagger/android/HasAndroidInjector;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/google/android/material/navigation/NavigationView$OnNavigationItemSelectedListener;", "()V", "PlaceId_2", "", "getPlaceId_2", "()Ljava/lang/String;", "setPlaceId_2", "(Ljava/lang/String;)V", "PlaceId_3", "getPlaceId_3", "setPlaceId_3", "Pref", "Lcom/codesroots/live/helper/PreferenceHelper;", "getPref", "()Lcom/codesroots/live/helper/PreferenceHelper;", "setPref", "(Lcom/codesroots/live/helper/PreferenceHelper;)V", "address", "getAddress", "setAddress", "androidInjector", "Ldagger/android/DispatchingAndroidInjector;", "", "getAndroidInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setAndroidInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "data", "Ljava/util/ArrayList;", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "deliveryLocation", "Landroid/location/Location;", "getDeliveryLocation", "()Landroid/location/Location;", "setDeliveryLocation", "(Landroid/location/Location;)V", "homeLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "getHomeLatLng", "()Lcom/google/android/gms/maps/model/LatLng;", "setHomeLatLng", "(Lcom/google/android/gms/maps/model/LatLng;)V", "intent1", "Landroid/content/Intent;", "getIntent1", "()Landroid/content/Intent;", "setIntent1", "(Landroid/content/Intent;)V", "isConnected", "", "()Z", "setConnected", "(Z)V", "latitude", "", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "setLocationRequest", "(Lcom/google/android/gms/location/LocationRequest;)V", "longitude", "getLongitude", "setLongitude", "mDrawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "getMDrawerLayout", "()Landroidx/drawerlayout/widget/DrawerLayout;", "setMDrawerLayout", "(Landroidx/drawerlayout/widget/DrawerLayout;)V", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMFusedLocationClient$app_debug", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationClient$app_debug", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "mSocket", "Lcom/github/nkzawa/socketio/client/Socket;", "getMSocket", "()Lcom/github/nkzawa/socketio/client/Socket;", "setMSocket", "(Lcom/github/nkzawa/socketio/client/Socket;)V", "map", "Lcom/google/android/gms/maps/GoogleMap;", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "negativeButtonClick", "Lkotlin/Function2;", "Landroid/content/DialogInterface;", "", "", "getNegativeButtonClick", "()Lkotlin/jvm/functions/Function2;", "overlaySize", "", "getOverlaySize", "()F", "positiveButtonClick", "getPositiveButtonClick", "socket", "getSocket", "setSocket", "trackingData", "Lcom/codesroots/live/models/auth/TrackingModel;", "getTrackingData", "()Lcom/codesroots/live/models/auth/TrackingModel;", "setTrackingData", "(Lcom/codesroots/live/models/auth/TrackingModel;)V", "userLocationMarker", "Lcom/google/android/gms/maps/model/Marker;", "getUserLocationMarker", "()Lcom/google/android/gms/maps/model/Marker;", "setUserLocationMarker", "(Lcom/google/android/gms/maps/model/Marker;)V", "viewModel", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "getViewModel", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "Ldagger/android/AndroidInjector;", "buildAlertMessageNoGps", "checkBackgroundLocation", "checkLocationPermission", "connectToSocket", "decodePoly", "", "encoded", "enableMyLocation", "context", "Landroid/content/Context;", "getClientAddress", "location", "Lcom/codesroots/live/models/auth/Coordinates;", "locationn", "getMyLocation", "getURL", "from", "to", "gpsStatus", "onCreate", "icicle", "Landroid/os/Bundle;", "onMapReady", "googleMap", "onNavigationItemSelected", "item", "Landroid/view/MenuItem;", "onResume", "openCloseNavigationDrawer", "view", "Landroid/view/View;", "registerTokenRequest", "firebaseToken", "requestBackgroundLocationPermission", "requestLocationPermission", "restaurantStatus", "resStatus", "isChecked", "icon", "statusCheck", "Companion", "app_debug"})
public final class MapActivity extends androidx.appcompat.app.AppCompatActivity implements dagger.android.HasAndroidInjector, com.google.android.gms.maps.OnMapReadyCallback, com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener {
    @javax.inject.Inject()
    public com.codesroots.live.helper.PreferenceHelper Pref;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.GoogleMap map;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double latitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double longitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String PlaceId_2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String PlaceId_3;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location deliveryLocation;
    private final float overlaySize = 100.0F;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String address = "";
    @org.jetbrains.annotations.Nullable()
    private androidx.drawerlayout.widget.DrawerLayout mDrawerLayout;
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.maps.model.LatLng homeLatLng;
    @org.jetbrains.annotations.Nullable()
    private android.content.Intent intent1;
    @org.jetbrains.annotations.Nullable()
    private com.github.nkzawa.socketio.client.Socket mSocket;
    @org.jetbrains.annotations.Nullable()
    private java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem> data;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.auth.TrackingModel trackingData;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker userLocationMarker;
    private boolean isConnected = false;
    @javax.inject.Inject()
    public com.github.nkzawa.socketio.client.Socket socket;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.LocationRequest locationRequest;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.codesroots.live.presentation.map_activity.MapActivity.Companion Companion = null;
    private static final int MY_PERMISSIONS_REQUEST_LOCATION = 99;
    private static final int MY_PERMISSIONS_REQUEST_BACKGROUND_LOCATION = 66;
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<java.lang.Object> androidInjector;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<android.content.DialogInterface, java.lang.Integer, kotlin.Unit> positiveButtonClick = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<android.content.DialogInterface, java.lang.Integer, kotlin.Unit> negativeButtonClick = null;
    private java.util.HashMap _$_findViewCache;
    
    public MapActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.helper.PreferenceHelper getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.helper.PreferenceHelper p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.FusedLocationProviderClient getMFusedLocationClient$app_debug() {
        return null;
    }
    
    public final void setMFusedLocationClient$app_debug(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.GoogleMap getMap() {
        return null;
    }
    
    public final void setMap(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLatitude() {
        return null;
    }
    
    public final void setLatitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLongitude() {
        return null;
    }
    
    public final void setLongitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceId_2() {
        return null;
    }
    
    public final void setPlaceId_2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceId_3() {
        return null;
    }
    
    public final void setPlaceId_3(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getDeliveryLocation() {
        return null;
    }
    
    public final void setDeliveryLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    public final float getOverlaySize() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.drawerlayout.widget.DrawerLayout getMDrawerLayout() {
        return null;
    }
    
    public final void setMDrawerLayout(@org.jetbrains.annotations.Nullable()
    androidx.drawerlayout.widget.DrawerLayout p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.model.LatLng getHomeLatLng() {
        return null;
    }
    
    public final void setHomeLatLng(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.LatLng p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Intent getIntent1() {
        return null;
    }
    
    public final void setIntent1(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.github.nkzawa.socketio.client.Socket getMSocket() {
        return null;
    }
    
    public final void setMSocket(@org.jetbrains.annotations.Nullable()
    com.github.nkzawa.socketio.client.Socket p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.auth.TrackingModel getTrackingData() {
        return null;
    }
    
    public final void setTrackingData(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.auth.TrackingModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker getUserLocationMarker() {
        return null;
    }
    
    public final void setUserLocationMarker(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    public final boolean isConnected() {
        return false;
    }
    
    public final void setConnected(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.nkzawa.socketio.client.Socket getSocket() {
        return null;
    }
    
    public final void setSocket(@org.jetbrains.annotations.NotNull()
    com.github.nkzawa.socketio.client.Socket p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.LocationRequest getLocationRequest() {
        return null;
    }
    
    public final void setLocationRequest(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.LocationRequest p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle icicle) {
    }
    
    private final void checkLocationPermission() {
    }
    
    private final void requestLocationPermission() {
    }
    
    private final void checkBackgroundLocation() {
    }
    
    private final void requestBackgroundLocationPermission() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<java.lang.Object> getAndroidInjector() {
        return null;
    }
    
    public final void setAndroidInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<java.lang.Object> androidInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void enableMyLocation(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void getMyLocation() {
    }
    
    public final void setUserLocationMarker(@org.jetbrains.annotations.NotNull()
    android.location.Location location) {
    }
    
    public final void getClientAddress(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.auth.Coordinates location, @org.jetbrains.annotations.NotNull()
    android.location.Location locationn) {
    }
    
    private final java.lang.String getURL(com.google.android.gms.maps.model.LatLng from, com.google.android.gms.maps.model.LatLng to) {
        return null;
    }
    
    private final java.util.List<com.google.android.gms.maps.model.LatLng> decodePoly(java.lang.String encoded) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onNavigationItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void openCloseNavigationDrawer(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void statusCheck() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<android.content.DialogInterface, java.lang.Integer, kotlin.Unit> getPositiveButtonClick() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<android.content.DialogInterface, java.lang.Integer, kotlin.Unit> getNegativeButtonClick() {
        return null;
    }
    
    public final void gpsStatus() {
    }
    
    private final void buildAlertMessageNoGps() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public final void restaurantStatus(@org.jetbrains.annotations.NotNull()
    java.lang.String resStatus, boolean isChecked, int icon) {
    }
    
    private final void connectToSocket() {
    }
    
    public final void registerTokenRequest(@org.jetbrains.annotations.NotNull()
    java.lang.String firebaseToken) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/codesroots/live/presentation/map_activity/MapActivity$Companion;", "", "()V", "MY_PERMISSIONS_REQUEST_BACKGROUND_LOCATION", "", "MY_PERMISSIONS_REQUEST_LOCATION", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}