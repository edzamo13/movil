package dev.ezamora.cursokotlin.openwebinar.course01.basic;

import android.util.Log




class BasicConcept {

    open class A(var1: String?)
    class B( var1: String?, var var2: String): A(var1)
    class C( var1: String, var var4: String): A(var1)


    private fun nullabilidad() {
        var objectA = A(null)
        println("Calculo" + objectA)
        Log.i(TAG, objectA.toString());
      //  println("Count va1" + objectA.var1?.count())


    }

    private  fun casting(){

    }


    fun main() {
        Log.i(TAG, "nullabilidad");
    nullabilidad()

    }

}
