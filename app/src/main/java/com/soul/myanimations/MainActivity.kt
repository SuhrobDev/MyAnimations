package com.soul.myanimations

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var frontAnim : AnimatorSet
    private lateinit var backAnim : AnimatorSet
    private var isFront = true

    //    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
//        binding= ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        setContentView(R.layout.activity_main)
        val scale = applicationContext.resources.displayMetrics.density

//        binding.front.cameraDistance=8000*scale
//        binding.back.cameraDistance=8000*scale

        val front = findViewById<ImageView>(R.id.frontSide)
        val flipper = findViewById<Button>(R.id.flipperBtn)
        val back = findViewById<ImageView>(R.id.backSide)

        front.cameraDistance = 8000 * scale
        back.cameraDistance = 8000 * scale

        frontAnim = AnimatorInflater.loadAnimator(
            applicationContext ,
            R.animator.front_animator
        ) as AnimatorSet
        backAnim = AnimatorInflater.loadAnimator(
            applicationContext ,
            R.animator.back_animator
        ) as AnimatorSet


        flipper.setOnClickListener {
            isFront = if (isFront) {
                frontAnim.setTarget(front)
                backAnim.setTarget(back)
                frontAnim.start()
                backAnim.start()
                false
            } else {
                frontAnim.setTarget(back)
                backAnim.setTarget(front)
                backAnim.start()
                frontAnim.start()
                true
            }
            ////////////////////////////////////

        }
    }
}