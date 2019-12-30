package com.example.postsapp.network

import com.example.postsapp.network.posts.PostsResponse
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    @GET("users/1/posts")
    fun callGetUserPosts(): Call<PostsResponse?>
}