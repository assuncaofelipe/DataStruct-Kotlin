package condicoes_loops

// Faça um programa para calcular a soma dos quadrados de N numeros naturais
// na potência de 2
// Exemplo: Usuário insere o numero 5 para calcular o quadrado dos numeros de 1 à 5
// calculo: 1*1+2*2+3*3+4*4+5*5 = 55

fun main() {
    print("Numero: ")
    val numero = Integer.valueOf(readLine())
    var soma = 0

    for (i in 1..numero) {
        soma += (i * i)
    }

    println("\nSoma dos quadrados dos primeiro $numero números naturais: $soma")

}