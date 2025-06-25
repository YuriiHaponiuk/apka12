package com.example.mstudent

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.mstudent.databinding.ActivityFormularzBinding

class FormularzActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFormularzBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFormularzBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Formularz"

        binding.zatwierdzButton.setOnClickListener {
            val imie = binding.imieInput.text.toString()
            val nazwisko = binding.nazwiskoInput.text.toString()

            if (imie.isNotEmpty() && nazwisko.isNotEmpty()) {
                Toast.makeText(this, "Witaj, $imie $nazwisko!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Uzupełnij wszystkie pola!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
