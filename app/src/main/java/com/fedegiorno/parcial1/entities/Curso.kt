package com.fedegiorno.parcial1.entities

import android.os.Parcel
import android.os.Parcelable

class Curso( Name: String?,
             Descripcion: String?,
             Profesor: String?,
             Puntaje: String?,
             Inicio: String?,
             Fin: String?,
             Horario: String?,
             Carga: String?,
             Nivel: String?,
             Requisitos: String?)  {

    var Name: String = ""
    var Descripcion: String = ""
    var Profesor: String = ""
    var Puntaje: String = ""
    var Inicio: String = ""
    var Fin: String = ""
    var Horario: String = ""
    var Carga: String = ""
    var Nivel: String = ""
    var Requisitos: String = ""

    init{
        this.Name = Name!!
        this.Descripcion = Descripcion!!
        this.Profesor = Profesor!!
        this.Puntaje = Puntaje!!
        this.Inicio = Inicio!!
        this.Fin = Fin!!
        this.Horario = Horario!!
        this.Carga = Carga!!
        this.Nivel = Nivel!!
        this.Requisitos = Requisitos!!
    }

}
