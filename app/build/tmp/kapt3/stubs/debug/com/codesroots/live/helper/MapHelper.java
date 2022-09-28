package com.codesroots.live.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010J\u001a\u00020?2\u0006\u0010K\u001a\u00020LJ\u000e\u0010M\u001a\u00020C2\u0006\u0010K\u001a\u00020LJ\u000e\u0010N\u001a\u00020C2\u0006\u0010K\u001a\u00020LJ\u0010\u0010O\u001a\u00020C2\u0006\u0010K\u001a\u00020LH\u0002J\u000e\u0010P\u001a\u00020C2\u0006\u0010K\u001a\u00020LJ\u000e\u0010Q\u001a\u00020?2\u0006\u0010K\u001a\u00020LJ\u000e\u0010R\u001a\u00020?2\u0006\u0010K\u001a\u00020LJ\u0010\u0010S\u001a\u00020C2\u0006\u0010<\u001a\u00020=H\u0002J\u0016\u0010T\u001a\u00020C2\u0006\u0010<\u001a\u00020=2\u0006\u0010K\u001a\u00020LJ\u000e\u0010U\u001a\u00020C2\u0006\u0010<\u001a\u00020=J\u000e\u0010V\u001a\u00020C2\u0006\u0010K\u001a\u00020LR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020.X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u00103\u001a\u000204X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u00109\u001a\u000204X\u0080.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\u000e\u0010<\u001a\u00020=X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020?X\u0082\u000e\u00a2\u0006\u0002\n\u0000R#\u0010@\u001a\u0014\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020C0A\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020GX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010I\u00a8\u0006W"}, d2 = {"Lcom/codesroots/live/helper/MapHelper;", "", "()V", "PERMISSION_ID", "", "getPERMISSION_ID", "()I", "REQUEST_LOCATION_PERMISSION", "TAG", "", "kotlin.jvm.PlatformType", "latitude", "", "getLatitude", "()Ljava/lang/Double;", "setLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "longitude", "getLongitude", "setLongitude", "mCurrLocationMarker", "Lcom/google/android/gms/maps/model/Marker;", "getMCurrLocationMarker$app_debug", "()Lcom/google/android/gms/maps/model/Marker;", "setMCurrLocationMarker$app_debug", "(Lcom/google/android/gms/maps/model/Marker;)V", "mFusedLocationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMFusedLocationClient$app_debug", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setMFusedLocationClient$app_debug", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "mGoogleApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "getMGoogleApiClient$app_debug", "()Lcom/google/android/gms/common/api/GoogleApiClient;", "setMGoogleApiClient$app_debug", "(Lcom/google/android/gms/common/api/GoogleApiClient;)V", "mLastLocation", "Landroid/location/Location;", "getMLastLocation$app_debug", "()Landroid/location/Location;", "setMLastLocation$app_debug", "(Landroid/location/Location;)V", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "getMLocationCallback$app_debug", "()Lcom/google/android/gms/location/LocationCallback;", "setMLocationCallback$app_debug", "(Lcom/google/android/gms/location/LocationCallback;)V", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getMLocationRequest$app_debug", "()Lcom/google/android/gms/location/LocationRequest;", "setMLocationRequest$app_debug", "(Lcom/google/android/gms/location/LocationRequest;)V", "mLocationResult", "getMLocationResult$app_debug", "setMLocationResult$app_debug", "map", "Lcom/google/android/gms/maps/GoogleMap;", "mapReady", "", "negativeButtonClick", "Lkotlin/Function2;", "Landroid/content/DialogInterface;", "", "getNegativeButtonClick", "()Lkotlin/jvm/functions/Function2;", "overlaySize", "", "getOverlaySize", "()F", "CheckPermission", "context", "Landroid/content/Context;", "NewLocationData", "RequestPermission", "buildAlertMessageNoGps", "gpsStatus", "isLocationEnabled", "isPermissionGranted", "setMapLongClick", "setMapStyle", "setPoiClick", "statusCheck", "app_debug"})
public final class MapHelper {
    public com.google.android.gms.location.LocationCallback mLocationCallback;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.model.Marker mCurrLocationMarker;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.common.api.GoogleApiClient mGoogleApiClient;
    public com.google.android.gms.location.LocationRequest mLocationRequest;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.location.FusedLocationProviderClient mFusedLocationClient;
    private boolean mapReady = false;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double latitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double longitude;
    private final float overlaySize = 100.0F;
    private final int PERMISSION_ID = 1010;
    private final java.lang.String TAG = null;
    private com.google.android.gms.maps.GoogleMap map;
    public android.location.Location mLastLocation;
    public com.google.android.gms.location.LocationRequest mLocationResult;
    private final int REQUEST_LOCATION_PERMISSION = 1;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function2<android.content.DialogInterface, java.lang.Integer, kotlin.Unit> negativeButtonClick = null;
    
    public MapHelper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.LocationCallback getMLocationCallback$app_debug() {
        return null;
    }
    
    public final void setMLocationCallback$app_debug(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationCallback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.model.Marker getMCurrLocationMarker$app_debug() {
        return null;
    }
    
    public final void setMCurrLocationMarker$app_debug(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.Marker p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.common.api.GoogleApiClient getMGoogleApiClient$app_debug() {
        return null;
    }
    
    public final void setMGoogleApiClient$app_debug(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.common.api.GoogleApiClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.LocationRequest getMLocationRequest$app_debug() {
        return null;
    }
    
    public final void setMLocationRequest$app_debug(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationRequest p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.location.FusedLocationProviderClient getMFusedLocationClient$app_debug() {
        return null;
    }
    
    public final void setMFusedLocationClient$app_debug(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
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
    
    public final float getOverlaySize() {
        return 0.0F;
    }
    
    public final int getPERMISSION_ID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.Location getMLastLocation$app_debug() {
        return null;
    }
    
    public final void setMLastLocation$app_debug(@org.jetbrains.annotations.NotNull()
    android.location.Location p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.LocationRequest getMLocationResult$app_debug() {
        return null;
    }
    
    public final void setMLocationResult$app_debug(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.LocationRequest p0) {
    }
    
    public final void setPoiClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    public final void setMapStyle(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void setMapLongClick(com.google.android.gms.maps.GoogleMap map) {
    }
    
    public final boolean isPermissionGranted(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void statusCheck(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function2<android.content.DialogInterface, java.lang.Integer, kotlin.Unit> getNegativeButtonClick() {
        return null;
    }
    
    public final void gpsStatus(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void buildAlertMessageNoGps(android.content.Context context) {
    }
    
    public final boolean isLocationEnabled(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final boolean CheckPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void RequestPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void NewLocationData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}