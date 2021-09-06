package dev.ezamora.cursokotlin.openwebinar.course01.basic

import android.util.Log

val TAG = ":::TAG"
class ClassAndConstructor {
    val TAG = ":::TAG"

    open class A(var var1: String, var var2: String) {
        init {
            Log.i(TAG,"init invocado")
        }
        constructor( var1:String): this(var1, "0")
    }

    class B(var1: String, var2: String, var3: Int) : A(var1, var2), myInterfaces {
        override fun foo() {
            Log.i(TAG, "implements clas fun Foo ")
        }
        fun  concat():String{
            return var1+ var2
        }
    }

    interface myInterfaces {
        fun foo()
    }


    fun main() {
        Log.i(TAG, "Call o create class")
        var A = A(" Var Number One", "Var numbre two")
        Log.i(TAG, "value A" + A.var1)
        var b = B("Var Number One", "Var Numbre two", var3 = 3)
        Log.i(TAG, "class B inheritance and interfaces : ${b.foo()} and value of: ${b.var1} plus function concat = ${b.concat()} "  )
    }


}