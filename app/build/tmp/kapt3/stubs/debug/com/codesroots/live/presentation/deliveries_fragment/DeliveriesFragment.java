package com.codesroots.live.presentation.deliveries_fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 =2\u00020\u0001:\u0001=B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0012\u00103\u001a\u0002042\b\u00101\u001a\u0004\u0018\u000102H\u0016J$\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010;\u001a\u000200H\u0016J\b\u0010<\u001a\u000200H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00020$8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\'\u0010(\u001a\u0004\b%\u0010&R\u001e\u0010)\u001a\u00020*8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.\u00a8\u0006>"}, d2 = {"Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "data", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "getData", "()Lcom/codesroots/live/models/current_orders/OrdersItem;", "setData", "(Lcom/codesroots/live/models/current_orders/OrdersItem;)V", "deliveriesAdapter", "Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesAdapter;", "getDeliveriesAdapter", "()Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesAdapter;", "setDeliveriesAdapter", "(Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesAdapter;)V", "mainHandler", "Landroid/os/Handler;", "getMainHandler", "()Landroid/os/Handler;", "setMainHandler", "(Landroid/os/Handler;)V", "pref", "Lcom/codesroots/live/helper/PreferenceHelper;", "getPref", "()Lcom/codesroots/live/helper/PreferenceHelper;", "setPref", "(Lcom/codesroots/live/helper/PreferenceHelper;)V", "updateTextTask", "Ljava/lang/Runnable;", "view", "Lcom/codesroots/live/databinding/DeliveriesFragmentBinding;", "getView", "()Lcom/codesroots/live/databinding/DeliveriesFragmentBinding;", "setView", "(Lcom/codesroots/live/databinding/DeliveriesFragmentBinding;)V", "viewModel", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "getViewModel", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onPause", "onResume", "Companion", "app_debug"})
public final class DeliveriesFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    public static final com.codesroots.live.presentation.deliveries_fragment.DeliveriesFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TownBottomSheetDialogFragment";
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private com.codesroots.live.models.current_orders.OrdersItem data;
    public com.codesroots.live.presentation.deliveries_fragment.DeliveriesAdapter deliveriesAdapter;
    @javax.inject.Inject()
    public com.codesroots.live.helper.PreferenceHelper pref;
    public com.codesroots.live.databinding.DeliveriesFragmentBinding view;
    public android.os.Handler mainHandler;
    private final java.lang.Runnable updateTextTask = null;
    private java.util.HashMap _$_findViewCache;
    
    @javax.inject.Inject()
    public DeliveriesFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.models.current_orders.OrdersItem getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrdersItem p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.deliveries_fragment.DeliveriesAdapter getDeliveriesAdapter() {
        return null;
    }
    
    public final void setDeliveriesAdapter(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.deliveries_fragment.DeliveriesAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.helper.PreferenceHelper getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.helper.PreferenceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.databinding.DeliveriesFragmentBinding getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.databinding.DeliveriesFragmentBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.os.Handler getMainHandler() {
        return null;
    }
    
    public final void setMainHandler(@org.jetbrains.annotations.NotNull()
    android.os.Handler p0) {
    }
    
    @java.lang.Override()
    public void onPause() {
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
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}