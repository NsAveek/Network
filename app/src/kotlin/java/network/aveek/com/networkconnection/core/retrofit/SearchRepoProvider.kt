package network.aveek.com.networkconnection.core.retrofit

object SearchRepoProvider {

   fun provideSearchRepo() : SearchRepo {
       return SearchRepo(GithubApiService.create())
   }
}