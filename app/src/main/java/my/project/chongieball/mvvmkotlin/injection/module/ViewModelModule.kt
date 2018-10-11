package my.project.chongieball.mvvmkotlin.injection.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import my.project.chongieball.mvvmkotlin.feature.base.ViewModelFactory
import my.project.chongieball.mvvmkotlin.feature.main.MainViewModel
import my.project.chongieball.mvvmkotlin.injection.annotations.ViewModelKey

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory
}