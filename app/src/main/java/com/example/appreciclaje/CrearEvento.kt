package com.example.appreciclaje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CrearEvento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_evento)

        val irMenuPrincipal = findViewById<Button>(R.id.button_cancelarCreacion)
        irMenuPrincipal.setOnClickListener {
            val intent = Intent(this, MenuPrincipal::class.java)
            startActivity(intent)
        }

        val editTextNombreEvento = findViewById<EditText>(R.id.nombreEvento)
        val editTextDescripcion = findViewById<EditText>(R.id.editTextTextMultiLine)
        val editTextCategoria = findViewById<EditText>(R.id.editTextCategoria)
        val editTextFecha = findViewById<EditText>(R.id.editTextDate)
        val editTextHora = findViewById<EditText>(R.id.editTextTime)

        val buttonBorrar = findViewById<Button>(R.id.button_borrarDatosEvento)
        buttonBorrar.setOnClickListener {
            editTextCategoria.setText(" ")
            editTextDescripcion.setText(" ")
            editTextFecha.setText(" ")
            editTextHora.setText(" ")
            editTextNombreEvento.setText(" ")
        }
    }
}