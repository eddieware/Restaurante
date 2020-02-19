package com.example.restaurante

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ChangeScreen : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_changescreen)

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
            /*R.id.itmEnsalada-> abrirPlatillos("2")
            R.id.itmPlatilloF-> abrirPlatillos("1")
            R.id.itmBebidas-> abrirPlatillos("3")*/
        }

        return super.onOptionsItemSelected(item)
    }

    private fun abrirPlatillos(i: String) {
        val intPlatillos = Intent(this,MainActivity::class.java)
        intPlatillos.putExtra("PLATILLO",i)
        startActivity(intPlatillos)
    }
}