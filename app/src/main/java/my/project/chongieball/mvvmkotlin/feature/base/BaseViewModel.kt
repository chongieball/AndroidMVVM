package my.project.chongieball.mvvmkotlin.feature.base

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import my.project.chongieball.mvvmkotlin.data.network.ErrorData

open class BaseViewModel : ViewModel() {

    val loader: MutableLiveData<Boolean> = MutableLiveData()
    val error: MutableLiveData<ErrorData?> = MutableLiveData()
    var compositeDisposable: CompositeDisposable = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }

    fun displayLoader(isLoading: Boolean) {
        loader.value = isLoading
    }
}