package com.example.my__template.feature.main.home

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.my__template.R
import com.example.my__template.common.BaseFragment
import com.example.my__template.databinding.FragmentHomeBinding


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private val myViewModel : HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = myViewModel
    }
}