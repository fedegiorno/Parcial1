/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

PreferenceActivity.kt
Ubicacion: com.fedegiorno.clase27abr.activities

Esta es la activity que se presentara los datos persistentes de la aplicacion
(PREFERENCES)
 */

package com.fedegiorno.clase27abr2021.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fedegiorno.clase27abr2021.R

class PreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)
    }
}