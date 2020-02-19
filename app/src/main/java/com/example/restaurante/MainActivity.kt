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
        var opc = intPlatillo.getStringExtra("PLATILLO")

        recycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        val menus=ArrayList<Menus>()

        menus.add(Menus("Pozole",R.drawable.pozole))
        val adapter=AdapterMenu(menus)
        recycler.adapter=adapter


    }



}
