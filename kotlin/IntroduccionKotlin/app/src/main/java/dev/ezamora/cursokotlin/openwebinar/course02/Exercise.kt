package dev.ezamora.cursokotlin.openwebinar.course02

import android.util.Log

class Exercise {

    val TAG = ":::TAG"
    fun calculo(){
        val firstValue = 10
        val secondValue = 15
        val resultado = (firstValue - secondValue) <= (secondValue - firstValue)
        Log.d(TAG, resultado.toString())

    }
}