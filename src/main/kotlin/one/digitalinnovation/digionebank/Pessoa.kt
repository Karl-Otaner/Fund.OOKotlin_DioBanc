package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Carlos"
    var cpf: String = "123.123.123-12"

}
    fun main() {
        val carlos = Pessoa()

        println(carlos.nome)
        println(carlos.cpf)
    }