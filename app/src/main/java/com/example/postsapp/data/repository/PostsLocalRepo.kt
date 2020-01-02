package com.example.postsapp.data.repository

import androidx.lifecycle.LiveData
import com.example.postsapp.data.source.local.PostsDao
import com.example.postsapp.data.source.remote.model.PostsResult

open class PostsLocalRepo(private val postsDao: PostsDao) {

    fun getAllPosts(): LiveData<List<PostsResult>> {
        return postsDao.getAllPosts()
    }

    fun deleteAllPosts() {
        postsDao.deleteAllPosts()
    }

    fun insertAllPosts(posts: ArrayList<PostsResult>) {
        postsDao.insertPosts(posts)
    }
}