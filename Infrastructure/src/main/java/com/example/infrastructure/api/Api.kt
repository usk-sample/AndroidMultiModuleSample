package com.example.infrastructure.api

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String): Call<List<RepoResponse>>
}

class Api(
    retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.github.com/")
        .build()
) {

    val service: GithubService = retrofit.create(GithubService::class.java)

}