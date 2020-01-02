package com.example.postsapp.data.source.remote.network

import com.example.postsapp.data.source.remote.model.PostsResult
import retrofit2.Call
import retrofit2.http.GET

interface RetrofitService {

    @GET("users/1/posts")
    fun callGetUserPosts(): Call<ArrayList<PostsResult>?>
}