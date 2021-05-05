/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

BottomNavbarFragment2
Ubicacion: com.fedegiorno.clase27abr2021.fragments

Este fragmento mostrara lo correspondiente a la segunda division del Nav Bar
 */

package com.fedegiorno.clase27abr2021.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fedegiorno.clase27abr2021.R

class BottomNavbarFragment2 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bottom_navbar1, container, false)
    }
}