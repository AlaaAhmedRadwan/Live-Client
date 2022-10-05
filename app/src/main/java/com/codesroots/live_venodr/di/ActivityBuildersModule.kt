package com.codesroots.live_venodr.di

import com.codesroots.dagger.di.scopes.ActivityScope
import com.codesroots.live_venodr.MainActivity
import com.codesroots.live_venodr.helper.FragmentFactoryModule
import com.codesroots.live_venodr.presentation.auth.LoginActivity
import com.codesroots.live_venodr.presentation.map_activity.MapActivity
import com.codesroots.live_venodr.presentation.splashScreen.SplashScreen


import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ActivityBuildersModule {


    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class, FragmentFactoryModule::class])
    fun contributeMainActivity(): MainActivity


    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class, FragmentFactoryModule::class])
    fun contributeMapActivity(): MapActivity


    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class, FragmentFactoryModule::class])
    fun contributeLoginActivity(): LoginActivity


    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class, FragmentFactoryModule::class])
    fun contributeSplashScreen(): SplashScreen


}