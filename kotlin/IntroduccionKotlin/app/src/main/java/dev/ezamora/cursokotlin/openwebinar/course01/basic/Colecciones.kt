package dev.ezamora.cursokotlin.openwebinar.course01.basic

class Colecciones {

    private fun sumaArray() {
        val arrayS = IntArray(10, { x -> x + 2 })
        for (n in arrayS) {
            print("Array " + n)
        }

    }


    private fun listFilterContiene() {
        println()
        val list = listOf("Texto 1", "Texto 2", "Texto 3")
        val lisR = list.filter {
            it.contains("2")
        }
        for (v in lisR) {
            println("lista Resultado " + v)
        }

    }

    fun main() {
        val ints = IntArray(10)
        for (number in ints) {
            println("numeros " + number)
        }

        sumaArray()
        listFilterContiene()
    }

}