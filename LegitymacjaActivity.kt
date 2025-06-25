package com.example.mstudent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mstudent.databinding.ActivityLegitymacjaBinding

class LegitymacjaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLegitymacjaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLegitymacjaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Legitymacja studencka"
    }
}
