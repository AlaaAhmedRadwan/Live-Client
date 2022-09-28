package com.codesroots.live.datalayer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ%\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\n2\b\b\u0001\u0010\u0012\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00152\b\b\u0001\u0010\u0012\u001a\u00020\u0015H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J9\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\u00192\b\b\u0001\u0010\u001a\u001a\u00020\f2\b\b\u0001\u0010\u001b\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00032\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u00020!2\b\b\u0001\u0010\t\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ-\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020$0#j\b\u0012\u0004\u0012\u00020$`%2\n\b\u0001\u0010&\u001a\u0004\u0018\u00010$H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J-\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u00150#j\b\u0012\u0004\u0012\u00020\u0015`%2\n\b\u0001\u0010)\u001a\u0004\u0018\u00010*H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J9\u0010,\u001a\u00020-2\b\b\u0003\u0010.\u001a\u00020\f2\b\b\u0001\u0010/\u001a\u00020\f2\b\b\u0003\u00100\u001a\u00020\f2\b\b\u0003\u00101\u001a\u00020\fH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00102J#\u00103\u001a\b\u0012\u0004\u0012\u0002040\u00032\n\b\u0001\u00105\u001a\u0004\u0018\u000106H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00107J#\u00108\u001a\b\u0012\u0004\u0012\u0002040\u00032\n\b\u0001\u00109\u001a\u0004\u0018\u000104H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J#\u0010;\u001a\b\u0012\u0004\u0012\u0002040\u00032\n\b\u0001\u00109\u001a\u0004\u0018\u000104H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010:J%\u0010<\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010=\u001a\u00020>H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010?\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006@"}, d2 = {"Lcom/codesroots/live/datalayer/APIServices;", "", "AddOrder", "Lretrofit2/Response;", "Lcom/codesroots/live/models/ordermodel/OrderModel;", "orderModel", "(Lcom/codesroots/live/models/ordermodel/OrderModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeDeliveryPlaceId", "Lcom/codesroots/live/models/auth/Driver;", "id", "", "admivstrative_area_2", "", "admivstrative_area_3", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeOrderStatus", "Lcom/codesroots/live/models/current_orders/OrderStatus;", "orderId", "data", "(ILcom/codesroots/live/models/current_orders/OrderStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deliversOrdersCanceled", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "(Lcom/codesroots/live/models/current_orders/OrdersItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editDeliveryData", "img", "Lokhttp3/MultipartBody$Part;", "name", "phone", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBranchData", "Lcom/codesroots/live/models/delivery/Delivery;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCurrentOrders", "Lcom/codesroots/live/models/current_orders/CurrentOrderModel;", "getDeliveris", "Ljava/util/ArrayList;", "Lcom/codesroots/live/models/delivery/DeliveryItem;", "Lkotlin/collections/ArrayList;", "delivery", "(Lcom/codesroots/live/models/delivery/DeliveryItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeliveryOrdersByDate", "dateModel", "Lcom/codesroots/live/models/current_orders/DateModel;", "(Lcom/codesroots/live/models/current_orders/DateModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocationByLatLng", "Lcom/codesroots/live/models/current_orders/GoogleLocation;", "url", "latlng", "apiKey", "result_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/codesroots/live/models/auth/AuthModel;", "loginModel", "Lcom/codesroots/live/models/auth/User;", "(Lcom/codesroots/live/models/auth/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerToken", "user", "(Lcom/codesroots/live/models/auth/AuthModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendNotificationToDevice", "updateUserToken", "token", "Lcom/satafood/core/entities/token/Token;", "(ILcom/satafood/core/entities/token/Token;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface APIServices {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "login")
    public abstract java.lang.Object login(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.codesroots.live.models.auth.User loginModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.auth.AuthModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "delivers/indexForBranch")
    public abstract java.lang.Object getDeliveris(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.codesroots.live.models.delivery.DeliveryItem delivery, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "users/registerToken")
    public abstract java.lang.Object registerToken(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.codesroots.live.models.auth.AuthModel user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.auth.AuthModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "notification/sendToDevice")
    public abstract java.lang.Object sendNotificationToDevice(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.codesroots.live.models.auth.AuthModel user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.auth.AuthModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Headers(value = {"Accept: Application/json", "cache-control: no-cache"})
    @retrofit2.http.POST(value = "Orders/add")
    public abstract java.lang.Object AddOrder(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.codesroots.live.models.ordermodel.OrderModel orderModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.ordermodel.OrderModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "users/edituser/{id}")
    public abstract java.lang.Object updateUserToken(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.satafood.core.entities.token.Token token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "orders/currentorders/{id}/0")
    public abstract java.lang.Object getCurrentOrders(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.CurrentOrderModel> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "branches/view/{branchId}")
    public abstract java.lang.Object getBranchData(@retrofit2.http.Path(value = "branchId")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.codesroots.live.models.delivery.Delivery>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "orders/GetBranchOrdersByDate")
    public abstract java.lang.Object getDeliveryOrdersByDate(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Body()
    com.codesroots.live.models.current_orders.DateModel dateModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "orders/edit/{order_id}")
    public abstract java.lang.Object changeOrderStatus(@retrofit2.http.Path(value = "order_id")
    int orderId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.codesroots.live.models.current_orders.OrderStatus data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.OrderStatus> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "deliversOrdersCanceled/add")
    public abstract java.lang.Object deliversOrdersCanceled(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.codesroots.live.models.current_orders.OrdersItem data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.OrdersItem> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "delivers/edit/{id}")
    @retrofit2.http.Multipart()
    public abstract java.lang.Object editDeliveryData(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part()
    okhttp3.MultipartBody.Part img, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "name")
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Part(value = "mobile")
    java.lang.String phone, @retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.auth.Driver> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "delivers/edit/{id}")
    @retrofit2.http.FormUrlEncoded()
    public abstract java.lang.Object changeDeliveryPlaceId(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "admivstrative_area_2")
    java.lang.String admivstrative_area_2, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "admivstrative_area_3")
    java.lang.String admivstrative_area_3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.auth.Driver> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    public abstract java.lang.Object getLocationByLatLng(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "latlng")
    java.lang.String latlng, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "key")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "result_type")
    java.lang.String result_type, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.models.current_orders.GoogleLocation> continuation);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 3)
    public final class DefaultImpls {
    }
}