package com.example.linah_alkhurayyif_3buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        displaybtn.setOnClickListener {
            Toast.makeText(this,"User name: ${name_et.text}\n User age: ${age_et.text}\n User phone number: ${phone_et.text} ",Toast.LENGTH_SHORT).show()
        }
        viewbtn.setOnClickListener {
            output.text = "User name: ${name_et.text}\n User age: ${age_et.text}\n User phone number: ${phone_et.text} "
        }
        submitbtn.setOnClickListener {
            val intent = Intent(this, SubmitResult()::class.java)
            intent.putExtra("name",name_et.text.toString())
            intent.putExtra("age",age_et.text.toString())
            intent.putExtra("phone",phone_et.text.toString())
            startActivity(intent);
        }
    }
}