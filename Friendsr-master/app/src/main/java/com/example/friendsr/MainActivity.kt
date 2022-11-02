package com.example.friendsr


import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity

class MainActivity (private val mContext: Context, private val listaAmigos:List<Amigo> ) : ArrayAdapter<Amigo>(mContext, 0, listaAmigos) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.activity_amigo, parent, false)

        val amigo = listaAmigos[position]

        layout.nombre.text = amigo.nombre
        layout.text = amigo.descripcion
        layout.imageView8.setImageResource(amigo.imagen)

        return layout


    }
}