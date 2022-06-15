package com.example.codemultiplechannel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.codemultiplechannel.databinding.ActivityMainBinding
import com.sample.lib1.Lib1Utils
import com.sample.lib2.Lib2Utils
import com.sample.lib2.Lib2UtilsStringGenerater
import com.sample.lib3.Lib3Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this,R.layout.activity_main)
        binding.tv.run {
            append("\n\n")
            append(Utils.getStr())
            append("\n\n")
            append(Lib1Utils.getName())
            append("\n\n")
            append(Lib2UtilsStringGenerater.getName())
            append("\n\n")
            append(Lib3Utils.getName())
            append("\n\n")
        }


    }
}