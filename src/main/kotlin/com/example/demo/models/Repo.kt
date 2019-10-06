package com.example.demo.models


import com.google.gson.annotations.SerializedName

data class Repo(val name: String,
                val language: String,
                @SerializedName("full_name") val fullName : String,
                @SerializedName("owner") val owner : RepoOwner)