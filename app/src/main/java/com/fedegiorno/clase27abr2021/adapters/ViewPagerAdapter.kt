/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

ViewPagerAdapter.kt
Ubicacion: com.fedegiorno.clase27abr.adapters

Este adapter trabajara con los tabs
 */

package com.fedegiorno.clase27abr2021.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

import com.fedegiorno.clase27abr2021.fragments.FragmentDetail1
import com.fedegiorno.clase27abr2021.fragments.FragmentDetail2
import com.fedegiorno.clase27abr2021.fragments.FragmentDetail3

class ViewPagerAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {

        return when(position){
            0 -> FragmentDetail1()
            1 -> FragmentDetail2()
            2 -> FragmentDetail3()

            else -> FragmentDetail1()
        }
    }

    override fun getItemCount(): Int {
        return TAB_COUNT
    }

    companion object {
        private const val TAB_COUNT = 3
    }
}