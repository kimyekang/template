package com.example.my__template.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.my__template.R
import com.example.my__template.common.BaseActivity
import com.example.my__template.databinding.ActivityMainBinding
import com.example.my__template.feature.main.home.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.main_frm, HomeFragment()).commitAllowingStateLoss()


    }
}