package com.tugas.grild_app2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PhotoAdapter(var context : Context) : RecyclerView.Adapter<PhotoAdapter.viewHolder>() {
    var dataList = emptyList<DataModel>()

    internal fun setDataList(datalist : List<DataModel>){
        this.dataList = dataList

    }

    class viewHolder (itemView : View): RecyclerView.ViewHolder(itemView){
        var image : ImageView
        var title : TextView


        init {
            image = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.title)




        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoAdapter.viewHolder {
       var view = LayoutInflater.from(parent.context).inflate(R.layout.photo_layout,parent,false)
        return viewHolder(view)
    }

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(holder: PhotoAdapter.viewHolder, position: Int) {
        var data = dataList[position]

        holder.title.text = data.title

        holder.image.setImageResource(data.image)




    }

}

