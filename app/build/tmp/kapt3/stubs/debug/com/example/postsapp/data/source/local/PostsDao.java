package com.example.postsapp.data.source.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\'\u00a8\u0006\n"}, d2 = {"Lcom/example/postsapp/data/source/local/PostsDao;", "", "deleteAllPosts", "", "getAllPosts", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/postsapp/data/source/remote/model/PostsResult;", "insertPosts", "posts", "app_debug"})
public abstract interface PostsDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from posts")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.postsapp.data.source.remote.model.PostsResult>> getAllPosts();
    
    @androidx.room.Query(value = "delete from posts")
    public abstract void deleteAllPosts();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertPosts(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.postsapp.data.source.remote.model.PostsResult> posts);
}