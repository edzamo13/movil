package dev.ezamora.cursokotlin.openwebinar.course02

import android.util.Log

class RetoSecond {
    val TAG = ":::TAG"

    /*
1.- Crear una funcion que se llame botDeSeguridad() y llamarla desde nuestro metodo onCreate()
2.- Crear una clase de datos llamada Persona

Reglas:
1.- La clase de datos debe incluir tres constantes llamadas name, age y hobbies (que es un listado de strings)
2.- Creamos una variable de tipo Persona con nuestra información (nombre, edad y un listado de hobbies)
3.- Mediante el uso de condicionales nuestro bot debe:
    - Mostrarnos un mensaje de error en caso de que el nombre que tenga la clase Persona no sea el nuestro y
    no dejarnos acceder, o de lo contrario, mostrar el mensaje de éxito y continuar
    - Manejar los siguientes rangos de edad:
        - En caso de que tengamos entre 0 y 17 años, el bot nos dirá que somos menores de edad, y que por tanto
        acceso denegado, en caso de tener entre 65 y 100 nos diría lo mismo pero por ser demasiado mayores y si
        tenemos entre 18 y 64 años dejarnos pasar y mostrar un mensaje de éxito.
    - Por último, recorrer con un bucle nuestros hobbies y mostrarlos por pantalla
*/

     fun botDeSeguridad() {
        val persona = Persona("Rodrigo", 63, arrayListOf("Programar", "TV", "Deportes"))

        if (persona.name == "Rodrigo") {
            Log.d(TAG, "Bienvenido ${persona.name}")

            when (persona.age) {
                in 0..17 -> {
                    Log.d(TAG, "Tienes ${persona.age} años, eres demasiado joven para acceder.")
                }
                in 18..64 -> {
                    Log.d(TAG, "Tienes ${persona.age} años, eres mayor de edad, bienvenido.")

                    for (hobby in persona.hobbies) {
                        Log.d(TAG, "Te gusta $hobby")
                    }
                }
                in 65..100 -> {
                    Log.d(TAG, "Tienes ${persona.age} años, eres demasiado mayor para acceder.")
                }
            }
        } else {
            Log.d(TAG, "Largo de aquí ${persona.name}!")
        }
    }

    data class Persona(
        val name: String,
        val age: Int,
        val hobbies: ArrayList<String>
    )
}