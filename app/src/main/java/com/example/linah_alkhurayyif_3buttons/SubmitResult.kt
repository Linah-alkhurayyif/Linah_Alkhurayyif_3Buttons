package com.example.linah_alkhurayyif_3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_submit_result.*

class SubmitResult : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit_result)
        val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val phone = intent.getStringExtra("phone")
        name_tv.text=name.toString()
        age_tv.text=age.toString()
        phone_tv.text=phone.toString()
        goback.setOnClickListener {
            val intent = Intent(this, MainActivity()::class.java)
            startActivity(intent);
        }
    }
}