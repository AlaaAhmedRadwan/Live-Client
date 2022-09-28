package com.codesroots.live.presentation.history_order_fragment.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\u000b\u001a`\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2:\b\u0002\u0010\u000f\u001a4\b\u0001\u0012&\u0012$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\nj\b\u0012\u0004\u0012\u00020\b`\u000b0\u00130\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u001aV\u0010\u0016\u001a\u00020\u000128\u0010\u0017\u001a4\b\u0001\u0012&\u0012$\u0012 \u0012\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\nj\b\u0012\u0004\u0012\u00020\b`\u000b0\u00130\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"filterDataByState", "Lcom/codesroots/live/presentation/history_order_fragment/mvi/MainViewState;", "intent", "Lcom/codesroots/live/presentation/history_order_fragment/mvi/MainIntent;", "order_status_id", "", "filterOrder", "", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "productArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mapIntentToViewState", "Datarepo", "Lcom/codesroots/live/repository/DataRepo;", "loadMainData", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "(Lcom/codesroots/live/presentation/history_order_fragment/mvi/MainIntent;Lcom/codesroots/live/repository/DataRepo;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithInitialize", "loadCart", "(Lkotlin/jvm/functions/Function1;Lcom/codesroots/live/presentation/history_order_fragment/mvi/MainIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class MapFunctionKt {
    
    /**
     * this is the model function in MVI, it's responsibility is to convert intents into views states
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object mapIntentToViewState(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.history_order_fragment.mvi.MainIntent intent, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.repository.DataRepo Datarepo, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem>>>>, ? extends java.lang.Object> loadMainData, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.presentation.history_order_fragment.mvi.MainViewState> continuation) {
        return null;
    }
    
    private static final java.lang.Object proceedWithInitialize(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem>>>>, ? extends java.lang.Object> loadCart, com.codesroots.live.presentation.history_order_fragment.mvi.MainIntent intent, kotlin.coroutines.Continuation<? super com.codesroots.live.presentation.history_order_fragment.mvi.MainViewState> continuation) {
        return null;
    }
    
    private static final com.codesroots.live.presentation.history_order_fragment.mvi.MainViewState filterDataByState(com.codesroots.live.presentation.history_order_fragment.mvi.MainIntent intent, int order_status_id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.codesroots.live.models.current_orders.OrdersItem> filterOrder(int order_status_id, @org.jetbrains.annotations.Nullable()
    java.util.ArrayList<com.codesroots.live.models.current_orders.OrdersItem> productArray) {
        return null;
    }
}