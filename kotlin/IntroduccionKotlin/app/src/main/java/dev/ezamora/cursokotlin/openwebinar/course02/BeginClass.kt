package dev.ezamora.cursokotlin.openwebinar.course02

import android.util.Log



class BeginClass {
    val TAG = ":::TAG"

     fun variableAndconstante(){
        var myFirstVariable = "Hellow World!"
        val myFirstConstant = "Hellow Constante"
        // myFirstConstant="ddd";
        Log.d(TAG,myFirstVariable)


    }

     fun typeOfdata(){
        val seconValue = 3
        val firstValue = 6
        val suma: Int = firstValue + seconValue
        val resta: Int = firstValue - seconValue
        val mult: Int = firstValue * seconValue
        val div: Int = firstValue / seconValue
        val resto: Int = firstValue % seconValue

        //para comvertir una variable string $

        Log.d(TAG,"el resultado es $div" )

    }

    private fun nullSafety(){
        val nullString : String?=null

        if (nullString!= null){

        }

        nullString.let {
            if (nullString != null) {
                Log.d(TAG,nullString)
            }
        }?: kotlin.run {
            if (nullString != null) {
                Log.d(TAG,nullString)
            }
        }
    }


    private fun sumFuction (x: Int,y: Int): Int {
        return x+y;
    }


    
    public fun clases(){
        val personData = PersonData(name = "Elvin",age = 38)
        val edwin= Persona(personData)
       // val pepe= Persona("José",38)
       val  returnAge= edwin.returnAge(1982)
        edwin.presentacion();
    }
    

    class  Persona(private val data: PersonData): PersonaInterface {
        fun presentacion () {
            Log.d("TAG","la informacion de ${data.name} y su edad es: ${data.age}")
        }

        override fun returnAge(brithYear: Int): Int =2020
    }

data class PersonData(
    val name: String?,
    val age: Int
        )


    interface PersonaInterface{
        fun returnAge(brithYear: Int):Int
    }

}