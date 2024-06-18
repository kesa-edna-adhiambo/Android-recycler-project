package com.example.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NamesRecyclerViewAdapter(var namesList: List<String>):
    RecyclerView.Adapter<NamesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.name_list_item, parent, false)
        return NamesViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
        val num = position+1
        holder.tvNumber.text = "$num."
        holder.tvName.text = namesList[position]


    }

    override fun getItemCount(): Int {
       return namesList.size
    }
}

class NamesViewHolder(itemView: View): ViewHolder(itemView){
    var tvNumber = itemView.findViewById<TextView>(R.id.tvNumber)
    var tvName = itemView.findViewById<TextView>(R.id.tvName)

}