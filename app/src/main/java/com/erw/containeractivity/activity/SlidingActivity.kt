package com.erw.containeractivity.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import com.erw.containeractivity.R
import com.erw.containeractivity.adapter.ViewPagerAdapter
import com.erw.containeractivity.databinding.ActivitySlidingBinding
import com.google.android.material.tabs.TabLayoutMediator

class SlidingActivity : AppCompatActivity() {

    var layout: ActivitySlidingBinding? = null
    var tabTitle = arrayOf("sample 1", "sample 2")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sliding)
        layout = ActivitySlidingBinding.inflate(layoutInflater)
        setContentView(layout?.root)

        val viewPagerAdapter = ViewPagerAdapter(this)
        layout?.vpFragment?.adapter = viewPagerAdapter

        layout?.let {
            TabLayoutMediator(it. tlFragment,it.vpFragment) { tab, position ->
                tab.text = tabTitle [position]
            }.attach()
        }

    }
}

