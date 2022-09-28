package com.codesroots.live.presentation.current_order_fragment.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001+B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\u001c\u0010\"\u001a\u00020#2\n\u0010$\u001a\u00060\u0003R\u00020\u00002\u0006\u0010%\u001a\u00020&H\u0016J\u001c\u0010\'\u001a\u00060\u0003R\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020&H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u0006,"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/adapter/CurrentOrdersAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "Lcom/codesroots/live/presentation/current_order_fragment/adapter/CurrentOrdersAdapter$MenuViewHolder;", "Intent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "context", "Landroid/content/Context;", "fragment", "Landroidx/fragment/app/DialogFragment;", "viewModel", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "(Lkotlinx/coroutines/channels/Channel;Landroid/content/Context;Landroidx/fragment/app/DialogFragment;Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;)V", "getIntent", "()Lkotlinx/coroutines/channels/Channel;", "setIntent", "(Lkotlinx/coroutines/channels/Channel;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getFragment", "()Landroidx/fragment/app/DialogFragment;", "setFragment", "(Landroidx/fragment/app/DialogFragment;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "getViewModel", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "setViewModel", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "p0", "Landroid/view/ViewGroup;", "p1", "MenuViewHolder", "app_debug"})
public final class CurrentOrdersAdapter extends androidx.recyclerview.widget.ListAdapter<com.codesroots.live.models.current_orders.OrdersItem, com.codesroots.live.presentation.current_order_fragment.adapter.CurrentOrdersAdapter.MenuViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.channels.Channel<com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent> Intent;
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private androidx.fragment.app.DialogFragment fragment;
    @org.jetbrains.annotations.NotNull()
    private com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    public CurrentOrdersAdapter(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.channels.Channel<com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent> Intent, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment fragment, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel viewModel) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.channels.Channel<com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent> getIntent() {
        return null;
    }
    
    public final void setIntent(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.channels.Channel<com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.DialogFragment getFragment() {
        return null;
    }
    
    public final void setFragment(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.DialogFragment p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.current_order_fragment.adapter.CurrentOrdersAdapter.MenuViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codesroots.live.presentation.current_order_fragment.adapter.CurrentOrdersAdapter.MenuViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/adapter/CurrentOrdersAdapter$MenuViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/codesroots/live/databinding/CurrentOrdersAdapterBinding;", "(Lcom/codesroots/live/presentation/current_order_fragment/adapter/CurrentOrdersAdapter;Lcom/codesroots/live/databinding/CurrentOrdersAdapterBinding;)V", "getBinding", "()Lcom/codesroots/live/databinding/CurrentOrdersAdapterBinding;", "bind", "", "context", "Landroid/content/Context;", "viewModel", "Lkotlinx/coroutines/channels/Channel;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "data", "Lcom/codesroots/live/models/current_orders/OrdersItem;", "app_debug"})
    public final class MenuViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.codesroots.live.databinding.CurrentOrdersAdapterBinding binding = null;
        
        public MenuViewHolder(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.databinding.CurrentOrdersAdapterBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.databinding.CurrentOrdersAdapterBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.Nullable()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlinx.coroutines.channels.Channel<com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent> viewModel, @org.jetbrains.annotations.NotNull()
        com.codesroots.live.models.current_orders.OrdersItem data) {
        }
    }
}