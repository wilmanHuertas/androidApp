package com.w.aprenderapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.w.aprenderapp.Adapter.productosAdapter

class detallesfrag : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragDetalle=inflater.inflate(R.layout.fragdetalles, container, false)
        val recyclerView = fragDetalle.findViewById<RecyclerView>(R.id.reclyclerCatalog)
        recyclerView.layoutManager = GridLayoutManager(context, 3)
        recyclerView.adapter = productosAdapter(productoProvider.productosList)
        return fragDetalle
    }


}