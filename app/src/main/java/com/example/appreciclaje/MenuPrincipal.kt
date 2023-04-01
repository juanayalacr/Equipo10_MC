package com.example.appreciclaje

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)

        /*Navegar hacia Interfaz Recompensas*/
        val irRecompensas = findViewById<Button>(R.id.button5)
        irRecompensas.setOnClickListener {
            val intent = Intent(this, Registro::class.java)  /*<---- Aquí va el nombre de la interfaz*/
            startActivity(intent)
        }

        /*Navegar hacia Interfaz Eventos Disponibles*/
        val irEventosDisponibles = findViewById<Button>(R.id.button_verEventos)
        irEventosDisponibles.setOnClickListener {
            val intent = Intent(this, Registro::class.java)  /*<----- Aquí va el nombre de la interfaz*/
            startActivity(intent)
        }

        /*Navegar hacia Interfaz Crear Evento*/
        val irCrearEvento = findViewById<Button>(R.id.button_crearEvento)
        irCrearEvento.setOnClickListener {
            val intent = Intent(this, CrearEvento::class.java)  /*<----- Aquí va el nombre de la interfaz*/
            startActivity(intent)
        }

        /*Navegar hacia Interfaz Ver Mis Eventos*/
        val irVerMisEventos = findViewById<Button>(R.id.button_verEventosPendientes)
        irVerMisEventos.setOnClickListener {
            val intent = Intent(this, Registro::class.java)  /*<----- Aquí va el nombre de la interfaz*/
            startActivity(intent)
        }

        /*Navegar hacia Interfaz Log in (Cerrar Sesión)*/
        val irLogin = findViewById<Button>(R.id.button_cerrarSesion)
        irLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)  /*<----- Aquí va el nombre de la interfaz*/
            startActivity(intent)
        }
    }
}