package com.codesroots.live.di

import android.content.Context
import cn.pedant.SweetAlert.SweetAlertDialog
import com.codesroots.live.datalayer.APIServices
import com.codesroots.live.helper.PreferenceHelper
import com.codesroots.live.repository.DataSource
import com.codesroots.live.repository.RemoteDataSource

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule() {


//    @Singleton
//    @Provides
//    fun provideTasksRemoteDataSource(apiService: APIServices): DataSource {
//        return RemoteDataSource(apiService)
//    }


    @Singleton
    @Provides
    fun provideTasksBranchDataSource(apiService: APIServices): DataSource {
        return RemoteDataSource(apiService)
        }
        @Provides
    fun providePreferenceHelper(context: Context): PreferenceHelper {
        return PreferenceHelper(context)
    }
    @Provides
    fun provideSweetAlertDialog(context: Context): SweetAlertDialog {
        return SweetAlertDialog(context)
    }
}
