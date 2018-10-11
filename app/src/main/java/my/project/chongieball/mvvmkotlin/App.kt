package my.project.chongieball.mvvmkotlin

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import my.project.chongieball.mvvmkotlin.injection.component.DaggerAppComponent
import timber.log.Timber

class App: DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }

    override fun applicationInjector(): AndroidInjector<out App> {
        return DaggerAppComponent.builder().create(this)
    }
}