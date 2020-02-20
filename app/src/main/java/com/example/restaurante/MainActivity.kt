package com.example.restaurante

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intPlatillo = this.intent
        var itemVariation = intPlatillo.getStringExtra("PLATILLO")

        recycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val menus=ArrayList<Menus>()
        //PLATILLOS
        menus.add(Menus("Pozole",R.drawable.pozole,"Platillo de abundante Caldo","2"))
        menus.add(Menus("ChileAhogado",R.drawable.chileahogada,"Literal es un chile con caldo dmase chile because Mexicans","2"))
        menus.add(Menus("Ensaladas",R.drawable.ensaladas,"La ensalada puede contener lo que usted le indique al cheff","2"))
        menus.add(Menus("Pavo",R.drawable.pavo,"Pavo tradicional o estilo Sonora","2"))
        menus.add(Menus("Taco",R.drawable.taco,"Tacos de canasta", "2"))
        //ENSALADAS
        menus.add(Menus("Ensalada De Frutas",R.drawable.ensaladafrutas,"Ensalada de fresa, naranja, naranja Kiwi y sandia ", "3"))
        menus.add(Menus("Ensalada De Helado",R.drawable.ensaladaconhelado,"Ensalada de frutas on Helado de Vainilla o Uva ", "3"))
        menus.add(Menus("Ensalada De Frutas",R.drawable.ensaladadecarnicos,"Ensalada de champiñones mozarella y jamon ", "3"))
        //BEBIDAS
        menus.add(Menus("Cerveza",R.drawable.cerveza,"Cerveza tradicional clara u obscura", "4"))
        menus.add(Menus("Mezcal",R.drawable.mezcal,"Mezcal proveniente de Oaxaca con fruto exoticos", "4"))
        menus.add(Menus("Whisky Barrels",R.drawable.whiskeybarrels,"Whisky Barrels en las rocas", "4"))
        var filtermenu = menus.filter{it.categoria==itemVariation} as ArrayList<Menus>
        val adapter=AdapterMenu(filtermenu)
        recycler.adapter=adapter


    }





}
