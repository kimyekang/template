package com.example.my__template.feature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.example.my__template.R
import com.example.my__template.common.BaseActivity
import com.example.my__template.databinding.ActivityMainBinding
import com.example.my__template.feature.main.home.HomeFragment
import com.example.my__template.feature.main.mypage.MyPageFragment
import com.example.my__template.feature.main.schedule.ScheduleFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(R.layout.activity_main)


        initNavigationBar()
        supportFragmentManager.beginTransaction().replace(R.id.main_frm, HomeFragment())
            .commitAllowingStateLoss()
        Log.d("dsadasdassda", "시작")
//
        binding.mainBtmNav.setOnClickListener{
            Log.d("dsadasdassda", "tab click!!!!")
        }

        binding.btn.setOnClickListener{
            Log.d("dsadasdassda", "tab click!!!!")
        }

    }
    private fun initNavigationBar() {

        binding.mainBtmNav.run {
            Log.d("dsadasdassda", "tab click!")
            BottomNavigationView.OnNavigationItemSelectedListener{ item ->
                when (item.itemId) {
                    R.id.page_myPage -> {
                        changeFragment(MyPageFragment())
                    }
                    R.id.page_scheduler -> {
                        Log.d("dsadasdassda", "여기")
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, ScheduleFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.page_home -> {
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.main_frm, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                }
                true
            }
        }
    }
    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.
        beginTransaction().
        replace(R.id.main_frm, fragment)
            .commit()
    }

}