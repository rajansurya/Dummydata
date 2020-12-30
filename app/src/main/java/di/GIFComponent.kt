package com.society.societygate.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import di.SocietyApplicationClass
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class,ActivitiesModule::class,ViewModelModule::class,AppModule::class])
interface GIFComponent{
    @Component.Builder
    interface Builder{
        fun builderApplication():GIFComponent
        @BindsInstance
        fun societyapplicationBind(application: Application):Builder
    }
    fun injectApp(application: SocietyApplicationClass)
}