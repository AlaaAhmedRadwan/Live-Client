package com.codesroots.live.repository;

import java.lang.System;

/**
 * Created by Prokash Sarkar on Tue, January 19, 2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ!\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J9\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ/\u0010\u001c\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ!\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00062\b\u0010\"\u001a\u0004\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\u001b\u0010$\u001a\u00020%2\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J)\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0\'j\b\u0012\u0004\u0012\u00020(`)2\u0006\u0010*\u001a\u00020(H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J+\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\u00110\'j\b\u0012\u0004\u0012\u00020\u0011`)2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u0019\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u001f\u00104\u001a\b\u0012\u0004\u0012\u0002050\u00062\u0006\u00106\u001a\u000207H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00108J\u001f\u00109\u001a\b\u0012\u0004\u0012\u0002050\u00062\u0006\u00106\u001a\u000205H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J\u001f\u0010;\u001a\b\u0012\u0004\u0012\u0002050\u00062\u0006\u00106\u001a\u000205H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J!\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020?H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010@R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006A"}, d2 = {"Lcom/codesroots/live/repository/RemoteDataSource;", "Lcom/codesroots/live/repository/DataSource;", "ApiService", "Lcom/codesroots/live/datalayer/APIServices;", "(Lcom/codesroots/live/datalayer/APIServices;)V", "AddOrder", "Lretrofit2/Response;", "Lcom/codesroots/live/models/ordermodel/OrderModel;", "orderInfo", "(Lcom/codesroots/live/models/ordermodel/OrderModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeOrderStatus", "Lcom/codesroots/live/models/current_orders/OrderStatus;", "order_id", "", "data", "(ILcom/codesroots/live/models/current_orders/OrderStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deliversOrdersCanceled", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "(Lcom/codesroots/live/models/current_orders/OrdersItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editDeliveryData", "Lcom/codesroots/live/models/auth/Driver;", "file", "Lokhttp3/MultipartBody$Part;", "name", "", "phone", "id", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editDeliveryPlaceId", "admin_place_2", "admin_place_3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBranchData", "Lcom/codesroots/live/models/delivery/Delivery;", "branchId", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentOrders", "Lcom/codesroots/live/models/current_orders/CurrentOrderModel;", "getDeliveris", "Ljava/util/ArrayList;", "Lcom/codesroots/live/models/delivery/DeliveryItem;", "Lkotlin/collections/ArrayList;", "delivery", "(Lcom/codesroots/live/models/delivery/DeliveryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeliveryOrdersByDate", "dateModel", "Lcom/codesroots/live/models/current_orders/DateModel;", "(Lcom/codesroots/live/models/current_orders/DateModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoogleLocationByLatLng", "Lcom/codesroots/live/models/current_orders/GoogleLocation;", "latlng", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoginResponse", "Lcom/codesroots/live/models/auth/AuthModel;", "loginModel", "Lcom/codesroots/live/models/auth/User;", "(Lcom/codesroots/live/models/auth/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerToken", "(Lcom/codesroots/live/models/auth/AuthModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendNotificationToDevice", "updateUserToken", "userId", "token", "Lcom/satafood/core/entities/token/Token;", "(ILcom/satafood/core/entities/token/Token;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteDataSource implements com.codesroots.live.repository.DataSource {
    private final com.codesroots.live.datalayer.APIServices ApiService = null;
    
    @javax.inject.Inject()
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.datalayer.APIServices ApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getLoginResponse(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.auth.User loginModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.auth.AuthModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerToken(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.auth.AuthModel loginModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.auth.AuthModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object sendNotificationToDevice(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.auth.AuthModel loginModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.auth.AuthModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDeliveris(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.delivery.DeliveryItem delivery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getCurrentOrders(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.CurrentOrderModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDeliveryOrdersByDate(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.DateModel dateModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object changeOrderStatus(int order_id, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrderStatus data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.OrderStatus> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateUserToken(int userId, @org.jetbrains.annotations.NotNull()
    com.satafood.core.entities.token.Token token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object AddOrder(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.ordermodel.OrderModel orderInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.ordermodel.OrderModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object editDeliveryData(@org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.auth.Driver> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getBranchData(@org.jetbrains.annotations.Nullable()
    java.lang.Integer branchId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.delivery.Delivery>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deliversOrdersCanceled(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrdersItem data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.OrdersItem> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getGoogleLocationByLatLng(@org.jetbrains.annotations.NotNull()
    java.lang.String latlng, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.GoogleLocation> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object editDeliveryPlaceId(@org.jetbrains.annotations.Nullable()
    java.lang.String admin_place_2, @org.jetbrains.annotations.Nullable()
    java.lang.String admin_place_3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.auth.Driver> continuation) {
        return null;
    }
}