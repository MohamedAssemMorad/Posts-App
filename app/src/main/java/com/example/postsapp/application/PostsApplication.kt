package com.example.postsapp.application

import android.app.Application
import com.example.postsapp.presentation.di.networkModule
import com.example.postsapp.presentation.di.repositoryModule
import com.example.postsapp.presentation.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class PostsApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@PostsApplication)
            modules(listOf(networkModule, repositoryModule, viewModelModule))
        }
    }
}