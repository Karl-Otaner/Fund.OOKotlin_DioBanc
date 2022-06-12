package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.ImprimeRelatorioFuncionario

fun main() {
    val elaine = Gerente("Elaine Gomes", "123456789", 5000.0)
    ImprimeRelatorioFuncionario.imprime(elaine)
}

