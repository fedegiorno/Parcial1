/*
Desarrollo de Aplicaciones para Dispositivos Moviles
PRIMER PARCIAL
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

PreferenceActivity.kt
Ubicacion: com.fedegiorno.parcial1.activities

Esta es la activity que se presentara los datos persistentes de la aplicacion
(PREFERENCES)
 */

package com.fedegiorno.parcial1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.fedegiorno.parcial1.R

class PreferenceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preference)
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.preferencias, PreferenceFragment())
            .commit()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    class PreferenceFragment : PreferenceFragmentCompat() {
        override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey)
        }
    }
}