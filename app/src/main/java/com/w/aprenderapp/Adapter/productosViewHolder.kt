package com.w.aprenderapp.Adapter

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.w.aprenderapp.R
import com.w.aprenderapp.productos

class productosViewHolder (view: View): RecyclerView.ViewHolder(view){

    val precioProd = view.findViewById<TextView>(R.id.tvPrecioProd)
    val nombreProd = view.findViewById<TextView>(R.id.tvNombreProd)
    val imgProd = view.findViewById<ImageButton>(R.id.iBtnProd)

    fun render(productoModel: productos){
        precioProd.text = productoModel.precio.toString()
        nombreProd.text = productoModel.nombre
    }
}