package com.erw.containeractivity.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.erw.containeractivity.fragment.Sample2Fragment
import com.erw.containeractivity.fragment.SampleFragment

class ViewPagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter (fragmentActivity) {

    val NUM_PAGES = 2

    override fun getItemCount(): Int {
        return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                SampleFragment()
            }
            else -> {
                Sample2Fragment()
            }
        }
    }
}




