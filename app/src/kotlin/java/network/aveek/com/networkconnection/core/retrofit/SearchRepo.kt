package network.aveek.com.networkconnection.core.retrofit

import io.reactivex.Observable

class SearchRepo (val apiService: GithubApiService){
    fun searchUsers(location: String, language: String): Observable<Result> {
        return apiService.search(query = "location:$location language:$language")
    }
}