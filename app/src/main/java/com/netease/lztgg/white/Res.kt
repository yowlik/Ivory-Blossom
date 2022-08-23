package com.netease.lztgg.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.netease.lztgg.R

class Res : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)
        val scr=findViewById<TextView>(R.id.scorere)
        val start=findViewById<Button>(R.id.startRes)
        val rul=findViewById<Button>(R.id.rull)
        scr.text=getIntent().getStringExtra("key")
        start.setOnClickListener {
            val intent2= Intent(this@Res,Game::class.java)
            startActivity(intent2)
        }
        rul.setOnClickListener {
            val intent3=Intent(this@Res, Rules::class.java)
            startActivity(intent3)
        }

    }
}