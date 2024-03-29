package com.example.manor_recycler_activity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.roomdb.R

class RVAdaptor(private val items:Array<String>) : RecyclerView.Adapter<RVAdaptor.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView : TextView = itemView.findViewById(R.id.text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVAdaptor.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: RVAdaptor.ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}