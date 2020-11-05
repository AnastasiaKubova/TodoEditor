package com.example.noteapp.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import com.example.noteapp.database.entry.TaskList

@Dao
interface TaskListDao {

    @Query("SELECT * FROM TaskList")
    fun getAll(): List<TaskList>

    @Update
    fun update(taskList: TaskList)

    @Delete
    fun delete(taskList: TaskList)
}