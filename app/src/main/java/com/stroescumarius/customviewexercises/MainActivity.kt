package com.stroescumarius.customviewexercises

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.stroescumarius.customviewexercises.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        val view = binding.root
        setContentView(view)
        setListeners()
    }

    private fun setListeners() {

    }

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
    }
}