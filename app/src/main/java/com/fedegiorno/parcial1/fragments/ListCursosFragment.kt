/*
Desarrollo de Aplicaciones para Dispositivos Moviles
PRIMER PARCIAL
Temas: BottomNavigationBars, NavigationDrawer, Tabs, Preferences y Splash

ListCursosFragment.kt
Ubicacion: com.fedegiorno.parcial1.fragments

Este es el fragmento contendra el primer grupo de detalles de la lista
 */

package com.fedegiorno.parcial1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fedegiorno.parcial1.R
import com.fedegiorno.parcial1.adapters.CursoListAdapter
import com.fedegiorno.parcial1.entities.Curso
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.fragment_list_cursos.*

class ListCursosFragment : Fragment() {

    lateinit var v: View
    lateinit var recMain2: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager

    var cursos: MutableList<Curso> = ArrayList<Curso>()
    private lateinit var cursosListAdapter: CursoListAdapter

    companion object{
        fun newInstance() = ListCursosFragment
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_list_cursos, container, false)
        recMain2 = v.findViewById(R.id.recMain2)
        return v
    }

    override fun onStart() {
        super.onStart()

        cursos.add(Curso(Name = "Curso Uno",
            Descripcion = "Etapa Uno - Nivel Inicial",
            Profesor = "Profesor Uno",
            Puntaje = "2",
            Inicio = "01/01/2021",
            Fin = "31/03/2021",
            Horario = "de 8 a 18 hs.",
            Carga = "30 Hs.",
            Requisitos = "Docente de Nivel Inicial"))
        cursos.add(Curso(Name = "Curso Dos",
            Descripcion = "Etapa Dos - Nivel Inicial",
            Profesor = "Profesor Dos",
            Puntaje = "2",
            Inicio = "01/01/2021",
            Fin = "31/03/2021",
            Horario = "de 8 a 18 hs.",
            Carga = "40 Hs.",
            Requisitos = "Docente de Nivel Inicial"))
        cursos.add(Curso(Name = "Curso Tres",
            Descripcion = "Etapa Tres - Nivel Primario",
            Profesor = "Profesor Tres",
            Puntaje = "3",
            Inicio = "01/04/2021",
            Fin = "30/06/2021",
            Horario = "de 14 a 18 hs.",
            Carga = "45 Hs.",
            Requisitos = "Docente de Nivel Primario"))
        cursos.add(Curso(Name = "Curso Cuatro",
            Descripcion = "Etapa Cuatro - Nivel Primario",
            Profesor = "Profesor Cuatro",
            Puntaje = "4",
            Inicio = "01/01/2021",
            Fin = "31/03/2021",
            Horario = "de 8 a 18 hs.",
            Carga = "30 Hs.",
            Requisitos = "Docente de Nivel Primario"))
        cursos.add(Curso(Name = "Curso Cinco",
            Descripcion = "Etapa Cinco - Nivel Secundario",
            Profesor = "Profesor Cinco",
            Puntaje = "3",
            Inicio = "01/04/2021",
            Fin = "30/06/2021",
            Horario = "de 8 a 18 hs.",
            Carga = "48 Hs.",
            Requisitos = "Docente de Nivel Secundario"))
        cursos.add(Curso(Name = "Curso Seis",
            Descripcion = "Etapa Seis - Nivel Secundario",
            Profesor = "Profesor Seis",
            Puntaje = "5",
            Inicio = "01/01/2021",
            Fin = "31/03/2021",
            Horario = "de 8 a 18 hs.",
            Carga = "30 Hs.",
            Requisitos = "Docente de Nivel Secundario"))

        // Configuracion del recyclerview
        recMain2.setHasFixedSize(true)
        linearLayoutManager= LinearLayoutManager(context)
        recMain2.layoutManager = linearLayoutManager

        cursosListAdapter = CursoListAdapter(cursos, requireContext()) { pos ->
            onItemClick(pos)
        }
//        cursosListAdapter = CursoListAdapter(cursos, requireContext()) { pos ->
//            onItemClick(pos)
//        }

        recMain2.adapter = cursosListAdapter
        //Se pasa el adaptador al recycler, se muestra en pantalla la lista
    }

    private fun onItemClick(position: Int): Boolean {
        //Toast.makeText(v.context, "Posicion: ${position.toString()}",Toast.LENGTH_LONG).show()
        Snackbar.make(v,position.toString(), Snackbar.LENGTH_SHORT).show()
        return true
    }
}