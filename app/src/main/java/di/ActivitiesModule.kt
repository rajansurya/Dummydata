package com.society.societygate.di

import com.papaer.gifview.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
abstract class ActivitiesModule {
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity

//    @ContributesAndroidInjector
//    abstract fun contributeDashboard()
}