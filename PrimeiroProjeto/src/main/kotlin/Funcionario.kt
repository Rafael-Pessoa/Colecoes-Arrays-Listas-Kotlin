data class Funcionario(val nome:String, val salario:Double, val tipo:String) {

    val senha:String = "JapaneseSamurai"

    override fun toString(): String {
        return "------------------\n" +
        "Nome:$nome\n"+
        "Salário: $salario\n" +
        "------------------\n"
    }

}
