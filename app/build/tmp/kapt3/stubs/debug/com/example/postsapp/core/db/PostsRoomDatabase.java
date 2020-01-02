package com.example.postsapp.core.db;

import java.lang.System;

@androidx.room.Database(entities = {com.example.postsapp.data.source.remote.model.PostsResult.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/postsapp/core/db/PostsRoomDatabase;", "Landroidx/room/RoomDatabase;", "()V", "postsDao", "Lcom/example/postsapp/data/source/local/PostsDao;", "Companion", "app_debug"})
public abstract class PostsRoomDatabase extends androidx.room.RoomDatabase {
    private static volatile com.example.postsapp.core.db.PostsRoomDatabase INSTANCE;
    public static final com.example.postsapp.core.db.PostsRoomDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.postsapp.data.source.local.PostsDao postsDao();
    
    public PostsRoomDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/postsapp/core/db/PostsRoomDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/postsapp/core/db/PostsRoomDatabase;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}