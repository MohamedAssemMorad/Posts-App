package com.example.postsapp.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\u00060\u0003H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/example/postsapp/data/source/remote/network/RetrofitService;", "", "callGetUserPosts", "Lretrofit2/Call;", "Ljava/util/ArrayList;", "Lcom/example/postsapp/data/source/remote/model/PostsResult;", "Lkotlin/collections/ArrayList;", "app_debug"})
public abstract interface RetrofitService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/1/posts")
    public abstract retrofit2.Call<java.util.ArrayList<com.example.postsapp.data.source.remote.model.PostsResult>> callGetUserPosts();
}