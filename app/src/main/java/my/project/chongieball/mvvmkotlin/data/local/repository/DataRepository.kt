package my.project.chongieball.mvvmkotlin.data.local.repository

import io.reactivex.Observable
import my.project.chongieball.mvvmkotlin.data.network.GithubService
import my.project.chongieball.mvvmkotlin.data.network.response.RepoSearchResponse
import my.project.chongieball.mvvmkotlin.injection.annotations.ApplicationScope
import javax.inject.Inject

@ApplicationScope
class DataRepository @Inject constructor(private val githubService: GithubService) {

    fun getMessage(): String {
        return "hello my message"
    }

    fun searchRepositories(query: String): Observable<RepoSearchResponse> = githubService.searchRepos(query)
}