package com.w.aprenderapp.Adapter

import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.w.aprenderapp.R
import com.w.aprenderapp.productos

class productosViewHolder (view: View): RecyclerView.ViewHolder(view){

    val precioProd = view.findViewById<TextView>(R.id.tvPrecioProd)
    val nombreProd = view.findViewById<TextView>(R.id.tvNombreProd)
    val imgProd = view.findViewById<ImageView>(R.id.ivProd)

    fun render(productoModel: productos){
        precioProd.text = productoModel.precio.toString()
        nombreProd.text = productoModel.nombre
        Glide.with(imgProd.context).load(productoModel.imageProduct).into(imgProd)
    }
}