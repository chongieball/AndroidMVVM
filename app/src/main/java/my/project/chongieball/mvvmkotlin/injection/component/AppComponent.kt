package my.project.chongieball.mvvmkotlin.injection.component

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import my.project.chongieball.mvvmkotlin.App
import my.project.chongieball.mvvmkotlin.injection.annotations.ApplicationScope
import my.project.chongieball.mvvmkotlin.injection.module.ActivityBuilder
import my.project.chongieball.mvvmkotlin.injection.module.AppModule
import my.project.chongieball.mvvmkotlin.injection.module.ViewModelModule

@ApplicationScope
@Component(modules = [AndroidSupportInjectionModule::class,
    AppModule::class,
    ViewModelModule::class,
    ActivityBuilder::class])
interface AppComponent: AndroidInjector<App> {

    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<App>()
}