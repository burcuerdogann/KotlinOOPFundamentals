package com.burcuerdogan.kotlinoopfundamentals

class Piano : HouseDecor, Instrument {

    var brand : String? = null
    var digital : Boolean? = null

    override var roomName: String
        get() = TODO("Not yet implemented")
        set(value) {}

}