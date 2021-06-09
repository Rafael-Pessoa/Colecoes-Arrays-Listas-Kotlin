fun main() {
    val values = intArrayOf(0,0,0,0,0)
    values[0]=2
    values[1]=4
    values[2]=6
    values[3]=8
    values[4]=10


    for (i in values){
        println(i)

    }

    values.sort()
    values.forEach {
        println(it)
    }



}