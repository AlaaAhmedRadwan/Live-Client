package com.codesroots.live.presentation.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010#\u001a\u00020$J\u0012\u0010%\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006("}, d2 = {"Lcom/codesroots/live/presentation/auth/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "isAllFieldsChecked", "", "()Z", "setAllFieldsChecked", "(Z)V", "mSocket", "Lcom/github/nkzawa/socketio/client/Socket;", "getMSocket", "()Lcom/github/nkzawa/socketio/client/Socket;", "setMSocket", "(Lcom/github/nkzawa/socketio/client/Socket;)V", "pref", "Lcom/codesroots/live/helper/PreferenceHelper;", "getPref", "()Lcom/codesroots/live/helper/PreferenceHelper;", "setPref", "(Lcom/codesroots/live/helper/PreferenceHelper;)V", "socket", "getSocket", "setSocket", "viewModel", "Lcom/codesroots/live/presentation/auth/AuthViewModel;", "getViewModel", "()Lcom/codesroots/live/presentation/auth/AuthViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "loginRequest", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.github.nkzawa.socketio.client.Socket mSocket;
    @javax.inject.Inject()
    public com.github.nkzawa.socketio.client.Socket socket;
    @javax.inject.Inject()
    public com.codesroots.live.helper.PreferenceHelper pref;
    private boolean isAllFieldsChecked = false;
    private java.util.HashMap _$_findViewCache;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.codesroots.live.presentation.auth.AuthViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.github.nkzawa.socketio.client.Socket getMSocket() {
        return null;
    }
    
    public final void setMSocket(@org.jetbrains.annotations.Nullable()
    com.github.nkzawa.socketio.client.Socket p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.nkzawa.socketio.client.Socket getSocket() {
        return null;
    }
    
    public final void setSocket(@org.jetbrains.annotations.NotNull()
    com.github.nkzawa.socketio.client.Socket p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.helper.PreferenceHelper getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.helper.PreferenceHelper p0) {
    }
    
    public final boolean isAllFieldsChecked() {
        return false;
    }
    
    public final void setAllFieldsChecked(boolean p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void loginRequest() {
    }
}