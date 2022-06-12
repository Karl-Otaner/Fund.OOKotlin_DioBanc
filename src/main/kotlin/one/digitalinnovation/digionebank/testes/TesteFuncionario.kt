package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val carlos = Pessoa(nome = "Carlos Silva", cpf = "123456709")
    println(carlos.nome)
    println(carlos.cpf)

    val joao = Funcionario("Carlos Silva", "123456789", BigDecimal.valueOf(2000.0))
}