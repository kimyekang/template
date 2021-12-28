package com.example.my__template.feature.main.schedule

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.my__template.R
import com.example.my__template.common.BaseFragment
import com.example.my__template.databinding.FragmentScheduleBinding

class ScheduleFragment :
    BaseFragment<FragmentScheduleBinding>(R.layout.fragment_schedule) {

    private val myViewModel : ScheduleViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.viewModel = myViewModel
    }
}