package com.netease.lztgg.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.netease.lztgg.R

class Rules : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)
        val star=findViewById<Button>(R.id.startRul)
        star.setOnClickListener {
            val intent1= Intent(this@Rules, Game::class.java)
            startActivity(intent1)
        }

    }
}