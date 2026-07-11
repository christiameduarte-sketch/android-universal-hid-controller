package com.controle.universal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {

    private val TAG = "BluetoothController"
    private lateinit var bluetoothManager: BluetoothConnectionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bluetoothManager = BluetoothConnectionManager(this)
        
        Log.d(TAG, "Inicializando perfil HID...")
        bluetoothManager.initializeHidProfile()
    }
}
