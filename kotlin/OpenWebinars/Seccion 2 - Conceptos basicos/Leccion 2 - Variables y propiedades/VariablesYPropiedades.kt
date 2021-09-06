class A {
    var variable1: String //- Esta propiedad es editable
    
    val value1: String //- Esta propiedad NO es editable
    
    var isEmpty: Boolean
    	get() = variable1.count() == 0
    
    var number: Int
    	set(value) {
            if (value >= 0) field = value else field = 0
        }
    
    constructor(variable1: String, value1: String, number: Int) {
        this.variable1 = variable1
        this.value1 = value1
        this.isEmpty = false
        this.number = number
    }
}

fun main(args: Array<String>) {
	var objectA = A("Propiedad mutable", "propiedad inmutable", 4)
    
    println(objectA.variable1)
    
    objectA.variable1 = "Hola Mundo"
    println(objectA.variable1)
    
    println("Número: " + objectA.number)
    objectA.number = -10
    println("Número: " + objectA.number)
    
    //- Retornará un error ya que no es editable
    //objectA.value1 = "Adiós Mundo"
    //println(objectA.value1)
    
    val text = "StringComoArray"
    println("Accedemos al elemento con índice 2: " + text[2])
    
    
    for (item in text) {
        println(item)
    }
    
    //- Strings en Kotlin son inmutables por lo que la siguiente línea retornará un error
    //text[2] = "a" 
}