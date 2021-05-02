/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

DetailFragment1.kt
Ubicacion: com.fedegiorno.clase27abr2021.fragments

Este es el fragmento contendra el primer grupo de detalles de la lista
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
 */
class DetailFragment1 : Fragment() {

    lateinit var v : View

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_detail1, container, false)
        return v
    }

}
