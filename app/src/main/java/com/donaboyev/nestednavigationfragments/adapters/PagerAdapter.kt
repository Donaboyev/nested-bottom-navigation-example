package com.donaboyev.nestednavigationfragments.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class PagerAdapter(fragment: Fragment, private val fragments: List<Fragment>) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount() = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]

}