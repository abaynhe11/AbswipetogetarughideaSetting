package com.google.firebase.quickstart.auth.abswipetogetarughideasetting

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class IntroViewPagerAdapter(supportFragmentManager: FragmentManager) : FragmentStatePagerAdapter(supportFragmentManager)
{ override fun getItem(position: Int): Fragment {
    return IntroFragment.newInstance("Title" + position)
} override fun getCount(): Int {
    return 4
}

}