package com.example.restaurante

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdapterMenu(var list: ArrayList<Menus>): RecyclerView.Adapter<AdapterMenu.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v=LayoutInflater.from(parent?.context).inflate(R.layout.list_food,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: AdapterMenu.ViewHolder, position: Int) {
        holder.bindItems(list[position])

    }


    class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        fun bindItems(data: Menus){
            val title:TextView=itemView.findViewById(R.id.txtTitle)
            //val count:TextView=itemView.findViewById(R.id.descTxt)
            val thumbnail: ImageView =itemView.findViewById(R.id.thumbnail)

            title.text=data.name1
            //count.text=data.descripcion.toString()

            Glide.with(itemView.context).load(data.thumbnail).into(thumbnail)

            itemView.setOnClickListener{
                Toast.makeText(itemView.context,"Platillo: ${data.name1}",Toast.LENGTH_LONG).show()
            }

        }
    }
}