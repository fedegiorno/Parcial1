package com.fedegiorno.parcial1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.fedegiorno.parcial1.R
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    private lateinit var nav_controller : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        nav_controller = Navigation.findNavController(this,R.id.nav_graph_main2)

        nav_view.setupWithNavController(nav_controller)

        NavigationUI.setupActionBarWithNavController(this, nav_controller, drlMain2)
    }

    override fun onSupportNavigateUp(): Boolean {   //Para definir el comportamiento de giro de las tres rayitas
        return NavigationUI.navigateUp(nav_controller, drlMain2)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.drawer_menu, menu)
        return true
    }

    override fun onBackPressed() {      //para igualar el comportamiento del atras
        if (drlMain2.isDrawerOpen(GravityCompat.START)) {
            drlMain2.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}