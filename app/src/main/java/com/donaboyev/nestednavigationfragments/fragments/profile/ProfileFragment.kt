package com.donaboyev.nestednavigationfragments.fragments.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.donaboyev.nestednavigationfragments.adapters.PagerAdapter
import com.donaboyev.nestednavigationfragments.databinding.FragmentProfileBinding
import com.google.android.material.tabs.TabLayoutMediator

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding: FragmentProfileBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)

        val fragments = listOf(ProfileFirstFragment(), ProfileSecondFragment())
        binding.vpProfile.adapter = PagerAdapter(this, fragments)
        TabLayoutMediator(binding.tabLayoutProfile, binding.vpProfile) { tab, position ->
            when (position) {
                0 -> tab.text = "First profile"
                1 -> tab.text = "Second profile"
            }
        }.attach()

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}