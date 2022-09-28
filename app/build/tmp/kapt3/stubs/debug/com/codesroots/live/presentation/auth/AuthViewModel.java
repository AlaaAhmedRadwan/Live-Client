package com.codesroots.live.presentation.auth;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,J\b\u0010-\u001a\u00020*H\u0014J\u0010\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020\u0013H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010 \u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00180\u00180\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011R\u001c\u0010$\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u00060"}, d2 = {"Lcom/codesroots/live/presentation/auth/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "Datasources", "Lcom/codesroots/live/repository/RemoteDataSource;", "(Lcom/codesroots/live/repository/RemoteDataSource;)V", "Pref", "Lcom/codesroots/live/helper/PreferenceHelper;", "getPref", "()Lcom/codesroots/live/helper/PreferenceHelper;", "setPref", "(Lcom/codesroots/live/helper/PreferenceHelper;)V", "authLD", "Landroidx/lifecycle/MutableLiveData;", "Lcom/codesroots/live/models/auth/AuthModel;", "getAuthLD", "()Landroidx/lifecycle/MutableLiveData;", "setAuthLD", "(Landroidx/lifecycle/MutableLiveData;)V", "errorMessage", "", "getErrorMessage", "job", "Lkotlinx/coroutines/Job;", "loading", "", "getLoading", "mCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "getMCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "setMCompositeDisposable", "(Lio/reactivex/disposables/CompositeDisposable;)V", "processVisibility", "kotlin.jvm.PlatformType", "getProcessVisibility", "setProcessVisibility", "rateJob", "getRateJob", "()Lkotlinx/coroutines/Job;", "setRateJob", "(Lkotlinx/coroutines/Job;)V", "login", "", "loginModel", "Lcom/codesroots/live/models/auth/User;", "onCleared", "onError", "message", "app_debug"})
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    private final com.codesroots.live.repository.RemoteDataSource Datasources = null;
    @javax.inject.Inject()
    public com.codesroots.live.helper.PreferenceHelper Pref;
    private kotlinx.coroutines.Job job;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.disposables.CompositeDisposable mCompositeDisposable;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> processVisibility;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job rateJob;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.MutableLiveData<com.codesroots.live.models.auth.AuthModel> authLD;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> loading = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.repository.RemoteDataSource Datasources) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.codesroots.live.helper.PreferenceHelper getPref() {
        return null;
    }
    
    public final void setPref(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.helper.PreferenceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.disposables.CompositeDisposable getMCompositeDisposable() {
        return null;
    }
    
    public final void setMCompositeDisposable(@org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProcessVisibility() {
        return null;
    }
    
    public final void setProcessVisibility(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlinx.coroutines.Job getRateJob() {
        return null;
    }
    
    public final void setRateJob(@org.jetbrains.annotations.Nullable()
    kotlinx.coroutines.Job p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.MutableLiveData<com.codesroots.live.models.auth.AuthModel> getAuthLD() {
        return null;
    }
    
    public final void setAuthLD(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.MutableLiveData<com.codesroots.live.models.auth.AuthModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getLoading() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.Nullable()
    com.codesroots.live.models.auth.User loginModel) {
    }
    
    private final void onError(java.lang.String message) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}