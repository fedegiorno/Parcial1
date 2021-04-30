/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

SplashFragment.kt
Ubicacion: com.fedegiorno.clase27abr.fragments

Este es el fragmento que presentara el logo de la aplicacion
 */

package com.fedegiorno.clase27abr2021.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.fedegiorno.clase27abr.MainActivity
import com.fedegiorno.clase27abr.R

class SplashFragment : Fragment() {

    private val SPLASH_TIME_OUT:Long = 3000     // 3 segundos
    lateinit var v: View
    lateinit var txtSplash: TextView
    lateinit var imgSplash: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            Handler().postDelayed(){

            }
        }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_splash, container, false)
        txtSplash = v.findViewById(R.id.txtSplash)
        imgSplash = v.findViewById(R.id.imgSplash)

        Handler().postDelayed(

                {
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                }
                , SPLASH_TIME_OUT)
        }
        return v
    }