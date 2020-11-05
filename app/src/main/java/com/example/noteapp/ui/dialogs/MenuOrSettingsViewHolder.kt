package com.example.noteapp.ui.dialogs

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.menu_or_settings_list_item.view.*

class MenuOrSettingsViewHolder(itemView: View, var listener: MenuOrSettingsListener?) : RecyclerView.ViewHolder(itemView) {

    fun bind(item: MenuOrSettingsModel) {
        itemView.title_of_menu_or_settings.text = item.title
        itemView.subtitle_of_menu_or_settings.text = item.subtitle
        itemView.setOnClickListener { listener?.onMenuOrSettingsClickListener(item) }
    }

    interface MenuOrSettingsListener {
        fun onMenuOrSettingsClickListener(item: MenuOrSettingsModel)
    }
}