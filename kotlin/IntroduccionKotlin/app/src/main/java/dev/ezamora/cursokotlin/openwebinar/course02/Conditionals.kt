package dev.ezamora.cursokotlin.openwebinar.course02

import android.util.Log

class Conditionals {
    val TAG = ":::TAG"

    fun conditionalIf(){
        val flag:Boolean
        flag= true

        if (flag){
            Log.i(TAG,"Valor $flag")
        }else{
            Log.i(TAG,"Valor $flag")
        }

    }

    fun coditionalWhen(){

        val lenguaje = "Kotlin"
        when(lenguaje){
            "Kotlin" -> {
                Log.i(TAG,"Seleccionaste $lenguaje")
                Log.i(TAG,"ejemplo de varios if ")
            }
            "Java" -> Log.i(TAG,"Seleccionaste $lenguaje")
            "JavaScript" -> Log.i(TAG,"Seleccionaste $lenguaje")
            else->Log.d(TAG,"Haz seleccionado otro Lenguaje")
        }

    }

    fun conditionalFor(){
        val myArrayList : ArrayList<String> = arrayListOf("edwin","patrico","zamora","morocho");




        for (cad in myArrayList){
            Log.i(TAG,cad)
        }
        for (position in 0..5){
            Log.i(TAG,position.toString())
        }

        for (position in 0..10 step 2){
            Log.i(TAG,position.toString())
        }

        Log.d("TAG", "-------------------")
        var number = 4
        do {
            Log.d("TAG", number.toString())
            number++
        } while (number < 3)
    }
}