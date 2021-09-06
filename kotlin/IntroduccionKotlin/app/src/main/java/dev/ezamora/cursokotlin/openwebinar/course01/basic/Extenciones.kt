package dev.ezamora.cursokotlin.openwebinar.course01.basic

class Extenciones {

    class A(var var1: Int, var var2: Int, private var var3: Int) {
        fun sum(): Int {
            return var1 + var2 + var3
        }
    }

    fun A.multiply(): Int {
        return this.var1 * this.var2
    }

    fun main() {
        var objectA = A(1, 2, 3)
        println("suma:" + objectA.sum())
        println("Multiplicacion:" + objectA.multiply())
    }

}