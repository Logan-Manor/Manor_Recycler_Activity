package com.example.manor_recycler_activity.fragments.list

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.manor_recycler_activity.data.Zodiac
import com.example.roomdb.R

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var zodiacList = emptyList<Zodiac>()

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textView : TextView = itemView.findViewById(R.id.zodiac_txt)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_row, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return zodiacList.size
    }

    override fun onBindViewHolder(holder: ListAdapter.MyViewHolder, position: Int) {
        val currentItem = zodiacList[position]
        holder.textView.text = currentItem.Sign
    }

    fun setData(zodiac: List<Zodiac>) {
        this.zodiacList = zodiac
        notifyDataSetChanged()
    }

}