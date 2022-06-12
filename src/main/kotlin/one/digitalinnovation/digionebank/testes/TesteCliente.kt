package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo


fun main() {
    val carlos = Cliente(
        nome = "Carlos Silva",
        cpf = "123.123.123.11",
        clienteTipo = ClienteTipo.PF,
        senha ="123456"
    )

    println(carlos)

    TesteAutenticacao().autentica(carlos)

}
