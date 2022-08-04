package com.burcuerdogan.kotlinoopfundamentals

class SuperMusicians(name: String, instrument: String, age: Int) : Musicians(name, instrument, age) {

    fun sing(){
        println("Nothing else matters")
    }
}