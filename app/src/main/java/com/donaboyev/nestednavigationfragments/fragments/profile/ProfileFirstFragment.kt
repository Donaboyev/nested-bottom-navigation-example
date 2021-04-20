package com.donaboyev.nestednavigationfragments.fragments.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.donaboyev.nestednavigationfragments.databinding.FragmentHomeBinding
import com.donaboyev.nestednavigationfragments.databinding.FragmentHomeFirstBinding
import com.donaboyev.nestednavigationfragments.databinding.FragmentProfileFirstBinding

class ProfileFirstFragment : Fragment() {

    private var _binding: FragmentProfileFirstBinding? = null
    private val binding: FragmentProfileFirstBinding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}