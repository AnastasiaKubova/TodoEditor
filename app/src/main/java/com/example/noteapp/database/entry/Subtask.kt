package com.example.noteapp.database.entry

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Subtask (
    @PrimaryKey val subtaskId: Int,
    @ColumnInfo(name = "subtask_task_id") val taskListId: Int,
    @ColumnInfo(name = "subtask_name") val taskName: String
)