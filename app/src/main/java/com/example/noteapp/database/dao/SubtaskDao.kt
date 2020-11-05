package com.example.noteapp.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Update
import com.example.noteapp.database.entry.Subtask

@Dao
interface SubtaskDao {

    @Query("SELECT * FROM Subtask WHERE subtask_task_id IN (:taskId)")
    fun loadAllByTaskListId(taskId: Int): List<Subtask>

    @Update
    fun update(subtask: Subtask)

    @Delete
    fun delete(subtask: Subtask)
}