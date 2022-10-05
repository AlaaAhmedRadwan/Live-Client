package com.codesroots.live_venodr.di

import androidx.lifecycle.ViewModel
import com.codesroots.live_venodr.helper.ViewModelKey
import com.codesroots.live_venodr.presentation.auth.AuthViewModel
import com.codesroots.live_venodr.presentation.current_order_fragment.mvi.CurrentOrderViewModel
import com.codesroots.live_venodr.presentation.history_order_fragment.mvi.HistoryOrderViewmodel
import com.codesroots.live_venodr.presentation.profile_fragment.viewmodel.ProfileViewmodel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
Created by Prokash Sarkar on Tue, January 19, 2021
 **/

@Module
interface MainModule {

    @Binds
    @IntoMap
    @ViewModelKey(CurrentOrderViewModel::class)
    fun currentOrderViewModel(mainViewModel: CurrentOrderViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HistoryOrderViewmodel::class)
    fun HistoryOrderViewModel(mainViewModel: HistoryOrderViewmodel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    fun authViewModel(mainViewModel: AuthViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewmodel::class)
    fun profileViewmodel(mainViewModel: ProfileViewmodel): ViewModel


}