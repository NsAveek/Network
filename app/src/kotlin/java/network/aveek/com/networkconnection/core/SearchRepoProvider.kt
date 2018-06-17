package network.aveek.com.networkconnection.core

object SearchRepoProvider {

   fun provideSearchRepo() : SearchRepo{
       return SearchRepo(GithubApiService.create())
   }
}