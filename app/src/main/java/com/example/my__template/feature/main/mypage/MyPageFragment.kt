package com.example.my__template.feature.main.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.my__template.R
import com.example.my__template.common.BaseFragment
import com.example.my__template.databinding.FragmentHomeBinding
import com.example.my__template.databinding.FragmentMyPageBinding

class MyPageFragment : BaseFragment<FragmentMyPageBinding>(R.layout.fragment_my_page)  {

    private val myViewModel : MyPageViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.viewModel = myViewModel
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_page, container, false)
    }

}