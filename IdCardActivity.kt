package com.example.mstudent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mstudent.databinding.ActivityIdCardBinding

class IdCardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIdCardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIdCardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Legitymacja Studencka"

        binding.textViewName.text = "Yurii Haponiuk"
        binding.textViewUniversity.text = "WSB Merito Gdańsk"
        binding.imageViewPhoto.setImageResource(R.drawable.legitka)
    }
}
