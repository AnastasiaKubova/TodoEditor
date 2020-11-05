package com.example.noteapp.database.entry

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Task (
    @PrimaryKey val taskId: Int,
    @ColumnInfo(name = "task_tasklist_id") val taskListId: Int,
    @ColumnInfo(name = "task_name") val taskName: String,
    @ColumnInfo(name = "task_date") val taskDate: String?
)