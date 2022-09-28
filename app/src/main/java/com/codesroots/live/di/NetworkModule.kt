package com.codesroots.live.di

import android.content.Context
import android.util.Log

import com.codesroots.live.MainActivity
import com.codesroots.live.datalayer.APIServices
import com.codesroots.live.helper.Constants.Companion.BASE_URL
import com.codesroots.live.helper.Constants.Companion.SocketURL
import com.codesroots.live.helper.FragmentFactoryModule
import com.codesroots.live.helper.PreferenceHelper
import com.codesroots.live.helper.ViewModelBuilderModule
import com.codesroots.live.presentation.auth.LoginActivity
import com.codesroots.live.presentation.current_item.CurrentItemFragment
import com.codesroots.live.presentation.details_order_fragment.DetailsOrderFragment
import com.codesroots.live.presentation.current_order_fragment.CurrentOrderFragment
import com.codesroots.live.presentation.deliveries_fragment.DeliveriesFragment
import com.codesroots.live.presentation.history_order_fragment.DailyOrdersFragment
import com.codesroots.live.presentation.history_order_fragment.HistoryOrderFragment
import com.codesroots.live.presentation.map_activity.MapActivity
import com.codesroots.live.presentation.new_order_bottomfragment.NewOrderFragment
import com.codesroots.live.presentation.profile_fragment.ProfileFragment
import com.codesroots.live.presentation.splashScreen.SplashScreen


import com.github.nkzawa.socketio.client.IO
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.Provides
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URISyntaxException
import javax.inject.Singleton


/**
 *
 * @author juancho.
 */
@Singleton
@Component(
    modules =
    [   DispatcherModule::class,
        AndroidInjectionModule::class,
        APIModule::class,
        AppModule::class,
        FragmentFactoryModule::class,
        MainModule::class,
        ActivityBuildersModule::class,
        FragmentFactoryModule::class,
        ViewModelBuilderModule::class,
        SocketModule::class
    ]
)
interface AppComponent : AndroidInjector<DaggerApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance applicationContext: Context): AppComponent
    }

    fun inject(app: SplashScreen)
    fun inject(app: LoginActivity)
    fun inject(app: ProfileFragment)
    fun inject(app: MapActivity)
    fun inject(app: MainActivity)
    fun inject(app: NewOrderFragment)
    fun inject(app: HistoryOrderFragment)
    fun inject(app: CurrentOrderFragment)
    fun inject(app: DetailsOrderFragment)
    fun inject(app: CurrentItemFragment)
    fun inject(app: DailyOrdersFragment)
    fun inject(app: DeliveriesFragment)


}

@Module
class APIModule constructor() {

    @Singleton
    @Provides
    fun provideHttpClient(context: Context): OkHttpClient {
        return OkHttpClient()
            .newBuilder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))

            .addInterceptor { chain: Interceptor.Chain ->
                val originalRequest = chain.request()
                var Pref = PreferenceHelper(context)
                val builder = originalRequest.newBuilder()
         //       builder.addHeader("Accept", "application/json")
                builder.addHeader("Content-Type", "application/json")
                builder.addHeader("Authorization", "Bearer " + Pref.UserToken)
                Log.d(ProfileFragment.TAG, Pref.UserToken!!)
                val newRequest = builder.build()

                chain.proceed(newRequest)
            }
//            .connectionSpecs(listOf(ConnectionSpec.CLEARTEXT,
//                ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS)
//                    .allEnabledTlsVersions()
//                    .allEnabledCipherSuites()
//                    .build()))
            .build()
    }

    @Singleton
    @Provides
    fun provideConverterFactory(): GsonConverterFactory =
        GsonConverterFactory.create()

    @Singleton
    @Provides
    fun provideRetrofit(
        gsonConverterFactory: GsonConverterFactory,okHttpClient: OkHttpClient,

        ): Retrofit {
        val clients = UnsafeOkHttpClient.getUnsafeOkHttpClient()
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(gsonConverterFactory)
            .build()
    }

    @Singleton
    @Provides
    fun ApiServices(provideRetrofit: Retrofit): APIServices {

        return provideRetrofit.create(APIServices::class.java)
    }


}



@Module
class SocketModule constructor() {

    @Singleton
    @Provides
    fun provideSocket(
    ): com.github.nkzawa.socketio.client.Socket {
        return     try {
//creating socket instance
           IO.socket(SocketURL)

        } catch (e: URISyntaxException) {
            throw RuntimeException(e)
        }
    }
}