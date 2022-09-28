package com.codesroots.live.presentation.current_order_fragment.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u00a8\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052*\b\u0002\u0010\u0006\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00072*\b\u0002\u0010\r\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00072*\b\u0002\u0010\u000f\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u001aF\u0010\u0012\u001a\u00020\u00012(\u0010\u0013\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u001aF\u0010\u0015\u001a\u00020\u00012(\u0010\u0013\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u001aF\u0010\u0016\u001a\u00020\u00012(\u0010\u0013\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"mapIntentToViewState", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "intent", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "Datarepo", "Lcom/codesroots/live/repository/DataRepo;", "loadMainData", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "Lcom/codesroots/live/models/current_orders/CurrentOrderModel;", "", "GetPlaceId", "Lcom/codesroots/live/models/current_orders/GoogleLocation;", "EditDeliveryLocation", "Lcom/codesroots/live/models/auth/Driver;", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;Lcom/codesroots/live/repository/DataRepo;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedEditDelivery", "loadCart", "(Lkotlin/jvm/functions/Function1;Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "proceedWithGetPlaceId", "proceedWithInitialize", "app_debug"})
public final class MapFunctionKt {
    
    /**
     * this is the model function in MVI, it's responsibility is to convert intents into views states
     */
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object mapIntentToViewState(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent intent, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.repository.DataRepo Datarepo, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.current_orders.CurrentOrderModel>>>, ? extends java.lang.Object> loadMainData, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.current_orders.GoogleLocation>>>, ? extends java.lang.Object> GetPlaceId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.auth.Driver>>>, ? extends java.lang.Object> EditDeliveryLocation, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> continuation) {
        return null;
    }
    
    private static final java.lang.Object proceedWithInitialize(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.current_orders.CurrentOrderModel>>>, ? extends java.lang.Object> loadCart, com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent intent, kotlin.coroutines.Continuation<? super com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> continuation) {
        return null;
    }
    
    private static final java.lang.Object proceedEditDelivery(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.auth.Driver>>>, ? extends java.lang.Object> loadCart, com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent intent, kotlin.coroutines.Continuation<? super com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> continuation) {
        return null;
    }
    
    private static final java.lang.Object proceedWithGetPlaceId(kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<kotlin.Result<com.codesroots.live.models.current_orders.GoogleLocation>>>, ? extends java.lang.Object> loadCart, com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent intent, kotlin.coroutines.Continuation<? super com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState> continuation) {
        return null;
    }
}