package com.fedegiorno.parcial1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.fedegiorno.parcial1.R
import com.fedegiorno.parcial1.entities.Curso

class CursoListAdapter(
    private var cursosList: MutableList<Curso>,
    val onItemClick: (Int) -> Boolean) : RecyclerView.Adapter<CursoListAdapter.CursoHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CursoHolder {
        /* Para buscar el CursoHolder - Instancio el View Holder */
            val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_curso,parent,false)
            return (CursoHolder(view))
    }

    override fun onBindViewHolder(holder: CursoHolder, position: Int) {
        /* Uno la vista con los datos */

        holder.setName(cursosList[position].Name)
        holder.setProfe(cursosList[position].Profesor)

//        Glide
//            .with(context)
//            .load("https://firebasestorage.googleapis.com/v0/b/firestoreexample-ec489.appspot.com/o/Fotos%2FGUERNICA.jpg?alt=media&token=001a8ffc-96c2-4aeb-9120-8d5099b3fa1c")
//
//            .centerInside()
//            .into(holder.getImageView());

        holder.getCardLayout().setOnLongClickListener(){
            onItemClick(position)
        }
    }

    override fun getItemCount(): Int {

        return cursosList.size
    }



    class CursoHolder(v: View) : RecyclerView.ViewHolder(v) {

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

        fun getCardLayout (): CardView {
            return view.findViewById(R.id.carCurso)
        }


//
//        fun getImageView () : ImageView {
//            return view.findViewById(R.id.img_item)
//        }

    }

}