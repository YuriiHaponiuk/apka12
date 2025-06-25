package com.example.mstudent

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mstudent.databinding.ActivityDrivingLicenseBinding

class DrivingLicenseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDrivingLicenseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDrivingLicenseBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Prawo Jazdy"

        binding.textViewLicenseInfo.text = "Numer prawa jazdy: ABC123456\nWażne do: 12.12.2030"
        binding.imageViewLicense.setImageResource(R.drawable.prawojazdy)
    }
}
