package com.donaboyev.nestednavigationfragments.fragments.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.donaboyev.nestednavigationfragments.databinding.FragmentProfileSecondBinding

class ProfileSecondFragment : Fragment() {

    private var _binding: FragmentProfileSecondBinding? = null
    private val binding: FragmentProfileSecondBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}