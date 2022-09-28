package com.codesroots.live.presentation.history_order_fragment.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000eX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/codesroots/live/presentation/history_order_fragment/mvi/HistoryOrderViewmodel;", "Lcom/codesroots/live/helper/BaseViewModel;", "Lcom/codesroots/live/presentation/history_order_fragment/mvi/MainViewState;", "DateRepoCompnay", "Lcom/codesroots/live/repository/DataRepo;", "(Lcom/codesroots/live/repository/DataRepo;)V", "intents", "Lkotlinx/coroutines/channels/Channel;", "Lcom/codesroots/live/presentation/history_order_fragment/mvi/MainIntent;", "getIntents", "()Lkotlinx/coroutines/channels/Channel;", "job", "Lkotlinx/coroutines/Job;", "state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "uiState", "getUiState", "getIntent", "", "onCleared", "app_debug"})
public final class HistoryOrderViewmodel extends com.codesroots.live.helper.BaseViewModel<com.codesroots.live.presentation.history_order_fragment.mvi.MainViewState> {
    private final com.codesroots.live.repository.DataRepo DateRepoCompnay = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.channels.Channel<com.codesroots.live.presentation.history_order_fragment.mvi.MainIntent> intents = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.presentation.history_order_fragment.mvi.MainViewState> uiState = null;
    private kotlinx.coroutines.Job job;
    
    @javax.inject.Inject()
    public HistoryOrderViewmodel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.repository.DataRepo DateRepoCompnay) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.channels.Channel<com.codesroots.live.presentation.history_order_fragment.mvi.MainIntent> getIntents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.presentation.history_order_fragment.mvi.MainViewState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.codesroots.live.presentation.history_order_fragment.mvi.MainViewState> getState() {
        return null;
    }
    
    public final void getIntent() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}