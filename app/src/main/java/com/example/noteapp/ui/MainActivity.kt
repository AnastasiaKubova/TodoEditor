package com.example.noteapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import com.example.noteapp.R
import com.example.noteapp.database.entry.Task
import com.example.noteapp.database.entry.TaskList
import com.example.noteapp.ui.dialogs.BottomSheetDialogBuilder
import com.example.noteapp.ui.dialogs.MenuOrSettingsModel
import com.example.noteapp.ui.dialogs.MenuOrSettingsViewHolder
import com.google.android.material.bottomsheet.BottomSheetDialog
import kotlinx.android.synthetic.main.main_layout.*

class MainActivity : AppCompatActivity(), MenuOrSettingsViewHolder.MenuOrSettingsListener {

    private val viewModel by viewModels<MainActivityViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        bottom_app_bar.setNavigationOnClickListener {
            menuClick()
        }

        floating_add_button.setOnClickListener {
            floatingClick()
        }

        bottom_app_bar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.settings -> {
                    settingsClick()
                    true
                }
                else -> false
            }
        }

        initObservers()
    }

    private fun initObservers() {
        val listOfTaskLists = Observer<List<TaskList>> { listOfTaskList ->
            updateCurrentList(listOfTaskList)
        }
        val listOfTasks = Observer<List<Task>> { listOfTasks ->
            updateTasksForCurrentTaskList(listOfTasks)
        }
        viewModel.listOfTaskLists.observe(this, listOfTaskLists)
        viewModel.listOfTasksForCurrentTaskList.observe(this, listOfTasks)
    }

    private fun updateCurrentList(listOfTaskList: List<TaskList>) {
        if (listOfTaskList.isNullOrEmpty()) {
            // TODO show textView
        } else {
            // TOSO load list of tasks list
        }
    }

    private fun updateTasksForCurrentTaskList(listOfTasks: List<Task>) {
        if (listOfTasks.isNullOrEmpty()) {
            // TODO show textView
        } else {
            // TOSO load list of tasks list
        }
    }

    private fun floatingClick() {

    }

    private fun settingsClick() {
        BottomSheetDialogBuilder.settingsBottomSheetDialog(this, this).show()
    }

    private fun menuClick() {
        BottomSheetDialogBuilder.menuBottomSheetDialog(this, this).show()
    }

    override fun onMenuOrSettingsClickListener(item: MenuOrSettingsModel) {

    }
}