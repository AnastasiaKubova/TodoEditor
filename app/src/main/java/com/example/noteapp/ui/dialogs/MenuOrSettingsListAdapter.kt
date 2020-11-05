package com.example.noteapp.ui.dialogs

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapp.R
import java.util.zip.Inflater

class MenuOrSettingsListAdapter(var listItems: ArrayList<MenuOrSettingsModel>, var listener: MenuOrSettingsViewHolder.MenuOrSettingsListener?) : RecyclerView.Adapter<MenuOrSettingsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuOrSettingsViewHolder {
        return MenuOrSettingsViewHolder(View.inflate(parent.context, R.layout.menu_or_settings_list_item, null), listener)
    }

    override fun getItemCount(): Int {
        return listItems.count()
    }

    override fun onBindViewHolder(holder: MenuOrSettingsViewHolder, position: Int) {
        holder.bind(listItems[position])
    }
}