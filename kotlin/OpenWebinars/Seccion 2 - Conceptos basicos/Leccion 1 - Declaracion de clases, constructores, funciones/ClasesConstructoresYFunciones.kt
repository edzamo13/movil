//- Definición de clase de la que se va a heredar
open class A (var var1: String, var var2: Int) {
    init {
        //- Puedes añadir código aquí para el constructor principal
    }
    
    constructor(var1: String) : this(var1, 0)
}

//- Definición de interfaz
interface MyInterface {
    fun foo()
}

//- Clase que extienede de A pero no implementa MyInterface
class C (var1: String, var2: Int, var var3: String) : A(var1, var2)

//- Clase que no extienede de A pero implementa MyInterface
class D (var1: String, var2: Int, var var3: String) : MyInterface {
    override fun foo() {
        println("Función test")
    }
}

//- Clase que extienede de A e implementa MyInterface
class B (var1: String, var2: Int, var var3: String) : A(var1, var2), MyInterface {
    override fun foo() {
        println("Función test")
    }
    
    fun concat(): String {
        return var1 + var3
    }
    
    fun sum(number: Int = 0): Int {
        return var2 + number
    }
}

fun main(args: Array<String>) {
    var objectB = B("variable1", 1, "variable3")
    println("Var1 de A = " + objectB.var1)
    println("Var3 de B = " + objectB.var3)
    objectB.foo()
    println("Resultado de concat = " + objectB.concat())
    println("Resultado de sum = " + objectB.sum(10))
}