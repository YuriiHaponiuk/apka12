package com.example.mstudent

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mstudent.databinding.ActivityMainBinding
import com.example.mstudent.DaneActivity


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLegitymacja.setOnClickListener {
            startActivity(Intent(this, LegitymacjaActivity::class.java))
        }

        binding.buttonPrawoJazdy.setOnClickListener {
            startActivity(Intent(this, PrawoJazdyActivity::class.java))
        }

        binding.buttonDane.setOnClickListener {
            startActivity(Intent(this, DaneActivity::class.java))
        }
    }
}
