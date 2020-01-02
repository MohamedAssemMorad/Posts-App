package com.example.postsapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u001e\u0010\u000b\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\rj\b\u0012\u0004\u0012\u00020\n`\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/postsapp/data/repository/PostsLocalRepo;", "", "postsDao", "Lcom/example/postsapp/data/source/local/PostsDao;", "(Lcom/example/postsapp/data/source/local/PostsDao;)V", "deleteAllPosts", "", "getAllPosts", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/postsapp/data/source/remote/model/PostsResult;", "insertAllPosts", "posts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_debug"})
public class PostsLocalRepo {
    private final com.example.postsapp.data.source.local.PostsDao postsDao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.postsapp.data.source.remote.model.PostsResult>> getAllPosts() {
        return null;
    }
    
    public final void deleteAllPosts() {
    }
    
    public final void insertAllPosts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.postsapp.data.source.remote.model.PostsResult> posts) {
    }
    
    public PostsLocalRepo(@org.jetbrains.annotations.NotNull()
    com.example.postsapp.data.source.local.PostsDao postsDao) {
        super();
    }
}