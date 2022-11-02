package com.example.friendsr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class Amigos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amigos)



        val amigo3 = Amigo("Andrea Hernandez", "Hola, me gusta hacer deporte", R.drawable.mujer2)
        val amigo4 = Amigo("Camila Fonseca", "Hola, me gusta jugar", R.drawable.mujer3)
        val amigo5 = Amigo("Stiven Rodriguez", "Hola, me gusta jugar futbol", R.drawable.hombre)
        val amigo6 = Amigo("Ericson Pagani", "Hola, me gusta jugar baloncesto", R.drawable.hombre2)
        val amigo7 = Amigo("Jeremy Cauca", "Hola, me gusta acampar", R.drawable.hombre3)
        val amigo8 = Amigo("Esteban Fierro", "Hola, me gusta correr", R.drawable.hombre4)

        val listaAmigos = listOf( amigo3, amigo4, amigo5, amigo6, amigo7, amigo8)

        val adapter = MainActivity(this, listaAmigos)

        lista.MainActivity = adapter
        lista.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, Detalles::class.java)
            intent.putExtra("amigo", listaAmigos[i])
            startActivity(intent)
        }

    }
}