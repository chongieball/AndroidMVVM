package my.project.chongieball.mvvmkotlin.injection.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import my.project.chongieball.mvvmkotlin.feature.main.MainActivity
import my.project.chongieball.mvvmkotlin.feature.main.MainModule
import my.project.chongieball.mvvmkotlin.injection.annotations.ActivityScope

@Module
abstract class ActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector(modules = arrayOf(MainModule::class))
    abstract fun bindMainActivity(): MainActivity
}