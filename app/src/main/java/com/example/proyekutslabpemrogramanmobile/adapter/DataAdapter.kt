package com.example.proyekutslabpemrogramanmobile.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.proyekutslabpemrogramanmobile.R
import com.example.proyekutslabpemrogramanmobile.activity.DetailActivity
import com.example.proyekutslabpemrogramanmobile.model.DataModel

class DataModelAdapter(private val dataList: List<DataModel>) : RecyclerView.Adapter<DataModelAdapter.DataModelViewHolder>() {

    class DataModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageViewLogo: ImageView = itemView.findViewById(R.id.imageViewLogo)
        val textViewName: TextView = itemView.findViewById(R.id.textViewName)
        val textViewUseCases: TextView = itemView.findViewById(R.id.textViewUseCases)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataModelViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return DataModelViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DataModelViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.imageViewLogo.setImageResource(currentItem.logoId)
        holder.imageViewLogo.contentDescription = currentItem.name
        holder.textViewName.text = currentItem.name
        holder.textViewUseCases.text = currentItem.useCases

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java)

            intent.putExtra("LOGO_ID", currentItem.logoId)
            intent.putExtra("NAME", currentItem.name)
            intent.putExtra("CREATOR", currentItem.creator)
            intent.putExtra("YEAR_RELEASED", currentItem.yearReleased)
            intent.putExtra("FILE_EXTENSION", currentItem.fileExtension)
            intent.putExtra("USE_CASES", currentItem.useCases)
            intent.putExtra("DESCRIPTION", currentItem.description)
            intent.putExtra("DOCUMENTATION_LINK", currentItem.documentationLink)

            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataList.size
}