package com.example.postsapp.di

import com.example.postsapp.network.PostsAPIController
import org.koin.dsl.module

val networkModule = module {
    single { PostsAPIController }
}

val repositoryModule = module {
    //    single { BaseRepository() }

}

val viewModelModule = module {
    //    viewModel { BaseViewModel(get()) }

}