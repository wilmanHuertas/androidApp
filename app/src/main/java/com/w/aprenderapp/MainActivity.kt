package com.w.aprenderapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.mi_barra))
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when(item.itemId){
        R.id.cerrar->{
            val llamado= Intent(this,LoginActivity::class.java)
            Toast.makeText(this,"La sesion ha sido cerrada", Toast.LENGTH_LONG).show()
            startActivity(llamado)
            true
        } else->{
            super.onOptionsItemSelected(item)
        }
    }
}