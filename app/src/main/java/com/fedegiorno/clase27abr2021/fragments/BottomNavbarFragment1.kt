/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

BottomNavbarFragment1
Ubicacion: com.fedegiorno.clase27abr2021.fragments

Este fragmento mostrara lo correspondiente a la primera division del Nav Bar
 */

package com.fedegiorno.clase27abr2021.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fedegiorno.clase27abr2021.R

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment1.newInstance] factory method to
 * create an instance of this fragment.
 */
class BottomNavbarFragment1 : Fragment() {

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

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment1.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BottomNavbarFragment1().apply {
                arguments = Bundle().apply {
                }
            }
    }
}