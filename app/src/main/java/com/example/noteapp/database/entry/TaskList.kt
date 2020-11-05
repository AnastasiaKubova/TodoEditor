package com.example.noteapp.database.entry

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class TaskList (
    @PrimaryKey val taskListId: Int,
    @ColumnInfo(name = "task_list_name") val taskListName: String
)