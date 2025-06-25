package com.example.mstudent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mstudent.databinding.ActivityPrawoJazdyBinding

class PrawoJazdyActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPrawoJazdyBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrawoJazdyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Prawo jazdy"
    }
}
