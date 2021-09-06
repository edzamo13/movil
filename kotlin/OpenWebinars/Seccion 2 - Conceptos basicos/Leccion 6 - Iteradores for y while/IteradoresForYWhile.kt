fun main(args: Array<String>) {
    val listaDeEnterosConNulos: List<Int?> = listOf(0, 1, 2, null)
    for (number in listaDeEnterosConNulos) {
         number?.let { print(it) } ?: println("null")
    }
    
    println("------ in ------")
    
    for (number in 1..10) {
        if (number != 10) print(number) else println(number)
    }
    
    println("------ until ------")
    
    for (number in 1 until 10) {
        print(number)
    }
    
    println("")
    println("------ while ------")
    
    var count = 10
    while (count > 0) {
       print(count)
       count--
    }
}