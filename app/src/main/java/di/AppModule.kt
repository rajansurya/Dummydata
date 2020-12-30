package com.society.societygate.di

import android.app.usage.UsageEvents.Event.NONE
import android.provider.Telephony.TextBasedSmsColumns.BODY
import com.society.societygate.repository.LoggingInterceptore
import com.society.societygate.repository.RetrofitCallInterface
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {
    @Singleton
    @Provides
    fun getApiInterface(retrofit: Retrofit): RetrofitCallInterface {
          return retrofit.create(RetrofitCallInterface::class.java)
    }
    @Singleton
    @Provides
    fun getRetrofitOb():Retrofit {
//    var gson: Gson =  GsonBuilder()
//            .setLenient()
//            .create()


    val  httpClient=   OkHttpClient().newBuilder()
            .addInterceptor(LoggingInterceptore())
            .build()
    return    Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .client(httpClient)
            .addConverterFactory(JacksonConverterFactory.create())
            .build()
    }



}