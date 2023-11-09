package com.example.conectar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.conectar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.enviar.setOnClickListener {
            var name= binding.usuario.text.toString()
            Toast.makeText(this, "name:$name", Toast.LENGTH_SHORT).show()
        }
    }



}