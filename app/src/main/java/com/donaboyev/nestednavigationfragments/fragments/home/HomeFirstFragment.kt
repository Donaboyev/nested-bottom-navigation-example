package com.donaboyev.nestednavigationfragments.fragments.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.donaboyev.nestednavigationfragments.databinding.FragmentHomeBinding
import com.donaboyev.nestednavigationfragments.databinding.FragmentHomeFirstBinding

class HomeFirstFragment : Fragment() {

    private var _binding: FragmentHomeFirstBinding? = null
    private val binding: FragmentHomeFirstBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}