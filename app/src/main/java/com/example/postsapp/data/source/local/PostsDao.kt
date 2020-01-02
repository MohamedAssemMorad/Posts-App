package com.example.postsapp.data.source.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.postsapp.data.source.remote.model.PostsResult

@Dao
interface PostsDao {

    @Query("Select * from posts")
    fun getAllPosts(): LiveData<List<PostsResult>>

    @Query("delete from posts")
    fun deleteAllPosts()

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPosts(posts: List<PostsResult>)

}