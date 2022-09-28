package com.codesroots.live.presentation.deliveries_fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\""}, d2 = {"Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesAdapter$CustomViewHolders;", "context", "Landroid/content/Context;", "data", "Ljava/util/ArrayList;", "Lcom/codesroots/live/models/delivery/DeliveryItem;", "Lkotlin/collections/ArrayList;", "frag", "Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesFragment;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesFragment;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "getFrag", "()Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesFragment;", "setFrag", "(Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesFragment;)V", "getItemCount", "", "onBindViewHolder", "", "p0", "position", "onCreateViewHolder", "Landroid/view/ViewGroup;", "p1", "CustomViewHolders", "app_debug"})
public final class DeliveriesAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.codesroots.live.presentation.deliveries_fragment.DeliveriesAdapter.CustomViewHolders> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem> data;
    @org.jetbrains.annotations.NotNull()
    private com.codesroots.live.presentation.deliveries_fragment.DeliveriesFragment frag;
    
    public DeliveriesAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem> data, @org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.deliveries_fragment.DeliveriesFragment frag) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem> getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.codesroots.live.models.delivery.DeliveryItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.deliveries_fragment.DeliveriesFragment getFrag() {
        return null;
    }
    
    public final void setFrag(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.deliveries_fragment.DeliveriesFragment p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.deliveries_fragment.DeliveriesAdapter.CustomViewHolders p0, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.codesroots.live.presentation.deliveries_fragment.DeliveriesAdapter.CustomViewHolders onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u001e\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0015"}, d2 = {"Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesAdapter$CustomViewHolders;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/codesroots/live/databinding/DeliveryItemBinding;", "(Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesAdapter;Lcom/codesroots/live/databinding/DeliveryItemBinding;)V", "getBinding", "()Lcom/codesroots/live/databinding/DeliveryItemBinding;", "setBinding", "(Lcom/codesroots/live/databinding/DeliveryItemBinding;)V", "bind", "", "data", "Lcom/codesroots/live/models/delivery/DeliveryItem;", "context", "Landroid/content/Context;", "sendNotificationToDevice", "user_id", "", "title", "", "message", "app_debug"})
    public final class CustomViewHolders extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private com.codesroots.live.databinding.DeliveryItemBinding binding;
        
        public CustomViewHolders(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.databinding.DeliveryItemBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.databinding.DeliveryItemBinding getBinding() {
            return null;
        }
        
        public final void setBinding(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.databinding.DeliveryItemBinding p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.models.delivery.DeliveryItem data, @org.jetbrains.annotations.Nullable()
        android.content.Context context) {
        }
        
        public final void sendNotificationToDevice(int user_id, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
    }
}