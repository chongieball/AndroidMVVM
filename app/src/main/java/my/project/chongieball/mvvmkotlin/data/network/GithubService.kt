package my.project.chongieball.mvvmkotlin.data.network

import io.reactivex.Observable
import my.project.chongieball.mvvmkotlin.data.network.response.RepoSearchResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubService {

    @GET("search/repositories")
    fun searchRepos(@Query("q") query: String): Observable<RepoSearchResponse>
}