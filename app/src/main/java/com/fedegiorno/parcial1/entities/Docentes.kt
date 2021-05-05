package com.fedegiorno.parcial1.entities

import android.os.Parcel
import android.os.Parcelable

class Docente(name: String,
               email: String,
               password: String) : Parcelable {

    var email: String = email
    var name: String = name
    var password: String = password

    constructor(source: Parcel) : this(
        source.readString()!!,
        source.readString()!!,
        source.readString()!!
    )

    override fun describeContents() = 0

    override fun writeToParcel(dest: Parcel, flags: Int) = with(dest) {
        writeString(name)
        writeString(email)
        writeString(password)
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<Docente> = object : Parcelable.Creator<Docente> {
            override fun createFromParcel(source: Parcel): Docente = Docente(source)
            override fun newArray(size: Int): Array<Docente?> = arrayOfNulls(size)
        }
    }
}