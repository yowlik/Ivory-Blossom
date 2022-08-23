package com.netease.lztgg.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.netease.lztgg.R
import com.netease.lztgg.databinding.ActivityGameBinding

class Game : AppCompatActivity() {
    private var timer: CountDownTimer?=null
    lateinit var binding: ActivityGameBinding
    val roll= mutableListOf<String>("1","2","3","4")
    var scr=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGameBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            startTimer(30000)
        }

    }

    private fun startTimer(timeMillis:Long){
        timer?.cancel()
        timer=object : CountDownTimer(timeMillis,500){

            override fun onTick(TimeEl: Long) {
                var i=roll.random()
                check(i)
                binding.im1.setOnClickListener {
                    if(i=="1"){
                        scr++
                        binding.scoret.text="$scr"
                    }
                }
                binding.im2.setOnClickListener {
                    if(i=="2"){
                        scr++
                        binding.scoret.text="$scr"
                    }
                }
                binding.im3.setOnClickListener {
                    if(i=="4"){
                        scr++
                        binding.scoret.text="$scr"
                    }
                }
                binding.im4.setOnClickListener {
                    if(i=="3"){
                        scr++
                        binding.scoret.text="$scr"
                    }
                }
                binding.timend.text="${(TimeEl/1000).toString()}"
            }

            override fun onFinish() {
                var scrs="Your score : ${scr.toString()}"
                val intent=Intent(this@Game, Res::class.java)
                intent.putExtra("key",scrs)
                startActivity(intent)
            }

        }.start()

    }
    fun check(i:String){
        if(i=="1"){
            binding.constr.setBackgroundResource(R.drawable.back1)
        }
        else if(i=="2"){
            binding.constr.setBackgroundResource(R.drawable.back2)
        }
        else if(i=="3"){
            binding.constr.setBackgroundResource(R.drawable.back3)
        }
        else{
            binding.constr.setBackgroundResource(R.drawable.back4)
        }
    }
}