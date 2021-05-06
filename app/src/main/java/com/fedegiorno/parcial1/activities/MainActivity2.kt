package com.fedegiorno.parcial1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fedegiorno.parcial1.R
import android.view.Menu
import androidx.core.view.GravityCompat
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {

    private lateinit var nav_controller_2 : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        nav_controller_2 = Navigation.findNavController(this,R.id.nav_graph_principal)

        nav_view.setupWithNavController(nav_controller_2)

       // NavigationUI.setupActionBarWithNavController(this, nav_controller_2, drlPrincipal)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(nav_controller_2, drlPrincipal)
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