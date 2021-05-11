package com.fedegiorno.parcial1.adapters

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fedegiorno.parcial1.R
import com.fedegiorno.parcial1.entities.Curso

class CursoListAdapter(
    private var cursosList: MutableList<Curso>,
        //Recibe la lista de Cursos (son los datos)
    val context:Context,
    val onItemClick: (Int) -> Boolean,
        //Recibe un metodo que se ejecutara en el Fragmento

    ) : RecyclerView.Adapter<CursoListAdapter.CursoHolder>() {
    //Extiende o implementa la clase RecyclerView.Adapter que trabaja con la clase inner CursoHolder

    companion object {
        private val TAG = "CursoListAdapter"
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CursoHolder {
        /* Para buscar el CursoHolder - Instancio el View Holder */
            val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_curso,parent,false)
            return (CursoHolder(view))
    }

    override fun getItemCount(): Int {
        return cursosList.size
    }

    fun setData(newData: ArrayList<Curso>) {
        this.cursosList = newData
        this.notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: CursoHolder, position: Int) {
        /* Uno la vista con los datos */

        holder.setName(cursosList[position].Name)
        holder.setProfe(cursosList[position].Profesor)
        holder.setNivel(cursosList[position].Nivel)

        Glide
            .with(context)
            .load("https://cdn.icon-icons.com/icons2/9/PNG/256/courses_letters_blackboard_board_staff_book_1475.png")
            .centerInside()
            .into(holder.getImageView())

        holder.getCardLayout().setOnClickListener(){
            onItemClick(position)
        }

        holder.getImageView().setOnClickListener(){
            onItemClick(position)
        }
    }

    class CursoHolder(v: View) : RecyclerView.ViewHolder(v) {       //se recibe una vista que es el item
        //Esta clase interna del adapter que va a comunicarse o tomar las instancias del xml
        //Acá se preveen todas las interacciones que puedan hacerse con el item
        private var view: View

        init {
            this.view = v
        }

        fun setName(name: String) {
            val txt: TextView = view.findViewById(R.id.txtCurso)
            txt.text = name
        }

        fun setProfe(profe: String) {
            val txt: TextView = view.findViewById(R.id.txtProfe)
            txt.text = profe
        }

        fun setNivel(nivel: String) {
            val card: ConstraintLayout = view.findViewById(R.id.cnlCurso)
            when (nivel) {
                "Inicial" -> card.setBackgroundColor(Color.MAGENTA)
                "Primario" -> card.setBackgroundColor(Color.GREEN)
                "Secundario" -> card.setBackgroundColor(Color.YELLOW)
            }

        }

        fun getImageView (): ImageView {
            return view.findViewById(R.id.imgCurso)
        }

        fun getCardLayout (): CardView {
            return view.findViewById(R.id.carCurso)
        }

    }

}