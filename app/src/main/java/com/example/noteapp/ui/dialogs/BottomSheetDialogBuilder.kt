package com.example.noteapp.ui.dialogs

import android.content.Context
import android.os.Build
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapp.R
import com.google.android.material.bottomsheet.BottomSheetDialog

object BottomSheetDialogBuilder {

    fun menuBottomSheetDialog(
        context: Context,
        listener: MenuOrSettingsViewHolder.MenuOrSettingsListener?
    ): BottomSheetDialog {
        val dialog = BottomSheetDialog(context, R.style.BottomSheetDialogTheme)
        dialog.setContentView(R.layout.menu_or_settings_dialog_layout)
        val adapter = MenuOrSettingsListAdapter(loadMenuItems(context), listener)
        val recyclerView = dialog.findViewById<RecyclerView>(R.id.menu_or_settings_list)
        recyclerView?.adapter = adapter
        recyclerView?.layoutManager = LinearLayoutManager(context)
        return dialog
    }

    fun settingsBottomSheetDialog(
        context: Context,
        listener: MenuOrSettingsViewHolder.MenuOrSettingsListener?
    ): BottomSheetDialog {
        val dialog = BottomSheetDialog(context, R.style.BottomSheetDialogTheme)
        dialog.setContentView(R.layout.menu_or_settings_dialog_layout)
        val adapter = MenuOrSettingsListAdapter(loadSettingsItems(context), listener)
        val recyclerView = dialog.findViewById<RecyclerView>(R.id.menu_or_settings_list)
        recyclerView?.adapter = adapter
        recyclerView?.layoutManager = LinearLayoutManager(context)
        return dialog
    }

    fun addWorkItemBottomSheetDialog(
        context: Context,
        listener: MenuOrSettingsViewHolder.MenuOrSettingsListener?
    ): BottomSheetDialog {
        val dialog = BottomSheetDialog(context, R.style.BottomSheetDialogTheme)
        dialog.setContentView(R.layout.new_work_item_layout)
        return dialog
    }

    private fun loadMenuItems(context: Context): ArrayList<MenuOrSettingsModel> {
        return arrayListOf(
            MenuOrSettingsModel(context.getString(R.string.create_list), "")
        )
    }

    private fun loadSettingsItems(context: Context): ArrayList<MenuOrSettingsModel> {
        return arrayListOf(
            MenuOrSettingsModel(context.getString(R.string.sort_list), ""),
            MenuOrSettingsModel(context.getString(R.string.rename_list), ""),
            MenuOrSettingsModel(context.getString(R.string.remove_list), ""),
            MenuOrSettingsModel(context.getString(R.string.select_theme), "")
        )
    }
}