

fun main(){


    val salario = DoubleArray(3)

    salario[0] = readLine()!!.toDouble()
    salario[1] = readLine()!!.toDouble()
    salario[2] = readLine()!!.toDouble()

    println("O salario inserido no indice 1 foi: ${salario[0]}")
    println("O salario inserido no indice 2 foi: ${salario[1]}")
    println("O salario inserido no indice 3 foi: ${salario[2]}")


    println(salario.count{it > 2000.0})
    println(salario.find{it == 2000.0})







}