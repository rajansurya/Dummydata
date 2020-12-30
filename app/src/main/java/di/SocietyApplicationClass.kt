package di

import android.app.Activity
import android.app.Application
import com.society.societygate.di.DaggerGIFComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class SocietyApplicationClass :Application(),HasActivityInjector{
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
    override fun onCreate() {
        super.onCreate()
        DaggerGIFComponent.builder().societyapplicationBind(this).builderApplication().injectApp(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector
}