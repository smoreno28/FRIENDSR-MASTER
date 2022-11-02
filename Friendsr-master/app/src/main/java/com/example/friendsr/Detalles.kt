package com.example.friendsr


import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Detalles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalles)

        lateinit var ratingBar: RatingBar
        lateinit var button: Button
        lateinit var textView: TextView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_amigo)

        ratingBar = findViewById(R.id.ratingBar)
        ratingBar.numStars = 5
        button = findViewById(R.id.buttonCheck)
        textView = findViewById(R.id.textView)
        ratingBar.onRatingBarChangeListener =
            RatingBar.OnRatingBarChangeListener { _, rating, _ ->
                Toast.makeText(
                    this@Detalles, "Estrellas: " +
                            rating.toInt(), Toast.LENGTH_SHORT
                ).show()
            }
        button.setOnClickListener {
            textView.text = "Calificaste con: " + ratingBar.rating.toInt()+ " estrellas"
        }

        val amigo = intent.getSerializableExtra("amigo") as Amigo

        nombre_amigo.text = amigo.nombre
        detalles.text = amigo.descripcion
        imagenxd.setImageResource(amigo.imagen)


    }
}