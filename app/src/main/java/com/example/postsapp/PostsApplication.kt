package com.example.postsapp

import android.app.Application
import com.example.postsapp.di.networkModule
import com.example.postsapp.di.repositoryModule
import com.example.postsapp.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class PostsApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@PostsApplication)
            androidFileProperties()
            modules(listOf(networkModule, repositoryModule, viewModelModule))
        }
    }
}