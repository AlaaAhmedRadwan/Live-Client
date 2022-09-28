package com.codesroots.live.helper;

import java.lang.System;

/**
 * Created by Prokash Sarkar on Tue, January 19, 2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\tH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/codesroots/live/helper/BaseApplication;", "Ldagger/android/DaggerApplication;", "()V", "mSocket", "Lcom/github/nkzawa/socketio/client/Socket;", "applicationInjector", "Ldagger/android/AndroidInjector;", "getMSocket", "initDI", "", "initializeDaggerComponent", "Lcom/codesroots/live/di/AppComponent;", "onCreate", "Companion", "app_debug"})
public class BaseApplication extends dagger.android.DaggerApplication {
    private com.github.nkzawa.socketio.client.Socket mSocket;
    @org.jetbrains.annotations.NotNull()
    public static final com.codesroots.live.helper.BaseApplication.Companion Companion = null;
    public static com.codesroots.live.di.AppComponent appComponent;
    
    public BaseApplication() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.DaggerApplication> applicationInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    private final void initDI() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.codesroots.live.di.AppComponent initializeDaggerComponent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.github.nkzawa.socketio.client.Socket getMSocket() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/codesroots/live/helper/BaseApplication$Companion;", "", "()V", "appComponent", "Lcom/codesroots/live/di/AppComponent;", "getAppComponent", "()Lcom/codesroots/live/di/AppComponent;", "setAppComponent", "(Lcom/codesroots/live/di/AppComponent;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.codesroots.live.di.AppComponent getAppComponent() {
            return null;
        }
        
        public final void setAppComponent(@org.jetbrains.annotations.NotNull()
        com.codesroots.live.di.AppComponent p0) {
        }
    }
}