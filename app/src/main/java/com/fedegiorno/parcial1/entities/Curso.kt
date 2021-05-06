package com.fedegiorno.parcial1.entities

import android.os.Parcel
import android.os.Parcelable

class Curso( Name: String,
             Descripcion: String,
             Profesor: String,
             Puntaje: String,
             Inicio: String,
             Fin: String,
             Horario: String,
             Carga: String,
             Requisitos: String) : Parcelable {

    var Name: String = Name
    var Descripcion: String = Descripcion
    var Profesor: String = Profesor
    var Puntaje: String = Puntaje
    var Inicio: String = Inicio
    var Fin: String = Fin
    var Horario: String = Horario
    var Carga: String = Carga
    var Requisitos: String = Requisitos

    constructor(source: Parcel) : this(
        source.readString()!!,
        source.readString()!!,
        source.readString()!!,
        source.readString()!!,
        source.readString()!!,
        source.readString()!!,
        source.readString()!!,
        source.readString()!!,
        source.readString()!!
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(Name)
        writeString(Descripcion)
        writeString(Profesor)
        writeString(Puntaje)
        writeString(Inicio)
        writeString(Fin)
        writeString(Horario)
        writeString(Carga)
        writeString(Requisitos)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Curso> = object : Parcelable.Creator<Curso> {
            override fun createFromParcel(source: Parcel): Curso = Curso(source)
            override fun newArray(size: Int): Array<Curso?> = arrayOfNulls(size)
        }
    }
}