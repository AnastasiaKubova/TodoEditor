package com.example.noteapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.noteapp.database.dao.SubtaskDao
import com.example.noteapp.database.dao.TaskDao
import com.example.noteapp.database.dao.TaskListDao

import com.example.noteapp.database.entry.Subtask
import com.example.noteapp.database.entry.Task
import com.example.noteapp.database.entry.TaskList

@Database(entities = arrayOf(TaskList::class, Task::class, Subtask::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskListDao(): TaskListDao
    abstract fun taskDao(): TaskDao
    abstract fun subtaskDao(): SubtaskDao
}