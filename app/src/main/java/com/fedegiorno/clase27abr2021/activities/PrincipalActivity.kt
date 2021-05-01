/*
Desarrollo de Aplicaciones para Dispositivos Moviles
TRABAJO PRACTICO
Clase:  27 de abril de 2021
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

PrincipalActivity.kt
Ubicacion: com.fedegiorno.clase27abr2021.activities

Esta es la activity que se presentara luego de haber realizado la presentacion de la aplicacion
(SPLASH) y el login
 */

package com.fedegiorno.clase27abr2021.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.fedegiorno.clase27abr2021.R
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    private lateinit var nav_controller_Principal : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        nav_controller_Principal = Navigation.findNavController(this,R.id.nav_graph_principal)

        nav_view.setupWithNavController(nav_controller_Principal)

        NavigationUI.setupActionBarWithNavController(this, nav_controller_Principal, drlPrincipal)

    }

        override fun onSupportNavigateUp(): Boolean {
            return NavigationUI.navigateUp(nav_controller_Principal, drlPrincipal)
        }

        override fun onCreateOptionsMenu(menu: Menu): Boolean {
            // Inflate the menu; this adds items to the action bar if it is present.
            menuInflater.inflate(R.menu.drawer_menu, menu)
            return true
        }

        override fun onBackPressed() {
            if (drlPrincipal.isDrawerOpen(GravityCompat.START)) {
                drlPrincipal.closeDrawer(GravityCompat.START)
            } else {
                super.onBackPressed()
            }
        }

}


