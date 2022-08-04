package com.burcuerdogan.kotlinoopfundamentals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("Burcu",29)
        myUser.name = "James"
        myUser.age = 50

        println(myUser.age.toString())
        println(myUser.name)

        //encapsulation

        var myMusician1 = Musicians("James","Guitar",55)
        println(myMusician1.age.toString())

        println(myMusician1.returnBandName("Metallica")) //true password
        println(myMusician1.returnBandName("Trivium")) //wrong password

        //inheritance

        var myMusician2 = SuperMusicians("Lars","Drums",65)
        println(myMusician2.age)
        println(myMusician2.returnBandName("Metallica"))
        myMusician2.sing()

        //polymorphism

        //static polymorhism

        var mathematics = Mathematics()
        println(mathematics.sum())
        println(mathematics.sum(3,4))
        println(mathematics.sum(3,4,5))

        //dynamic polymorhism

        val animal = Animal()
        animal.sing() // Animal Class

        val barley = Dog()
        barley.sing() // Dog Class
        barley.test() // Animal Class
        
        //abstract & interface

        println(myUser.information())

        //var myPeople = People() -> Cannot create an instance of an abstract class

        //Classımıza 1'den fazla inheritance alamadığımız için Interface kullanıp Implementation kullanırız.

        var myPiano = Piano()
        myPiano.brand = "Yamaha"
        myPiano.digital = false
        println(myPiano.roomName)
        myPiano.info()

        //Lambda expressions

        fun printString(myString: String) {
            println(myString)
        }

        printString("My Test String")

        val testString = {myString : String -> println(myString)}

        testString("My Lambda String")

        val multiplyLambda = {a: Int, b: Int -> a * b}
        println(multiplyLambda(5,4))

        var multiplyLambda2 : (Int, Int) -> Int = {a,b -> a * b}
        println(multiplyLambda2(5,5))

        //asynchronous

        //callback function, listener function, completion function

        fun downloadMusicians(url: String, completion : (Musicians) -> Unit) {
            //url -> download
            //data
            val kirkHammet = Musicians("Kirk","Guitar",60)
            completion(kirkHammet)
        }

        downloadMusicians("metallica.com", { musicians ->
            println(musicians.age)
        })

    }
}