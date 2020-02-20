package com.example.restaurante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.descripcion_platillos.*

class DescripcionPlatillos : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.descripcion_platillos)

        val intPlatillo = this.intent
        titleDescripcion.text = intPlatillo.getStringExtra("PLATILLO")
        descripcion.text = intPlatillo.getStringExtra("DETALLE")
        

    }

}