package my.project.chongieball.mvvmkotlin.data.network.response

import com.squareup.moshi.Json

class RepoSearchResponse {

    @Json(name = "total_count")
    var totalCount: Int = -1

    @Json(name = "items")
    var repoList: List<RepoResponse> = ArrayList()
}