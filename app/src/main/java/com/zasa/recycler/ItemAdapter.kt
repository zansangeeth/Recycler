package com.zasa.recycler

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_text_view.view.*

class ItemAdapter(val context: Context, val data: List<Affermations>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.tvText

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val inflater = LayoutInflater.from(context).inflate(R.layout.single_text_view, parent,false)
        return ItemViewHolder(inflater)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val text = data[position]
        holder.textView.text = context.resources.getString(text.string)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}
