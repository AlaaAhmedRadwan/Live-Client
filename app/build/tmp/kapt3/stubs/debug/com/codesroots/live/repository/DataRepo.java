package com.codesroots.live.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J8\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J0\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\b2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J(\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\t0\b2\u0006\u0010\u0014\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018JH\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ/\u0010\u001f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"0\t0\b2\b\u0010#\u001a\u0004\u0018\u00010!\u00f8\u0001\u0000J/\u0010$\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00170 j\b\u0012\u0004\u0012\u00020\u0017`\"0\t0\b2\b\u0010#\u001a\u0004\u0018\u00010%\u00f8\u0001\u0000J0\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\'0\t0\b2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010+J$\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J0\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\b2\u0006\u00100\u001a\u00020\f2\u0006\u00101\u001a\u000202H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/codesroots/live/repository/DataRepo;", "", "Datasources", "Lcom/codesroots/live/repository/DataSource;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/codesroots/live/repository/DataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "EditDeliveryLocation", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/codesroots/live/models/auth/Driver;", "id", "", "admivstrative_area_2", "", "admivstrative_area_3", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "changeOrderStatus", "Lcom/codesroots/live/models/current_orders/OrderStatus;", "order_id", "data", "(ILcom/codesroots/live/models/current_orders/OrderStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deliversOrdersCanceled", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "(Lcom/codesroots/live/models/current_orders/OrdersItem;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editDeliveryData", "file", "Lokhttp3/MultipartBody$Part;", "name", "phone", "(Lokhttp3/MultipartBody$Part;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeliveris", "Ljava/util/ArrayList;", "Lcom/codesroots/live/models/delivery/DeliveryItem;", "Lkotlin/collections/ArrayList;", "dateModel", "getDeliveryOrdersByDate", "Lcom/codesroots/live/models/current_orders/DateModel;", "getGoogleLocationByLatLng", "Lcom/codesroots/live/models/current_orders/GoogleLocation;", "lat", "", "lng", "(DDLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrders", "Lcom/codesroots/live/models/current_orders/CurrentOrderModel;", "(Ljava/lang/Integer;)Lkotlinx/coroutines/flow/Flow;", "updateUserToken", "userId", "token", "Lcom/satafood/core/entities/token/Token;", "(ILcom/satafood/core/entities/token/Token;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class DataRepo {
    private final com.codesroots.live.repository.DataSource Datasources = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject()
    public DataRepo(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.repository.DataSource Datasources, @org.jetbrains.annotations.NotNull()
    @com.codesroots.live.di.IoDispatcher()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.current_orders.CurrentOrderModel>> getOrders(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>>> getDeliveris(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.delivery.DeliveryItem dateModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<kotlin.Result<java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem>>> getDeliveryOrdersByDate(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.DateModel dateModel) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object changeOrderStatus(int order_id, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrderStatus data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.current_orders.OrderStatus>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUserToken(int userId, @org.jetbrains.annotations.NotNull()
    com.satafood.core.entities.token.Token token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<java.lang.Integer>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deliversOrdersCanceled(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrdersItem data, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.current_orders.OrdersItem>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object editDeliveryData(@org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.auth.Driver>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getGoogleLocationByLatLng(double lat, double lng, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.current_orders.GoogleLocation>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object EditDeliveryLocation(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String admivstrative_area_2, @org.jetbrains.annotations.NotNull()
    java.lang.String admivstrative_area_3, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.auth.Driver>>> continuation) {
        return null;
    }
}