package com.burcuerdogan.kotlinoopfundamentals

open class Musicians(name: String, instrument: String, age: Int) {

    //encapsulation

    private var name : String? = name
        private set
        get
    private var instrument : String? = instrument

    var age : Int? = age
        private set
        get

    private val bandName : String = "Metallica"

    fun returnBandName(password: String) : String {
        if (password == "Metallica"){
            return bandName
        } else {
            return "Wrong Password"
        }
    }

}