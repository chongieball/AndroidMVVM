package my.project.chongieball.mvvmkotlin.injection.module

import dagger.Module
import dagger.Provides
import my.project.chongieball.mvvmkotlin.data.network.GithubService
import my.project.chongieball.mvvmkotlin.injection.annotations.ApplicationScope
import retrofit2.Retrofit

@Module(includes = [NetworkModule::class])
class NetworkServiceModule {

    @Provides
    @ApplicationScope
    fun provideGithubService(retrofit: Retrofit): GithubService{
        return retrofit.create(GithubService::class.java)
    }
}