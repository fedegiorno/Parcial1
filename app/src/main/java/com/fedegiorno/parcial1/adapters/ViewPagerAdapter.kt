/*
Desarrollo de Aplicaciones para Dispositivos Moviles
PRIMER PARCIAL
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

ViewPagerAdapter.kt
Ubicacion: com.fedegiorno.parcial1.adapters

Este adapter trabajara con los tabs
 */

package com.fedegiorno.parcial1.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

import com.fedegiorno.parcial1.fragments.DetailFragment1
import com.fedegiorno.parcial1.fragments.DetailFragment2
import com.fedegiorno.parcial1.fragments.DetailFragment3

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 -> DetailFragment1()
            1 -> DetailFragment2()
            2 -> DetailFragment3()

            else -> DetailFragment1()
        }
    }

    override fun getItemCount(): Int {
        return TAB_COUNT
    }

    companion object {
        private const val TAB_COUNT = 3
    }
}