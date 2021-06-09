fun main(){

    val nomes= Array(3){""}
    nomes[0] = "Manoela"
    nomes[1] = "Janaina"
    nomes[2] = "Erlane"

    for(nome in nomes){

        println(nome)
    }

    println("----------------------------------*****")
    nomes[2]="Emilly"
    nomes.sort()
    nomes.forEach {println(it)}

}