package com.w.aprenderapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView

class detallesfrag : Fragment(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initRecyclerView()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragDetalle=inflater.inflate(R.layout.fragdetalles, container, false)
        return fragDetalle
    }

    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.reclyclerCatalog)
    }
}