package com.example.noteapp.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase

object DatabaseManager {

    private var db: AppDatabase? = null

    fun loadDbConnection(applicationContext: Context): AppDatabase {
        if (db == null) {
            db = Room.databaseBuilder(
                applicationContext,
                AppDatabase::class.java, "database-note-app"
            ).build()
        }
        return db as AppDatabase
    }
}