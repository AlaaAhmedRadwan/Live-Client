package com.codesroots.live.di;

import java.lang.System;

/**
 * Created by Prokash Sarkar on Tue, January 19, 2021
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/codesroots/live/di/MainModule;", "", "HistoryOrderViewModel", "Landroidx/lifecycle/ViewModel;", "mainViewModel", "Lcom/codesroots/live/presentation/history_order_fragment/mvi/HistoryOrderViewmodel;", "authViewModel", "Lcom/codesroots/live/presentation/auth/AuthViewModel;", "currentOrderViewModel", "Lcom/codesroots/live/presentation/current_order_fragment/mvi/CurrentOrderViewModel;", "profileViewmodel", "Lcom/codesroots/live/presentation/profile_fragment/viewmodel/ProfileViewmodel;", "app_debug"})
@dagger.Module()
public abstract interface MainModule {
    
    @org.jetbrains.annotations.NotNull()
    @com.codesroots.live.helper.ViewModelKey(value = com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel currentOrderViewModel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.current_order_fragment.mvi.CurrentOrderViewModel mainViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.codesroots.live.helper.ViewModelKey(value = com.codesroots.live.presentation.history_order_fragment.mvi.HistoryOrderViewmodel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel HistoryOrderViewModel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.history_order_fragment.mvi.HistoryOrderViewmodel mainViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.codesroots.live.helper.ViewModelKey(value = com.codesroots.live.presentation.auth.AuthViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel authViewModel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.auth.AuthViewModel mainViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.codesroots.live.helper.ViewModelKey(value = com.codesroots.live.presentation.profile_fragment.viewmodel.ProfileViewmodel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel profileViewmodel(@org.jetbrains.annotations.NotNull()
    com.codesroots.live.presentation.profile_fragment.viewmodel.ProfileViewmodel mainViewModel);
}