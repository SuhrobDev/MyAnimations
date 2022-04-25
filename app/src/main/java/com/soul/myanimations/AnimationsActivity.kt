package com.soul.myanimations

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.soul.myanimations.databinding.ActivityAnimationsBinding


class AnimationsActivity : AppCompatActivity() {
    private lateinit var binding:ActivityAnimationsBinding
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAnimationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cardFlip.setOnClickListener {
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        }
        binding.buttonUp.setOnClickListener {
            val intent = Intent(this , ButtonUpActivity::class.java)
            startActivity(intent)
        }
        binding.fabButton.setOnClickListener {
            val intent = Intent(this , FobButtonActivity::class.java)
            startActivity(intent)
        }


    }
}