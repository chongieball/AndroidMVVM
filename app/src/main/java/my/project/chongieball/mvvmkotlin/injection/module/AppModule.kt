package my.project.chongieball.mvvmkotlin.injection.module

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import my.project.chongieball.mvvmkotlin.injection.annotations.ApplicationScope

@Module(includes = [NetworkServiceModule::class])
class AppModule {

    @Provides
    @ApplicationScope
    fun provideContext(application: Application): Context = application
}