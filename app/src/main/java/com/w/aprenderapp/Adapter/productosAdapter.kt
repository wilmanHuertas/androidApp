package com.w.aprenderapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.w.aprenderapp.R
import com.w.aprenderapp.productos

class productosAdapter(private val productosList:List<productos>) : RecyclerView.Adapter<productosViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): productosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return productosViewHolder(layoutInflater.inflate(R.layout.item_producto, parent, false))
    }

    override fun onBindViewHolder(holder: productosViewHolder, position: Int) {
        val item = productosList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = productosList.size

}