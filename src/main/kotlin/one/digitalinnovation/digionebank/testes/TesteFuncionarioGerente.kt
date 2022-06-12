package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val elaine = Gerente("Elaine Gomes", "123456789", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(elaine)
    TesteAutenticacao().autentica(elaine)
}

