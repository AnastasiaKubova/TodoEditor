package com.example.noteapp.ui

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.noteapp.database.DatabaseManager
import com.example.noteapp.database.entry.Task
import com.example.noteapp.database.entry.TaskList

class MainActivityViewModel: ViewModel() {

    val listOfTaskLists: MutableLiveData<List<TaskList>> by lazy {
        MutableLiveData<List<TaskList>>()
    }

    val listOfTasksForCurrentTaskList: MutableLiveData<List<Task>> by lazy {
        MutableLiveData<List<Task>>()
    }

    fun loadListOfTaskLists(applicationContext: Context) {
        listOfTaskLists.value = DatabaseManager.loadDbConnection(applicationContext).taskListDao().getAll()
    }

    fun loadListOfTaskForCurrentTaskList(applicationContext: Context, taskListId: Int) {
        listOfTasksForCurrentTaskList.value = DatabaseManager.loadDbConnection(applicationContext).taskDao().loadAllByTaskListId(taskListId)
    }
}