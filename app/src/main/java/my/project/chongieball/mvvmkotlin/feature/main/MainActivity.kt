package my.project.chongieball.mvvmkotlin.feature.main

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import my.project.chongieball.mvvmkotlin.R
import my.project.chongieball.mvvmkotlin.feature.base.BaseActivity
import timber.log.Timber
import javax.inject.Inject

class MainActivity : BaseActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)

        observeLoader(mainViewModel, loaderView)

        observeSearchResults()

        //init a query
        mainViewModel.searchRepos("android")
    }

    private fun observeSearchResults() {
        mainViewModel.repoList.observe(this, Observer {
            Timber.i("repo count received  ${it?.size}")
        })
    }
}