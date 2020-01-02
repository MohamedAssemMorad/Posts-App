package com.example.postsapp.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\t0\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/postsapp/data/repository/PostsRepository;", "", "apiController", "Lcom/example/postsapp/data/source/remote/network/PostsAPIController;", "(Lcom/example/postsapp/data/source/remote/network/PostsAPIController;)V", "callGetPostsRemotely", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/example/postsapp/data/source/remote/model/PostsResult;", "Lkotlin/collections/ArrayList;", "app_debug"})
public class PostsRepository {
    private final com.example.postsapp.data.source.remote.network.PostsAPIController apiController = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.postsapp.data.source.remote.model.PostsResult>> callGetPostsRemotely() {
        return null;
    }
    
    public PostsRepository(@org.jetbrains.annotations.NotNull()
    com.example.postsapp.data.source.remote.network.PostsAPIController apiController) {
        super();
    }
}