package com.codesroots.live.repository;

import java.lang.System;

/**
 * Created by Prokash Sarkar on Tue, January 19, 2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ9\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J/\u0010\u0019\u001a\u00020\u00112\b\u0010\u001a\u001a\u0004\u0018\u00010\u00152\b\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00020!2\b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ)\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%2\u0006\u0010&\u001a\u00020$H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J+\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u000e0#j\b\u0012\u0004\u0012\u00020\u000e`%2\b\u0010)\u001a\u0004\u0018\u00010*H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010/J\u001f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u00032\u0006\u00102\u001a\u000203H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00104J\u001f\u00105\u001a\b\u0012\u0004\u0012\u0002010\u00032\u0006\u00102\u001a\u000201H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J\u001f\u00107\u001a\b\u0012\u0004\u0012\u0002010\u00032\u0006\u00102\u001a\u000201H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00106J!\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020;H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010<\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006="}, d2 = {"Lcom/codesroots/live/repository/DataSource;", "", "AddOrder", "Lretrofit2/Response;", "Lcom/codesroots/live/models/ordermodel/OrderModel;", "orderInfo", "(Lcom/codesroots/live/models/ordermodel/OrderModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeOrderStatus", "Lcom/codesroots/live/models/current_orders/OrderStatus;", "order_id", "", "data", "(ILcom/codesroots/live/models/current_orders/OrderStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deliversOrdersCanceled", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "(Lcom/codesroots/live/models/current_orders/OrdersItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editDeliveryData", "Lcom/codesroots/live/models/auth/Driver;", "img", "Lokhttp3/MultipartBody$Part;", "name", "", "phone", "id", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editDeliveryPlaceId", "admin_place_2", "admin_place_3", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBranchData", "Lcom/codesroots/live/models/delivery/Delivery;", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentOrders", "Lcom/codesroots/live/models/current_orders/CurrentOrderModel;", "getDeliveris", "Ljava/util/ArrayList;", "Lcom/codesroots/live/models/delivery/DeliveryItem;", "Lkotlin/collections/ArrayList;", "deliveryItem", "(Lcom/codesroots/live/models/delivery/DeliveryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeliveryOrdersByDate", "dateModel", "Lcom/codesroots/live/models/current_orders/DateModel;", "(Lcom/codesroots/live/models/current_orders/DateModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGoogleLocationByLatLng", "Lcom/codesroots/live/models/current_orders/GoogleLocation;", "latlng", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLoginResponse", "Lcom/codesroots/live/models/auth/AuthModel;", "loginModel", "Lcom/codesroots/live/models/auth/User;", "(Lcom/codesroots/live/models/auth/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerToken", "(Lcom/codesroots/live/models/auth/AuthModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendNotificationToDevice", "updateUserToken", "userId", "token", "Lcom/satafood/core/entities/token/Token;", "(ILcom/satafood/core/entities/token/Token;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface DataSource {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getLoginResponse(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.auth.User loginModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.auth.AuthModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registerToken(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.auth.AuthModel loginModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.auth.AuthModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object sendNotificationToDevice(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.auth.AuthModel loginModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.auth.AuthModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDeliveris(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.delivery.DeliveryItem deliveryItem, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object AddOrder(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.ordermodel.OrderModel orderInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.ordermodel.OrderModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCurrentOrders(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.CurrentOrderModel> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUserToken(int userId, @org.jetbrains.annotations.NotNull()
    com.satafood.core.entities.token.Token token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDeliveryOrdersByDate(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.DateModel dateModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object changeOrderStatus(int order_id, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrderStatus data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.OrderStatus> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editDeliveryData(@org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part img, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.auth.Driver> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBranchData(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.delivery.Delivery>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deliversOrdersCanceled(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrdersItem data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.OrdersItem> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGoogleLocationByLatLng(@org.jetbrains.annotations.NotNull()
    java.lang.String latlng, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.GoogleLocation> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editDeliveryPlaceId(@org.jetbrains.annotations.Nullable()
    java.lang.String admin_place_2, @org.jetbrains.annotations.Nullable()
    java.lang.String admin_place_3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.auth.Driver> continuation);
}