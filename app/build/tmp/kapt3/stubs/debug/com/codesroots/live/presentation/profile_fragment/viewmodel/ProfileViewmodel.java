package com.codesroots.live.presentation.profile_fragment.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J3\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#\u00a2\u0006\u0002\u0010%J\u000e\u0010&\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u001fJ\b\u0010(\u001a\u00020\u001dH\u0014J\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020#H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\tX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\f\u00a8\u0006+"}, d2 = {"Lcom/codesroots/live/presentation/profile_fragment/viewmodel/ProfileViewmodel;", "Lcom/codesroots/live/helper/BaseViewModel;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "DateRepoCompnay", "Lcom/codesroots/live/repository/DataRepo;", "Datasources", "Lcom/codesroots/live/repository/RemoteDataSource;", "(Lcom/codesroots/live/repository/DataRepo;Lcom/codesroots/live/repository/RemoteDataSource;)V", "DriverState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/codesroots/live/models/auth/Driver;", "getDriverState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "changeDriveruiState", "getChangeDriveruiState", "deliveryItemLD", "Landroidx/lifecycle/MutableLiveData;", "Lcom/codesroots/live/models/delivery/Delivery;", "getDeliveryItemLD", "()Landroidx/lifecycle/MutableLiveData;", "setDeliveryItemLD", "(Landroidx/lifecycle/MutableLiveData;)V", "job", "Lkotlinx/coroutines/Job;", "state", "getState", "uiState", "getUiState", "editDeliveryData", "", "id", "", "file", "Lokhttp3/MultipartBody$Part;", "name", "", "phone", "(Ljava/lang/Integer;Lokhttp3/MultipartBody$Part;Ljava/lang/String;Ljava/lang/String;)V", "getBranchData", "Id", "onCleared", "onError", "message", "app_debug"})
public final class ProfileViewmodel extends com.codesroots.live.helper.BaseViewModel<com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> {
    private final com.codesroots.live.repository.DataRepo DateRepoCompnay = null;
    private final com.codesroots.live.repository.RemoteDataSource Datasources = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> uiState = null;
    private kotlinx.coroutines.Job job;
    @org.jetbrains.annotations.Nullable()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.models.auth.Driver> changeDriveruiState = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.codesroots.live.models.delivery.Delivery> deliveryItemLD;
    
    @javax.inject.Inject()
    public ProfileViewmodel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.repository.DataRepo DateRepoCompnay, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.repository.RemoteDataSource Datasources) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.models.auth.Driver> getChangeDriveruiState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.models.auth.Driver> getDriverState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.codesroots.live.models.delivery.Delivery> getDeliveryItemLD() {
        return null;
    }
    
    public final void setDeliveryItemLD(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.codesroots.live.models.delivery.Delivery> p0) {
    }
    
    public final void editDeliveryData(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    okhttp3.MultipartBody.Part file, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String phone) {
    }
    
    public final void getBranchData(int Id) {
    }
    
    private final void onError(java.lang.String message) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}