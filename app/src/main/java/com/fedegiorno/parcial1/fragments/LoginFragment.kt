/*
Desarrollo de Aplicaciones para Dispositivos Moviles
PRIMER PARCIAL
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

LoginFragment.kt
Ubicacion: com.fedegiorno.parcial1.fragments

Este es el fragmento que presentara el login de la aplicacion
 */

package com.fedegiorno.parcial1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fedegiorno.parcial1.R
import android.widget.Button
import androidx.navigation.findNavController

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

            val action2 = LoginFragmentDirections.actionLoginFragmentToMainActivity2()

            v.findNavController().navigate(action2)
        }
    }
}
