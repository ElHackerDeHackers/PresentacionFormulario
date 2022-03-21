package com.example.presentacionformulario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ActivityRecogerDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recoger_datos)
        val botonVolver = findViewById<Button>(R.id.BTNvolver)
        val TVemail=findViewById<TextView>(R.id.TVvalueCorreo)
        TVemail.text=intent.getStringExtra("correo")
        val TVphone=findViewById<TextView>(R.id.TVvalueTelefono)
        TVphone.text=intent.getStringExtra("telefono")
        val TVsexo=findViewById<TextView>(R.id.TVvalueSexo)
        TVsexo.text=intent.getStringExtra("sexo")
        val TVhermanos=findViewById<TextView>(R.id.TVvalueNumHermanos)
        TVhermanos.text=intent.getStringExtra("hermanos")
        val TVmascotas=findViewById<TextView>(R.id.TVvalueMascotas)
        TVmascotas.text=intent.getStringExtra("mascotas")
        botonVolver.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}