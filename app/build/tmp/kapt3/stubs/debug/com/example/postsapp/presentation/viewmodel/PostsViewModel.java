package com.example.postsapp.presentation.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\r0\nJ\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\nJ\u001e\u0010\u0010\u001a\u00020\b2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/postsapp/presentation/viewmodel/PostsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/postsapp/data/repository/PostsRepository;", "localRepository", "Lcom/example/postsapp/data/repository/PostsLocalRepo;", "(Lcom/example/postsapp/data/repository/PostsRepository;Lcom/example/postsapp/data/repository/PostsLocalRepo;)V", "callDeletePostsLocally", "", "callGetPosts", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/example/postsapp/data/source/remote/model/PostsResult;", "Lkotlin/collections/ArrayList;", "callGetPostsLocally", "", "savePosts", "posts", "app_debug"})
public final class PostsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.postsapp.data.repository.PostsRepository repository = null;
    private com.example.postsapp.data.repository.PostsLocalRepo localRepository;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.example.postsapp.data.source.remote.model.PostsResult>> callGetPosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.postsapp.data.source.remote.model.PostsResult>> callGetPostsLocally() {
        return null;
    }
    
    public final void callDeletePostsLocally() {
    }
    
    public final void savePosts(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.postsapp.data.source.remote.model.PostsResult> posts) {
    }
    
    public PostsViewModel(@org.jetbrains.annotations.NotNull()
    com.example.postsapp.data.repository.PostsRepository repository, @org.jetbrains.annotations.NotNull()
    com.example.postsapp.data.repository.PostsLocalRepo localRepository) {
        super();
    }
}