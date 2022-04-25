package com.soul.myanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FobButtonActivity : AppCompatActivity() {
    //    private var rotateOpen:Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.rotate_open_anim) }
    private lateinit var rotateForward : Animation
    private lateinit var rotateBackward : Animation
    private lateinit var fobOpen : Animation
    private lateinit var fobClose : Animation
    private var clicked = false
    private lateinit var addBtn : FloatingActionButton
    private lateinit var editBtn : FloatingActionButton
    private lateinit var deleteBtn : FloatingActionButton
    private lateinit var callBtn : FloatingActionButton

    //    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fob_activity)

        addBtn = findViewById(R.id.fobaddBtn)
        editBtn = findViewById(R.id.fobeditBtn)
        deleteBtn = findViewById(R.id.fobdeleteBtn)
        callBtn = findViewById(R.id.fobcallBtn)

        fobOpen = AnimationUtils.loadAnimation(this , R.anim.fab_open)
        fobClose = AnimationUtils.loadAnimation(this , R.anim.fab_close)
        rotateForward = AnimationUtils.loadAnimation(this , R.anim.rotate_forward)
        rotateBackward = AnimationUtils.loadAnimation(this , R.anim.rotate_backward)

        addBtn.setOnClickListener {
            onAddButtonClicked()
        }
        editBtn.setOnClickListener {
            Toast.makeText(this , "edit button" , Toast.LENGTH_SHORT).show()
        }
        deleteBtn.setOnClickListener {
            Toast.makeText(this , "delete button" , Toast.LENGTH_SHORT).show()
        }
        callBtn.setOnClickListener {
            Toast.makeText(this , "call button" , Toast.LENGTH_SHORT).show()
        }
    }

    private fun onAddButtonClicked() {
        setVisibility(clicked)
        setAnimation(clicked)
        setClickable(clicked)
        clicked = !clicked
    }

    private fun setVisibility(clicked : Boolean) {
        if (!clicked) {
            editBtn.visibility = View.VISIBLE
            deleteBtn.visibility = View.VISIBLE
            callBtn.visibility = View.VISIBLE
        } else {
            editBtn.visibility = View.INVISIBLE
            deleteBtn.visibility = View.INVISIBLE
            callBtn.visibility = View.INVISIBLE
        }
    }

    private fun setAnimation(clicked : Boolean) {
        if (!clicked) {
            editBtn.startAnimation(fobOpen)
            deleteBtn.startAnimation(fobOpen)
            callBtn.startAnimation(fobOpen)
            addBtn.startAnimation(rotateForward)
        } else {
            editBtn.startAnimation(fobClose)
            deleteBtn.startAnimation(fobClose)
            callBtn.startAnimation(fobClose)
            addBtn.startAnimation(rotateBackward)
        }
    }

    private fun setClickable(clicked : Boolean){
        if (!clicked){
            editBtn.isClickable=true
            deleteBtn.isClickable=true
            callBtn.isClickable=true
        }else{
            editBtn.isClickable=false
            deleteBtn.isClickable=false
            callBtn.isClickable=false
        }
    }

}