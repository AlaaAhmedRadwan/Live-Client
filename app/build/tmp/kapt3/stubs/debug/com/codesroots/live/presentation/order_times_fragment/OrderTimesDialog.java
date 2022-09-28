package com.codesroots.live.presentation.order_times_fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB-\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016J\u0012\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\bH\u0016R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u000b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2 = {"Lcom/codesroots/live/presentation/order_times_fragment/OrderTimesDialog;", "Landroid/app/Dialog;", "context", "Landroid/content/Context;", "themeResId", "", "onItemClick", "Lkotlin/Function1;", "", "(Landroid/content/Context;ILkotlin/jvm/functions/Function1;)V", "_binding", "Lcom/codesroots/live/databinding/LayoutDialogOrderTimeBinding;", "binding", "getBinding", "()Lcom/codesroots/live/databinding/LayoutDialogOrderTimeBinding;", "orderTimesAdapter", "Lcom/codesroots/live/presentation/order_times_fragment/OrderTimesAdapter;", "getOrderTimesAdapter", "()Lcom/codesroots/live/presentation/order_times_fragment/OrderTimesAdapter;", "setOrderTimesAdapter", "(Lcom/codesroots/live/presentation/order_times_fragment/OrderTimesAdapter;)V", "getOrderTimes", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDetachedFromWindow", "Companion", "app_debug"})
public final class OrderTimesDialog extends android.app.Dialog {
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onItemClick = null;
    private com.codesroots.live.databinding.LayoutDialogOrderTimeBinding _binding;
    public com.codesroots.live.presentation.order_times_fragment.OrderTimesAdapter orderTimesAdapter;
    @org.jetbrains.annotations.NotNull()
    public static final com.codesroots.live.presentation.order_times_fragment.OrderTimesDialog.Companion Companion = null;
    private static com.codesroots.live.presentation.order_times_fragment.OrderTimesDialog loadingProgressBarDialog;
    
    private OrderTimesDialog(android.content.Context context, int themeResId, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick) {
        super(null);
    }
    
    private final com.codesroots.live.databinding.LayoutDialogOrderTimeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.order_times_fragment.OrderTimesAdapter getOrderTimesAdapter() {
        return null;
    }
    
    public final void setOrderTimesAdapter(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.order_times_fragment.OrderTimesAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getOrderTimes() {
        return null;
    }
    
    @java.lang.Override()
    public void onDetachedFromWindow() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/codesroots/live/presentation/order_times_fragment/OrderTimesDialog$Companion;", "", "()V", "loadingProgressBarDialog", "Lcom/codesroots/live/presentation/order_times_fragment/OrderTimesDialog;", "getInstance", "context", "Landroid/content/Context;", "onItemClick", "Lkotlin/Function1;", "", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @android.annotation.SuppressLint(value = {"ResourceAsColor"})
        public final com.codesroots.live.presentation.order_times_fragment.OrderTimesDialog getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onItemClick) {
            return null;
        }
    }
}