package com.example.postsapp.network.posts

import com.google.gson.annotations.SerializedName

data class PostsResult(

    @SerializedName("userId")
    private val userId: Int? = null,

    @SerializedName("id")
    private val id: Int? = null,

    @SerializedName("title")
    private val title: String? = null,

    @SerializedName("body")
    private val body: String? = null
)