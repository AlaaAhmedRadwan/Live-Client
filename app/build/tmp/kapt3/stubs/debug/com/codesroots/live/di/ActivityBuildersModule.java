package com.codesroots.live.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/codesroots/live/di/ActivityBuildersModule;", "", "contributeLoginActivity", "Lcom/codesroots/live/presentation/auth/LoginActivity;", "contributeMainActivity", "Lcom/codesroots/live/MainActivity;", "contributeMapActivity", "Lcom/codesroots/live/presentation/map_activity/MapActivity;", "contributeSplashScreen", "Lcom/codesroots/live/presentation/splashScreen/SplashScreen;", "app_debug"})
@dagger.Module()
public abstract interface ActivityBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.codesroots.live.di.MainModule.class, com.codesroots.live.helper.FragmentFactoryModule.class})
    @com.codesroots.dagger.di.scopes.ActivityScope()
    public abstract com.codesroots.live.MainActivity contributeMainActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.codesroots.live.di.MainModule.class, com.codesroots.live.helper.FragmentFactoryModule.class})
    @com.codesroots.dagger.di.scopes.ActivityScope()
    public abstract com.codesroots.live.presentation.map_activity.MapActivity contributeMapActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.codesroots.live.di.MainModule.class, com.codesroots.live.helper.FragmentFactoryModule.class})
    @com.codesroots.dagger.di.scopes.ActivityScope()
    public abstract com.codesroots.live.presentation.auth.LoginActivity contributeLoginActivity();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.codesroots.live.di.MainModule.class, com.codesroots.live.helper.FragmentFactoryModule.class})
    @com.codesroots.dagger.di.scopes.ActivityScope()
    public abstract com.codesroots.live.presentation.splashScreen.SplashScreen contributeSplashScreen();
}