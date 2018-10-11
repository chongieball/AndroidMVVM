package my.project.chongieball.mvvmkotlin.feature.base

import android.arch.lifecycle.Observer
import android.view.View
import dagger.android.support.DaggerAppCompatActivity

open class BaseActivity: DaggerAppCompatActivity() {

    fun observeLoader(viewModel: BaseViewModel, loaderView: View) {
        viewModel.loader.observe(this, Observer {
            loaderView.visibility = if(it != null && it) View.VISIBLE else View.GONE
        })
    }
}