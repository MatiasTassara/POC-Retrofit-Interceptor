package com.example.demo.interfaces

import com.example.demo.models.Repo
import retrofit2.Call

import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {
    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String) : Call<List<Repo>>
}