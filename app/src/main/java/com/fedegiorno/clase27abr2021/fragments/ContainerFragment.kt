/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

ContainerFragment.kt
Ubicacion: com.fedegiorno.clase27abr2021.fragments

Este es el fragmento que trabajara como contenedor de los fragmentos dedicados a mostrar los
detalles de la lista que estaran en tres pestañas
 */

package com.fedegiorno.clase27abr2021.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.fedegiorno.clase27abr2021.R
import com.fedegiorno.clase27abr2021.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ContainerFragment : Fragment() {

    lateinit var v: View
    lateinit var vpgContainer: ViewPager2
    lateinit var tabContainer: TabLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        v = inflater.inflate(R.layout.fragment_container, container, false)

        tabContainer = v.findViewById(R.id.tabContainer)

        vpgContainer = v.findViewById(R.id.vpgContainer)

        return v
    }

    override fun onStart() {
        super.onStart()

        vpgContainer.setAdapter(ViewPagerAdapter(requireActivity()))
        // viewPager.isUserInputEnabled = false

        TabLayoutMediator(tabContainer, vpgContainer, TabLayoutMediator.TabConfigurationStrategy { tab, position ->
            when (position) {
                0 -> tab.text = "Presentacion"
                1 -> tab.text = "Temario"
                2 -> tab.text = "Requisitos"
                else -> tab.text = "undefined"
            }
        }).attach()
    }


}