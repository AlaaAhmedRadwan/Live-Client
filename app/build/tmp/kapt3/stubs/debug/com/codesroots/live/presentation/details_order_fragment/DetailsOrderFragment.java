package com.codesroots.live.presentation.details_order_fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\u00020\u0001:\u0001.B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J\u0012\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0012\u0010%\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010-\u001a\u00020!H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006/"}, d2 = {"Lcom/codesroots/live/presentation/details_order_fragment/DetailsOrderFragment;", "Landroidx/fragment/app/DialogFragment;", "detailsOrderItems", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "(Lcom/codesroots/live/models/current_orders/OrdersItem;)V", "detailsOrderAdapter", "Lcom/codesroots/live/presentation/details_order_fragment/adapter/DetailsOrderAdapter;", "getDetailsOrderAdapter", "()Lcom/codesroots/live/presentation/details_order_fragment/adapter/DetailsOrderAdapter;", "setDetailsOrderAdapter", "(Lcom/codesroots/live/presentation/details_order_fragment/adapter/DetailsOrderAdapter;)V", "getDetailsOrderItems", "()Lcom/codesroots/live/models/current_orders/OrdersItem;", "setDetailsOrderItems", "orderPriceValue", "", "getOrderPriceValue", "()I", "setOrderPriceValue", "(I)V", "totalDeliveryCost", "getTotalDeliveryCost", "setTotalDeliveryCost", "totalPrice", "getTotalPrice", "setTotalPrice", "view", "Lcom/codesroots/live/databinding/DetailsOrderFragmentBinding;", "getView", "()Lcom/codesroots/live/databinding/DetailsOrderFragmentBinding;", "setView", "(Lcom/codesroots/live/databinding/DetailsOrderFragmentBinding;)V", "dailyOrderRecycleView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onResume", "Companion", "app_debug"})
public final class DetailsOrderFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private com.codesroots.live.models.current_orders.OrdersItem detailsOrderItems;
    @org.jetbrains.annotations.NotNull()
    public static final com.codesroots.live.presentation.details_order_fragment.DetailsOrderFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "TownBottomSheetDialogFragment";
    private int totalPrice = 0;
    private int orderPriceValue = 0;
    private int totalDeliveryCost = 0;
    public com.codesroots.live.presentation.details_order_fragment.adapter.DetailsOrderAdapter detailsOrderAdapter;
    public com.codesroots.live.databinding.DetailsOrderFragmentBinding view;
    private java.util.HashMap _$_findViewCache;
    
    @javax.inject.Inject()
    public DetailsOrderFragment(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrdersItem detailsOrderItems) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.models.current_orders.OrdersItem getDetailsOrderItems() {
        return null;
    }
    
    public final void setDetailsOrderItems(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.models.current_orders.OrdersItem p0) {
    }
    
    public final int getTotalPrice() {
        return 0;
    }
    
    public final void setTotalPrice(int p0) {
    }
    
    public final int getOrderPriceValue() {
        return 0;
    }
    
    public final void setOrderPriceValue(int p0) {
    }
    
    public final int getTotalDeliveryCost() {
        return 0;
    }
    
    public final void setTotalDeliveryCost(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.details_order_fragment.adapter.DetailsOrderAdapter getDetailsOrderAdapter() {
        return null;
    }
    
    public final void setDetailsOrderAdapter(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.details_order_fragment.adapter.DetailsOrderAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.databinding.DetailsOrderFragmentBinding getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.databinding.DetailsOrderFragmentBinding p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    public final void dailyOrderRecycleView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/codesroots/live/presentation/details_order_fragment/DetailsOrderFragment$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}