package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Carlos"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun  pessoaInf() = "$nome e $cpf"

}

    fun main() {
        val carlos = Pessoa()
        println(carlos.pessoaInf())
    }