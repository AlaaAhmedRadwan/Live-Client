package com.codesroots.live.presentation.current_order_fragment.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u0010\u00105\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u000b\u00106\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u0010\u00108\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001eJ\u000b\u00109\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019Jz\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010=J\u0013\u0010>\u001a\u00020\u00052\b\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010@\u001a\u00020\u0010H\u00d6\u0001J\t\u0010A\u001a\u00020\rH\u00d6\u0001R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00100\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/\u00a8\u0006B"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "", "data", "Lcom/codesroots/live/models/current_orders/CurrentOrderModel;", "noOrderYet", "", "progress", "error", "Lcom/codesroots/live/helper/UserError;", "cliendLatitude", "", "cliendLongitude", "PlaceId_2", "", "PlaceId_3", "UserId", "", "(Lcom/codesroots/live/models/current_orders/CurrentOrderModel;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/codesroots/live/helper/UserError;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getPlaceId_2", "()Ljava/lang/String;", "setPlaceId_2", "(Ljava/lang/String;)V", "getPlaceId_3", "setPlaceId_3", "getUserId", "()Ljava/lang/Integer;", "setUserId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCliendLatitude", "()Ljava/lang/Double;", "setCliendLatitude", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getCliendLongitude", "setCliendLongitude", "getData", "()Lcom/codesroots/live/models/current_orders/CurrentOrderModel;", "setData", "(Lcom/codesroots/live/models/current_orders/CurrentOrderModel;)V", "getError", "()Lcom/codesroots/live/helper/UserError;", "setError", "(Lcom/codesroots/live/helper/UserError;)V", "getNoOrderYet", "()Ljava/lang/Boolean;", "setNoOrderYet", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getProgress", "setProgress", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/codesroots/live/models/current_orders/CurrentOrderModel;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/codesroots/live/helper/UserError;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class MainViewState {
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.models.current_orders.CurrentOrderModel data;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean noOrderYet;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Boolean progress;
    @org.jetbrains.annotations.Nullable()
    private com.codesroots.live.helper.UserError error;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cliendLatitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double cliendLongitude;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String PlaceId_2;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String PlaceId_3;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer UserId;
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState copy(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.CurrentOrderModel data, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean noOrderYet, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean progress, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.helper.UserError error, @org.jetbrains.annotations.Nullable()
    java.lang.Double cliendLatitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double cliendLongitude, @org.jetbrains.annotations.Nullable()
    java.lang.String PlaceId_2, @org.jetbrains.annotations.Nullable()
    java.lang.String PlaceId_3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer UserId) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public MainViewState() {
        super();
    }
    
    public MainViewState(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.CurrentOrderModel data, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean noOrderYet, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean progress, @org.jetbrains.annotations.Nullable()
    com.codesroots.live.helper.UserError error, @org.jetbrains.annotations.Nullable()
    java.lang.Double cliendLatitude, @org.jetbrains.annotations.Nullable()
    java.lang.Double cliendLongitude, @org.jetbrains.annotations.Nullable()
    java.lang.String PlaceId_2, @org.jetbrains.annotations.Nullable()
    java.lang.String PlaceId_3, @org.jetbrains.annotations.Nullable()
    java.lang.Integer UserId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.current_orders.CurrentOrderModel component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.models.current_orders.CurrentOrderModel getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.current_orders.CurrentOrderModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getNoOrderYet() {
        return null;
    }
    
    public final void setNoOrderYet(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getProgress() {
        return null;
    }
    
    public final void setProgress(@org.jetbrains.annotations.Nullable()
    java.lang.Boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.helper.UserError component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codesroots.live.helper.UserError getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.helper.UserError p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCliendLatitude() {
        return null;
    }
    
    public final void setCliendLatitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getCliendLongitude() {
        return null;
    }
    
    public final void setCliendLongitude(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceId_2() {
        return null;
    }
    
    public final void setPlaceId_2(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlaceId_3() {
        return null;
    }
    
    public final void setPlaceId_3(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
}