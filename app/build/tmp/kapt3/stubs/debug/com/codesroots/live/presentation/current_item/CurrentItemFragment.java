package com.codesroots.live.presentation.current_item;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0001/B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u0014\u0010\"\u001a\u00020!2\n\b\u0001\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010&\u001a\u00020\'2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J$\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010.\u001a\u00020!H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00060"}, d2 = {"Lcom/codesroots/live/presentation/current_item/CurrentItemFragment;", "Landroidx/fragment/app/DialogFragment;", "item", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "(Lcom/codesroots/live/models/current_orders/OrdersItem;)V", "getItem", "()Lcom/codesroots/live/models/current_orders/OrdersItem;", "setItem", "pref", "Lcom/codesroots/live/helper/PreferenceHelper;", "getPref", "()Lcom/codesroots/live/helper/PreferenceHelper;", "setPref", "(Lcom/codesroots/live/helper/PreferenceHelper;)V", "view", "Lcom/codesroots/live/databinding/CurrentItemBinding;", "getView", "()Lcom/codesroots/live/databinding/CurrentItemBinding;", "setView", "(Lcom/codesroots/live/databinding/CurrentItemBinding;)V", "viewModel", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "getViewModel", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "confirmRequest", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "Companion", "app_debug"})
public final class CurrentItemFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private com.codesroots.live.models.current_orders.OrdersItem item;
    @org.jetbrains.annotations.NotNull()
    public static final com.codesroots.live.presentation.current_item.CurrentItemFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TownBottomSheetDialogFragment";
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject()
    public com.codesroots.live.helper.PreferenceHelper pref;
    public com.codesroots.live.databinding.CurrentItemBinding view;
    private java.util.HashMap _$_findViewCache;
    
    @javax.inject.Inject()
    public CurrentItemFragment(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrdersItem item) {
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
    public final com.codesroots.live.helper.PreferenceHelper getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.helper.PreferenceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.databinding.CurrentItemBinding getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.databinding.CurrentItemBinding p0) {
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
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    public final void confirmRequest() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/codesroots/live/presentation/current_item/CurrentItemFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}