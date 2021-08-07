package com.example.motionlayoutexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.motionlayoutexample.databinding.ActivityMainBinding
import com.example.motionlayoutexample.model.dummyData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvFoot.adapter = FoodAdapter(dummyData)
    }
}
