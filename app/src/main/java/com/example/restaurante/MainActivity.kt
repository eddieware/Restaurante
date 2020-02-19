package com.example.restaurante

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.main,menu)
        return true

    }


    @SuppressLint("WrongConstant")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var selectedOption = ""
        when(item?.itemId){
            R.id.aboutUs-> selectedOption="About Us"
            R.id.platosFuertes-> selectedOption="Platos Fuertes"
        }
        Toast.makeText(this,"Option: "+ selectedOption,Toast.LENGTH_LONG).show()
        print(selectedOption)

        if (selectedOption=="About Us")
        {
            setContentView(R.layout.restaurante)
        }


        if(selectedOption=="Platos Fuertes"){
            val recyclerView:RecyclerView=findViewById(R.id.recycler)
            recyclerView.layoutManager=LinearLayoutManager(this ,LinearLayout.VERTICAL,false)

            val menus=ArrayList<Menus>()

            menus.add(Menus("Pozole",R.drawable.pozole))
            menus.add(Menus("ChileAhogado",R.drawable.chileahogada))
            menus.add(Menus("Ensaladas",R.drawable.ensaladas))
            menus.add(Menus("Pavo",R.drawable.pavo))
            menus.add(Menus("Taco",R.drawable.taco))
            val adapter=AdapterMenu(menus)
            recyclerView.adapter=adapter

        }

        return super.onOptionsItemSelected(item)



    }
}
