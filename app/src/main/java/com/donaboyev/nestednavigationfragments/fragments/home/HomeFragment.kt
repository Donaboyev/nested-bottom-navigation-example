package com.donaboyev.nestednavigationfragments.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.donaboyev.nestednavigationfragments.adapters.PagerAdapter
import com.donaboyev.nestednavigationfragments.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        val fragments = listOf(HomeFirstFragment(), HomeSecondFragment())
        binding.vpHome.adapter = PagerAdapter(this, fragments)
        TabLayoutMediator(binding.tabLayoutHome, binding.vpHome) { tab, position ->
            when (position) {
                0 -> tab.text = "First home"
                1 -> tab.text = "Second home"
            }
        }.attach()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}