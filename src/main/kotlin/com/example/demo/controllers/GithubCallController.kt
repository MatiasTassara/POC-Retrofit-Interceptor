package com.example.demo.controllers

import com.example.demo.models.Repo
import com.example.demo.services.GithubCallService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/myRepo")
class GithubCallController(val githubCallService: GithubCallService) {

    @GetMapping("/{username}")
    fun getReposByUserName(@PathVariable username: String): List<Repo>? {
        val emptyList = listOf<Repo>()
        return githubCallService.consumeApi(username).body() ?: emptyList
    }


}