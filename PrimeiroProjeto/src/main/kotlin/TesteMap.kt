

fun main(){
    val pair: Pair<String, Int> = Pair("Rafael", 5000)

    val map1= mapOf(pair)


    map1.forEach {(k, v) -> println("O nome e o salário do funcionário são respectivamente: $k e $v ")}


}