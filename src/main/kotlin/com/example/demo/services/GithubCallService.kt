package com.example.demo.services

import com.example.demo.models.Repo
import com.example.demo.interfaces.GithubService
import org.springframework.stereotype.Service
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Service
class GithubCallService {

    fun consumeApi(username: String): Response<List<Repo>> {

        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        val service: GithubService = retrofit.create(GithubService::class.java)
        val call: Call<List<Repo>> = service.listRepos(username)
        return call.execute()
    }
}