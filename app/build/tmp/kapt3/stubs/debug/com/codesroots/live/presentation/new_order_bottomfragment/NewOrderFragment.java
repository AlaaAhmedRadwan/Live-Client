package com.codesroots.live.presentation.new_order_bottomfragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010-\u001a\u00020.J\u0012\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0012\u00102\u001a\u0002032\b\u00100\u001a\u0004\u0018\u000101H\u0016J$\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u0010:\u001a\u00020.H\u0016J\u0010\u0010;\u001a\u00020.2\u0006\u0010<\u001a\u00020=H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020(8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006>"}, d2 = {"Lcom/codesroots/live/presentation/new_order_bottomfragment/NewOrderFragment;", "Landroidx/fragment/app/DialogFragment;", "item", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "viewModel", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "(Lcom/codesroots/live/models/current_orders/OrdersItem;Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;)V", "getItem", "()Lcom/codesroots/live/models/current_orders/OrdersItem;", "setItem", "(Lcom/codesroots/live/models/current_orders/OrdersItem;)V", "mSocket", "Lcom/github/nkzawa/socketio/client/Socket;", "getMSocket", "()Lcom/github/nkzawa/socketio/client/Socket;", "setMSocket", "(Lcom/github/nkzawa/socketio/client/Socket;)V", "orderTimesDialog", "Lcom/codesroots/live/presentation/order_times_fragment/OrderTimesDialog;", "getOrderTimesDialog", "()Lcom/codesroots/live/presentation/order_times_fragment/OrderTimesDialog;", "setOrderTimesDialog", "(Lcom/codesroots/live/presentation/order_times_fragment/OrderTimesDialog;)V", "pref", "Lcom/codesroots/live/helper/PreferenceHelper;", "getPref", "()Lcom/codesroots/live/helper/PreferenceHelper;", "setPref", "(Lcom/codesroots/live/helper/PreferenceHelper;)V", "view", "Lcom/codesroots/live/databinding/NeworderFragmentBinding;", "getView", "()Lcom/codesroots/live/databinding/NeworderFragmentBinding;", "setView", "(Lcom/codesroots/live/databinding/NeworderFragmentBinding;)V", "getViewModel", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "setViewModel", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;)V", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "cancelRequest", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "showOrderTimesDialog", "context", "Landroid/content/Context;", "app_debug"})
public final class NewOrderFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private com.codesroots.live.models.current_orders.OrdersItem item;
    @org.jetbrains.annotations.NotNull()
    private com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel viewModel;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.Nullable()
    private com.github.nkzawa.socketio.client.Socket mSocket;
    public com.codesroots.live.presentation.order_times_fragment.OrderTimesDialog orderTimesDialog;
    @javax.inject.Inject()
    public com.codesroots.live.helper.PreferenceHelper pref;
    public com.codesroots.live.databinding.NeworderFragmentBinding view;
    private java.util.HashMap _$_findViewCache;
    
    @javax.inject.Inject()
    public NewOrderFragment(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrdersItem item, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel viewModel) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.models.current_orders.OrdersItem getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrdersItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.github.nkzawa.socketio.client.Socket getMSocket() {
        return null;
    }
    
    public final void setMSocket(@org.jetbrains.annotations.Nullable()
    com.github.nkzawa.socketio.client.Socket p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.order_times_fragment.OrderTimesDialog getOrderTimesDialog() {
        return null;
    }
    
    public final void setOrderTimesDialog(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.order_times_fragment.OrderTimesDialog p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.helper.PreferenceHelper getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.helper.PreferenceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.databinding.NeworderFragmentBinding getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.databinding.NeworderFragmentBinding p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void cancelRequest() {
    }
    
    private final void showOrderTimesDialog(android.content.Context context) {
    }
}