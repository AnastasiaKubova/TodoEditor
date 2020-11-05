package com.example.noteapp.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import com.example.noteapp.database.entry.Task

@Dao
interface TaskDao {

    @Query("SELECT * FROM Task WHERE task_tasklist_id IN (:taskListId)")
    fun loadAllByTaskListId(taskListId: Int): List<Task>

    @Update
    fun update(task: Task)

    @Delete
    fun delete(task: Task)
}