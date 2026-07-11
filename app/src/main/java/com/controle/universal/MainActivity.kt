package com.controle.universal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "BluetoothController"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        Log.d(TAG, "Iniciando a lógica do controlador universal...")
        // A lógica de Bluetooth será adicionada aqui em breve
    }
}
