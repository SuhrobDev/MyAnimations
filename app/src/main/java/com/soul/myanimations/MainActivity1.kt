package com.soul.myanimations


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity1 : AppCompatActivity() {
//    lateinit var front_anim:AnimatorSet
//    lateinit var back_anim:AnimatorSet
//    lateinit var front:ImageView
//    lateinit var back:ImageView
//    var isFront=true
//    lateinit var flipper:Button
//    private var scale:Float = 0.0f

    //    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
//        binding= ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
        setContentView(R.layout.activity_main1)
//        scale =applicationContext.resources.displayMetrics.density
////        binding.front.cameraDistance=8000*scale
//        front=findViewById(R.id.front)
//        front.cameraDistance=8000*scale
//
////        binding.back.cameraDistance=8000*scale
//        back=findViewById(R.id.back)
//        back.cameraDistance=8000*scale
//
//        front_anim=AnimatorInflater.loadAnimator(applicationContext,R.animator.front_animator) as AnimatorSet
//        back_anim=AnimatorInflater.loadAnimator(applicationContext,R.animator.back_animator) as AnimatorSet
//
//        flipper=findViewById(R.id.flipperBtn)
//
//        flipper.setOnClickListener {
//            isFront = if (isFront){
//                front_anim.setTarget(front)
//                back_anim.setTarget(back)
//                front_anim.start()
//                back_anim.start()
//                false
//            }else{
//                front_anim.setTarget(back)
//                back_anim.setTarget(front)
//                back_anim.start()
//                front_anim.start()
//                true
//            }
        }

}