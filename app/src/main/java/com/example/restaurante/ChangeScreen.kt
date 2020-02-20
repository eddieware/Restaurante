package com.example.restaurante

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChangeScreen : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {




        when( item.itemId ){
            R.id.aboutUs-> {
                val intAcerca = Intent(this,AboutUs::class.java)
                startActivity(intAcerca)
            }
            R.id.platosFuertes-> abrirPlatillos("2")
            //R.id.ensaladas-> abrirPlatillos("3")
            //R.id.bebidas-> abrirPlatillos("4")
        }

        return super.onOptionsItemSelected(item)
    }

    private fun abrirPlatillos(i: String) {
        val intPlatillos = Intent(this,MainActivity::class.java)
        //println(i+"Here debug Point!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!")
        intPlatillos.putExtra("PLATILLO",i)
        if(i=="2")
        {
            startActivity(intPlatillos)

        }


    }
}