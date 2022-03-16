package com.example.presentacionformulario

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val botonSubmit = findViewById<Button>(R.id.BTNenviar)

        botonSubmit.setOnClickListener {
            val intent = Intent(this,ActivityRecogerDatos::class.java)

            val ETemail = findViewById<TextView>(R.id.ETemail)
            intent.putExtra("correo", ETemail.text.toString())

            val ETphone = findViewById<TextView>(R.id.ETtelefono)
            intent.putExtra("telefono", ETphone.text.toString())

            val radioGroupSexo = findViewById<RadioGroup>(R.id.RGsexo)
            val radioButton = findViewById<RadioButton>(radioGroupSexo.getCheckedRadioButtonId())
            intent.putExtra("sexo", radioButton.text)

            val numHermanos = findViewById<Spinner>(R.id.SpinnerHermanos)
            intent.putExtra("hermanos", numHermanos.selectedItem.toString())

            var mascotas: String=""
            val perro=findViewById<CheckBox>(R.id.CBPerro)
            val gato=findViewById<CheckBox>(R.id.CBgato)
            val otros=findViewById<CheckBox>(R.id.CBotros)

            if (perro.isChecked()){
                mascotas+=perro.text
                mascotas+=", "
            }
            if (gato.isChecked()){
                mascotas+=gato.text
                mascotas+=", "
            }
            if (otros.isChecked()){
                mascotas+=otros.text
                mascotas+="."
            }

            mascotas.plus("hola buenas tardes")
            print(mascotas)
            intent.putExtra("mascotas", mascotas)

            startActivity(intent)
        }
    }
}