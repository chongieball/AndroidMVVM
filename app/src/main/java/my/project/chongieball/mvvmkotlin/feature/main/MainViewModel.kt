package my.project.chongieball.mvvmkotlin.feature.main

import android.arch.lifecycle.MutableLiveData
import io.reactivex.android.schedulers.AndroidSchedulers
import my.project.chongieball.mvvmkotlin.data.local.repository.DataRepository
import my.project.chongieball.mvvmkotlin.data.network.ErrorData
import my.project.chongieball.mvvmkotlin.data.network.response.RepoResponse
import my.project.chongieball.mvvmkotlin.data.network.response.RepoSearchResponse
import my.project.chongieball.mvvmkotlin.feature.base.BaseViewModel
import my.project.chongieball.mvvmkotlin.utils.ApiObserver
import javax.inject.Inject

class MainViewModel @Inject constructor(private val dataRepository: DataRepository): BaseViewModel() {

    private var msg: String = "test"
    var repoList: MutableLiveData<List<RepoResponse>> = MutableLiveData()

    fun getMessage(): String {
        msg = dataRepository.getMessage()
        return msg
    }

    fun searchRepos(query: String) {
        displayLoader(true)

        dataRepository.searchRepositories(query)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(object : ApiObserver<RepoSearchResponse>(compositeDisposable) {
                    override fun onError(e: ErrorData) {
                        displayLoader(false)
                        error.value = e
                    }

                    override fun onSuccess(data: RepoSearchResponse) {
                        displayLoader(false)
                        repoList.value = data.repoList
                    }
                })
    }
}