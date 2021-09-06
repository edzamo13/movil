package dev.ezamora.cursokotlin.openwebinar.course02

import android.util.Log

class RetoFirts {
    val TAG = ":::TAG"

    fun retornaRetoFirst(){
        val programer= Programer();
        programer.getProgramerData()
       Log.d(TAG, programer.getProgramerData().toString())
    }


    class Programer: ProgramerInterface {
        override fun getProgramerData(): ProgramerData {

            return ProgramerData(geName(),getEdad(),getLenguaje())
        }


        private fun geName():String{
            return "Elvin"
        }
        private fun getEdad():Int{
            return 38
        }
        private fun getLenguaje():String{
            return "Kotlin"
        }
    }


    interface ProgramerInterface{
        fun getProgramerData(): ProgramerData
    }

    data class ProgramerData(
        val name:String,
        val age:Int,
        val lengauje:String
    )

}