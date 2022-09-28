package com.codesroots.live.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/codesroots/live/di/AppModule;", "", "()V", "providePreferenceHelper", "Lcom/codesroots/live/helper/PreferenceHelper;", "context", "Landroid/content/Context;", "provideSweetAlertDialog", "Lcn/pedant/SweetAlert/SweetAlertDialog;", "provideTasksBranchDataSource", "Lcom/codesroots/live/repository/DataSource;", "apiService", "Lcom/codesroots/live/datalayer/APIServices;", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.codesroots.live.repository.DataSource provideTasksBranchDataSource(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.datalayer.APIServices apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.codesroots.live.helper.PreferenceHelper providePreferenceHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final cn.pedant.SweetAlert.SweetAlertDialog provideSweetAlertDialog(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}