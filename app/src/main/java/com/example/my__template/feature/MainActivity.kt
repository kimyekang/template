package com.example.my__template.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my__template.R
import com.example.my__template.common.BaseActivity
import com.example.my__template.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding.mainBtmNav
    }
}