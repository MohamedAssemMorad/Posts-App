package com.example.postsapp.data.repository

import androidx.lifecycle.LiveData
import com.example.postsapp.data.source.remote.network.PostsAPIController
import com.example.postsapp.data.source.remote.model.PostsResult

open class PostsRepository(
    private val apiController: PostsAPIController
) {

    fun callGetPostsRemotely(
    ): LiveData<ArrayList<PostsResult>?> {
        return (apiController).callGetPosts()
    }
}