package com.w.aprenderapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class catalogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)
    }
    fun asignar (view: View){
        supportFragmentManager.beginTransaction()
            .setReorderingAllowed(true)
            .add(R.id.frag_container,detallesfrag::class.java, null,"detalle")
            .commit()
    }
}