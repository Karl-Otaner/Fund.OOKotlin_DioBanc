package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("Carlos Silva", "123456789", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
