package com.example.postsapp.data.source.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/postsapp/data/source/remote/network/RetrofitHelper;", "", "()V", "APP_BASE_URL", "", "appInstance", "Lcom/example/postsapp/data/source/remote/network/RetrofitService;", "getInstance", "getLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "app_debug"})
public final class RetrofitHelper {
    private static final java.lang.String APP_BASE_URL = "https://jsonplaceholder.typicode.com/";
    private static com.example.postsapp.data.source.remote.network.RetrofitService appInstance;
    public static final com.example.postsapp.data.source.remote.network.RetrofitHelper INSTANCE = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.postsapp.data.source.remote.network.RetrofitService getInstance() {
        return null;
    }
    
    private final okhttp3.logging.HttpLoggingInterceptor getLoggingInterceptor() {
        return null;
    }
    
    private RetrofitHelper() {
        super();
    }
}