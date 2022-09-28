package com.codesroots.live.presentation.current_order_fragment.mvi;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u001f\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015\u00a8\u0006\u0016"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "", "viewState", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "vendorId", "", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;Ljava/lang/Integer;)V", "getVendorId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getViewState", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "EditDeliveryLocation", "ErrorDisplayed", "GetPlaceId", "Initialize", "getLatLong", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$Initialize;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$getLatLong;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$GetPlaceId;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$EditDeliveryLocation;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$ErrorDisplayed;", "app_debug"})
public abstract class MainIntent {
    @org.jetbrains.annotations.Nullable()
    private final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer vendorId = null;
    
    private MainIntent(com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState, java.lang.Integer vendorId) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState getViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public java.lang.Integer getVendorId() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$Initialize;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "viewState", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "vendorId", "", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;Ljava/lang/Integer;)V", "getVendorId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getViewState", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "component1", "component2", "copy", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;Ljava/lang/Integer;)Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$Initialize;", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class Initialize extends com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent {
        @org.jetbrains.annotations.NotNull()
        private final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState = null;
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer vendorId = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent.Initialize copy(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState, @org.jetbrains.annotations.Nullable()
        java.lang.Integer vendorId) {
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
        
        public Initialize(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState, @org.jetbrains.annotations.Nullable()
        java.lang.Integer vendorId) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState getViewState() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        public java.lang.Integer getVendorId() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$getLatLong;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "viewState", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;)V", "getViewState", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class getLatLong extends com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent {
        @org.jetbrains.annotations.NotNull()
        private final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent.getLatLong copy(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState) {
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
        
        public getLatLong(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$GetPlaceId;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "viewState", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;)V", "getViewState", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class GetPlaceId extends com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent {
        @org.jetbrains.annotations.NotNull()
        private final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent.GetPlaceId copy(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState) {
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
        
        public GetPlaceId(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$EditDeliveryLocation;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "viewState", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;)V", "getViewState", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class EditDeliveryLocation extends com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent {
        @org.jetbrains.annotations.NotNull()
        private final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent.EditDeliveryLocation copy(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState) {
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
        
        public EditDeliveryLocation(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState getViewState() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent$ErrorDisplayed;", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainIntent;", "viewState", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "(Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;)V", "getViewState", "()Lcom/codesroots/live/presentation/current_order_fragment/mvi/MainViewState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ErrorDisplayed extends com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent {
        @org.jetbrains.annotations.NotNull()
        private final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainIntent.ErrorDisplayed copy(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState) {
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
        
        public ErrorDisplayed(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState viewState) {
            super(null, null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.codesroots.live.presentation.current_order_fragment.mvi.MainViewState getViewState() {
            return null;
        }
    }
}