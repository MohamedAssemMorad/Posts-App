package com.example.postsapp.core.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.postsapp.data.source.local.PostsDao
import com.example.postsapp.data.source.remote.model.PostsResult

@Database(entities = [PostsResult::class], version = 1, exportSchema = false)
public abstract class PostsRoomDatabase : RoomDatabase() {
    abstract fun postsDao(): PostsDao

    companion object {
        @Volatile
        private var INSTANCE: PostsRoomDatabase? = null

//        fun getDatabase(context: Context): PostsRoomDatabase {
//            val tempInstance = INSTANCE
//            if (tempInstance != null) {
//                return tempInstance
//            }
//            synchronized(this) {
//                val instance = Room.databaseBuilder(
//                    context.applicationContext,
//                    PostsRoomDatabase::class.java,
//                    ""
//                ).build()
//                INSTANCE = instance
//                return instance
//            }
//        }
    }
}