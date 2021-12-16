package com.example.my__template.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.my__template.R
import com.example.my__template.common.BaseActivity
import com.example.my__template.databinding.ActivityMainBinding
import com.example.my__template.feature.main.home.HomeFragment
import com.example.my__template.feature.main.mypage.MyPageFragment
import com.example.my__template.feature.main.schedule.ScheduleFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : BaseActivity<ActivityMainBinding>(ActivityMainBinding::inflate){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.main_frm, MyPageFragment()).commitAllowingStateLoss()
        Log.d("dsadasdassda", "시작")
//
        binding.mainBtmNav.setOnNavigationItemSelectedListener(
            BottomNavigationView.OnNavigationItemSelectedListener { item ->
                when (item.itemId) {

                    R.id.page_myPage -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, MyPageFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.page_scheduler -> {
                        Log.d("dsadasdassda", "여기")
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, ScheduleFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }
                    R.id.page_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HomeFragment())
                            .commitAllowingStateLoss()
                        return@OnNavigationItemSelectedListener true
                    }
                }
                false
            })
    }
}