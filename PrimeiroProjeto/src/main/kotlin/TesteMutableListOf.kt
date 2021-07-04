fun main(){

    var joao = Funcionario("Joao",2500.0,"CLT")
    var emilly = Funcionario("Emilly",25000.0,"CLT")
    var maria = Funcionario("Maria",1800.0,"CLT")

    println("******************MutableListOf**********************")
    var funcionarios = mutableListOf(joao, emilly)

    funcionarios.forEach{ println(it)}

    funcionarios.add(maria)
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it)}

    println("******************SetOf**********************")
    var funcionariosSet= mutableSetOf(joao)

    funcionariosSet.forEach{println(it)}
    funcionariosSet.add(emilly)
    funcionariosSet.add(maria)

    funcionariosSet.forEach{println(it)}


}