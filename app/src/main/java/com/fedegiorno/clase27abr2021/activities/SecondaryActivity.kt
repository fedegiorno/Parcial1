/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

SecundaryActivity.kt
Ubicacion: com.fedegiorno.clase27abr2021.activities

Esta activity mostrara el uso de NavigationDrawer
 */

package com.fedegiorno.clase27abr2021.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.fedegiorno.clase27abr2021.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class SecondaryActivity : AppCompatActivity() {

    private lateinit var bottomNavView : BottomNavigationView
    private lateinit var navHostFragment : NavHostFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        navHostFragment = supportFragmentManager.findFragmentById(R.id.NavHostSecondary) as NavHostFragment

        bottomNavView = findViewById(R.id.Bottom_Bar)

        NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)

    }
}