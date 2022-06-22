package com.ilaydabykakova.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.ilaydabykakova.kotlinintent.databinding.ActivityNextBinding


class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //get Intent
        val intent = intent
        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")

        binding.userNameTextNextActivity.text = "Username : " + username
        binding.nameTextNextActivity2.text = "Name : "+ name
    }

    fun back(view : View){
        val intent2 = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent2)
    }
}