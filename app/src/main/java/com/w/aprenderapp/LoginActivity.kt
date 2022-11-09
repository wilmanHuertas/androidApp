package com.w.aprenderapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class LoginActivity : AppCompatActivity() {
    private var edtEmail:EditText?=null
    private var edtClave:EditText?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtEmail=findViewById(R.id.edtEmail)
        edtClave=findViewById(R.id.edtClave)
    }
    fun ingresar(btningreso:View){
        var email:String=edtEmail!!.text.toString()
        var password:String=edtClave!!.text.toString()
        val positiveButton ={ dialog: DialogInterface, entero: Int->
            val intento= Intent(this,catalogoActivity::class.java)
            startActivity(intento)
        }

        if(email=="prueba1@gmail.es"){
           if(password=="1234"){
            val llamado=Intent(this,MainActivity::class.java)
            startActivity(llamado)
               Toast.makeText(this, R.string.message_log, Toast.LENGTH_LONG).show()
            } else{
                val botondialogo = AlertDialog.Builder(this).setTitle(R.string.alert_pass)
                    .setMessage(R.string.pass_error)
                    .create().show()
            }
        } else{
            if(email=="w" && password=="123"){
                val dialogo = AlertDialog.Builder(this).setTitle(R.string.alert_log)
                    .setMessage(R.string.message_log)
                    .setPositiveButton(R.string.positiveBtn, positiveButton).create().show()
            }else{
                val btndialogo = AlertDialog.Builder(this).setTitle(R.string.alert_email)
                    .setMessage(R.string.email_error)
                    .create().show()
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_bar,menu)
        return super.onCreateOptionsMenu(menu)
    }
}
