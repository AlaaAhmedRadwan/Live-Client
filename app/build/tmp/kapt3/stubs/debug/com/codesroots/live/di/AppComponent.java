package com.codesroots.live.di;

import java.lang.System;

/**
 * @author juancho.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\tH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000bH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000eH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000fH&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0010H&J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0011H&\u00a8\u0006\u0013"}, d2 = {"Lcom/codesroots/live/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Ldagger/android/DaggerApplication;", "inject", "", "app", "Lcom/codesroots/live/MainActivity;", "Lcom/codesroots/live/presentation/auth/LoginActivity;", "Lcom/codesroots/live/presentation/current_item/CurrentItemFragment;", "Lcom/codesroots/live/presentation/current_order_fragment/CurrentOrderFragment;", "Lcom/codesroots/live/presentation/deliveries_fragment/DeliveriesFragment;", "Lcom/codesroots/live/presentation/details_order_fragment/DetailsOrderFragment;", "Lcom/codesroots/live/presentation/history_order_fragment/DailyOrdersFragment;", "Lcom/codesroots/live/presentation/history_order_fragment/HistoryOrderFragment;", "Lcom/codesroots/live/presentation/map_activity/MapActivity;", "Lcom/codesroots/live/presentation/new_order_bottomfragment/NewOrderFragment;", "Lcom/codesroots/live/presentation/profile_fragment/ProfileFragment;", "Lcom/codesroots/live/presentation/splashScreen/SplashScreen;", "Factory", "app_debug"})
@dagger.Component(modules = {com.codesroots.live.di.DispatcherModule.class, dagger.android.AndroidInjectionModule.class, com.codesroots.live.di.APIModule.class, com.codesroots.live.di.AppModule.class, com.codesroots.live.helper.FragmentFactoryModule.class, com.codesroots.live.di.MainModule.class, com.codesroots.live.di.ActivityBuildersModule.class, com.codesroots.live.helper.FragmentFactoryModule.class, com.codesroots.live.helper.ViewModelBuilderModule.class, com.codesroots.live.di.SocketModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<dagger.android.DaggerApplication> {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.splashScreen.SplashScreen app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.auth.LoginActivity app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.profile_fragment.ProfileFragment app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.map_activity.MapActivity app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.MainActivity app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.new_order_bottomfragment.NewOrderFragment app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.history_order_fragment.HistoryOrderFragment app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.current_order_fragment.CurrentOrderFragment app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.details_order_fragment.DetailsOrderFragment app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.current_item.CurrentItemFragment app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.history_order_fragment.DailyOrdersFragment app);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.deliveries_fragment.DeliveriesFragment app);
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/codesroots/live/di/AppComponent$Factory;", "", "create", "Lcom/codesroots/live/di/AppComponent;", "applicationContext", "Landroid/content/Context;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.codesroots.live.di.AppComponent create(@org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        android.content.Context applicationContext);
    }
}