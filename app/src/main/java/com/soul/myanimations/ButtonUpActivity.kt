package com.soul.myanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ButtonUpActivity : AppCompatActivity() {
    //    private var rotateOpen:Animation by lazy { AnimationUtils.loadAnimation(this,R.anim.rotate_open_anim) }
    private lateinit var rotateOpen : Animation
    private lateinit var rotateClose : Animation
    private lateinit var fromBottom : Animation
    private lateinit var toBottom : Animation
    private var clicked = false
    private lateinit var addBtn : FloatingActionButton
    private lateinit var editBtn : FloatingActionButton
    private lateinit var deleteBtn : FloatingActionButton
    private lateinit var callBtn : FloatingActionButton

    //    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.button_up)

        addBtn = findViewById(R.id.addBtn)
        editBtn = findViewById(R.id.editBtn)
        deleteBtn = findViewById(R.id.deleteBtn)
        callBtn = findViewById(R.id.callBtn)

        fromBottom = AnimationUtils.loadAnimation(this , R.anim.from_botton_anim)
        toBottom = AnimationUtils.loadAnimation(this , R.anim.to_botton_anim)
        rotateOpen = AnimationUtils.loadAnimation(this , R.anim.rotate_open_anim)
        rotateClose = AnimationUtils.loadAnimation(this , R.anim.rotate_close_anim)

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
            editBtn.startAnimation(fromBottom)
            deleteBtn.startAnimation(fromBottom)
            callBtn.startAnimation(fromBottom)
            addBtn.startAnimation(rotateOpen)
        } else {
            editBtn.startAnimation(toBottom)
            deleteBtn.startAnimation(toBottom)
            callBtn.startAnimation(toBottom)
            addBtn.startAnimation(rotateClose)
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