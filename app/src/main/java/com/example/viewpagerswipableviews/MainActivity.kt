package com.example.viewpagerswipableviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.model_3,
            R.drawable.model_s,
            R.drawable.model_x,
            R.drawable.cybertruck,
            R.drawable.semi
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter

        // the default orientation is horizontal but if we want to change the swiping directions we can use the code below.

        viewPager.orientation= ViewPager2.ORIENTATION_VERTICAL

        // we can also simulate fake drags
        viewPager.beginFakeDrag()
        viewPager.fakeDragBy(-10f)
        viewPager.endFakeDrag()
    }
}