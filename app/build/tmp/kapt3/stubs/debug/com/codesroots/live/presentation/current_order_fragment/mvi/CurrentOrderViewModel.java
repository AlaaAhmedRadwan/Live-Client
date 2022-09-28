package com.codesroots.live.presentation.current_order_fragment.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020A2\u0006\u0010I\u001a\u00020\u0011J\u000e\u0010J\u001a\u00020G2\u0006\u0010H\u001a\u00020AJ\u000e\u0010K\u001a\u00020G2\u0006\u0010I\u001a\u00020 J\u0006\u0010L\u001a\u00020GJ\u001f\u0010M\u001a\u00020G2\b\u0010N\u001a\u0004\u0018\u0001082\b\u0010O\u001a\u0004\u0018\u000108\u00a2\u0006\u0002\u0010PJ\b\u0010Q\u001a\u00020GH\u0014J\u0010\u0010R\u001a\u00020G2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010U\u001a\u00020G2\b\u0010V\u001a\u0004\u0018\u00010\u0017J\u0010\u0010W\u001a\u00020G2\b\u0010V\u001a\u0004\u0018\u00010\u0017J\u0016\u0010X\u001a\u00020G2\u0006\u0010Y\u001a\u00020A2\u0006\u0010Z\u001a\u00020[R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0013\"\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015R)\u0010#\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `$\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010\fR\"\u0010&\u001a\n\u0012\u0004\u0012\u00020\'\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0013\"\u0004\b)\u0010\u0015R\u0019\u0010*\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b+\u0010\fR,\u0010,\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `$\u0018\u00010\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\fR\u001c\u0010.\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\fR\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020201\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u00107\u001a\b\u0012\u0004\u0012\u0002080\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0013\"\u0004\b:\u0010\u0015R \u0010;\u001a\b\u0012\u0004\u0012\u0002080\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u0013\"\u0004\b=\u0010\u0015R\u0019\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b?\u0010\fR\"\u0010@\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0013\"\u0004\bC\u0010\u0015R\u001c\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010\f\u00a8\u0006\\"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "Lcom/codesroots/live/helper/BaseViewModel;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "DateRepoCompnay", "Lcom/codesroots/live/repository/DataRepo;", "Datasources", "Lcom/codesroots/live/repository/RemoteDataSource;", "(Lcom/codesroots/live/repository/DataRepo;Lcom/codesroots/live/repository/RemoteDataSource;)V", "ChangeStatusuiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "getChangeStatusuiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "OrderState", "getOrderState", "OrderStateLD", "Landroidx/lifecycle/MutableLiveData;", "Lcom/codesroots/live/models/current_orders/OrderStatus;", "getOrderStateLD", "()Landroidx/lifecycle/MutableLiveData;", "setOrderStateLD", "(Landroidx/lifecycle/MutableLiveData;)V", "authLD", "Lcom/codesroots/live/models/auth/AuthModel;", "getAuthLD", "setAuthLD", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getCoroutineExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "deliveriesDataLD", "Ljava/util/ArrayList;", "Lcom/codesroots/live/models/delivery/DeliveryItem;", "getDeliveriesDataLD", "setDeliveriesDataLD", "deliveriesState", "Lkotlin/collections/ArrayList;", "getDeliveriesState", "deliveryItemLD", "Lcom/codesroots/live/models/delivery/Delivery;", "getDeliveryItemLD", "setDeliveryItemLD", "deliveryState", "getDeliveryState", "getDeliveriesData", "getGetDeliveriesData", "getStatusState", "getGetStatusState", "intents", "Lkotlinx/coroutines/channels/Channel;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "getIntents", "()Lkotlinx/coroutines/channels/Channel;", "job", "Lkotlinx/coroutines/Job;", "mclientLatitude", "", "getMclientLatitude", "setMclientLatitude", "mclientLongitude", "getMclientLongitude", "setMclientLongitude", "state", "getState", "tokenLD", "", "getTokenLD", "setTokenLD", "uiState", "getUiState", "changeOrderStatus", "", "Id", "data", "getBranchData", "getDeliveris", "getIntent", "getLatLong", "latitude", "longitude", "(Ljava/lang/Double;Ljava/lang/Double;)V", "onCleared", "onError", "message", "", "registerToken", "loginModel", "sendNotificationToDevice", "updateUserToken", "userId", "token", "Lcom/satafood/core/entities/token/Token;", "app_debug"})
public final class CurrentOrderViewModel extends com.codesroots.live.helper.BaseViewModel<com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> {
    private final com.codesroots.live.repository.DataRepo DateRepoCompnay = null;
    private final com.codesroots.live.repository.RemoteDataSource Datasources = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.channels.Channel<com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent> intents = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> uiState = null;
    private kotlinx.coroutines.Job job;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> mclientLatitude;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Double> mclientLongitude;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.models.current_orders.OrdersItem> ChangeStatusuiState = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.codesroots.live.models.delivery.Delivery> deliveryItemLD;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>> deliveriesDataLD;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.codesroots.live.models.current_orders.OrderStatus> OrderStateLD;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<java.lang.Integer> tokenLD;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.codesroots.live.models.auth.AuthModel> authLD;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.models.delivery.DeliveryItem> getStatusState = null;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>> getDeliveriesData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = null;
    
    @javax.inject.Inject()
    public CurrentOrderViewModel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.repository.DataRepo DateRepoCompnay, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.repository.RemoteDataSource Datasources) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.channels.Channel<com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent> getIntents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getMclientLatitude() {
        return null;
    }
    
    public final void setMclientLatitude(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Double> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Double> getMclientLongitude() {
        return null;
    }
    
    public final void setMclientLongitude(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Double> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.models.current_orders.OrdersItem> getChangeStatusuiState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.models.current_orders.OrdersItem> getOrderState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.codesroots.live.models.delivery.Delivery> getDeliveryItemLD() {
        return null;
    }
    
    public final void setDeliveryItemLD(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.codesroots.live.models.delivery.Delivery> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>> getDeliveriesDataLD() {
        return null;
    }
    
    public final void setDeliveriesDataLD(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.codesroots.live.models.current_orders.OrderStatus> getOrderStateLD() {
        return null;
    }
    
    public final void setOrderStateLD(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.codesroots.live.models.current_orders.OrderStatus> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getTokenLD() {
        return null;
    }
    
    public final void setTokenLD(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.codesroots.live.models.auth.AuthModel> getAuthLD() {
        return null;
    }
    
    public final void setAuthLD(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.codesroots.live.models.auth.AuthModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.models.delivery.DeliveryItem> getGetStatusState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.models.delivery.DeliveryItem> getDeliveryState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlinx.coroutines.flow.MutableStateFlow<java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>> getGetDeliveriesData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem>> getDeliveriesState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineExceptionHandler getCoroutineExceptionHandler() {
        return null;
    }
    
    public final void getIntent() {
    }
    
    public final void getLatLong(@org.jetbrains.annotations.Nullable()
    java.lang.Double latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double longitude) {
    }
    
    public final void changeOrderStatus(int Id, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrderStatus data) {
    }
    
    public final void updateUserToken(int userId, @org.jetbrains.annotations.NotNull()
    com.satafood.core.entities.token.Token token) {
    }
    
    public final void getDeliveris(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.delivery.DeliveryItem data) {
    }
    
    public final void getBranchData(int Id) {
    }
    
    public final void registerToken(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.auth.AuthModel loginModel) {
    }
    
    public final void sendNotificationToDevice(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.auth.AuthModel loginModel) {
    }
    
    private final void onError(java.lang.String message) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}