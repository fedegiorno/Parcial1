/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

LoginFragment.kt
Ubicacion: com.fedegiorno.clase27abr2021.fragments

Este es el fragmento que presentara el login de la aplicacion
 */

package com.fedegiorno.clase27abr2021.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fedegiorno.clase27abr2021.R
import androidx.navigation.findNavController
import android.widget.Button

class LoginFragment : Fragment() {

    lateinit var v: View
    lateinit var btnAcceder: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        v=inflater.inflate(R.layout.fragment_login, container, false)
        // Inflate the layout for this fragment
        btnAcceder = v.findViewById(R.id.btnAcceder)

        return v
    }

    override fun onStart() {
        super.onStart()
        btnAcceder.setOnClickListener{

            val action2 = FragmentLoginDirections.actionsplashFragmenttofragmentLogin()

            v.findNavController().navigate(action2)
        }
    }
}
