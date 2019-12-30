package com.example.postsapp.network

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitHelper {

    private const val APP_BASE_URL = "https://jsonplaceholder.typicode.com/"

    private var appInstance: RetrofitService? = null

    fun getInstance(): RetrofitService? {
        if (appInstance == null) {

            val okHttpClient = OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(60, TimeUnit.SECONDS)
                .build()

            val retrofit = Retrofit.Builder()
                .baseUrl(APP_BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            appInstance = retrofit.create(RetrofitService::class.java)
        }
        return appInstance
    }
}