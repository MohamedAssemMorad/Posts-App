package com.example.postsapp.presentation.di

import androidx.room.Room
import com.example.postsapp.core.db.PostsRoomDatabase
import com.example.postsapp.data.repository.PostsLocalRepo
import com.example.postsapp.data.source.remote.network.PostsAPIController
import com.example.postsapp.data.repository.PostsRepository
import com.example.postsapp.data.source.local.PostsDao
import com.example.postsapp.presentation.viewmodel.PostsViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val networkModule = module {
    single { PostsAPIController }
    single { Room.databaseBuilder(get(), PostsRoomDatabase::class.java, "posts_database").build() }
    single { get<PostsRoomDatabase>().postsDao() }
}

val repositoryModule = module {
    single { PostsRepository(get()) }
    single { PostsLocalRepo(get()) }

}

val viewModelModule = module {
    viewModel { PostsViewModel(get(), get()) }

}