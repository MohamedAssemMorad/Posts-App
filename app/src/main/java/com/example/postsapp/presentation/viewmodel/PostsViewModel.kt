package com.example.postsapp.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.room.RoomDatabase
import com.example.postsapp.application.PostsApplication
import com.example.postsapp.core.db.PostsRoomDatabase
import com.example.postsapp.data.repository.PostsLocalRepo
import com.example.postsapp.data.source.remote.model.PostsResult
import com.example.postsapp.data.repository.PostsRepository
import com.example.postsapp.data.source.local.PostsDao

public class PostsViewModel(
    private val repository: PostsRepository,
    private var localRepository: PostsLocalRepo
) : ViewModel() {


    fun callGetPosts(): LiveData<ArrayList<PostsResult>?> {
        return repository.callGetPostsRemotely()
    }

    fun callGetPostsLocally(): LiveData<List<PostsResult>> {
        return localRepository.getAllPosts()
    }

    fun callDeletePostsLocally() {
        localRepository.deleteAllPosts()
    }

    fun savePosts(posts: ArrayList<PostsResult>) {
        localRepository.insertAllPosts(posts)
    }
}