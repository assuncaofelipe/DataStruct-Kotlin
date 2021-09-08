package condicoes_loops

// faça um programa para calcular a fibonacci de N números ditas pelo usuário

fun main() {
    print("Qual o tamanho da Fibo que deseja: ")
    val tamanho = Integer.valueOf(readLine())

    var termo1 = 0
    var termo2 = 1

    for (item in 1..tamanho) {
        println("$termo1")

        val soma = termo1 + termo2
        termo1 = termo2
        termo2 = soma
    }

    print("\n\tFim da fibo! O tamanho dela eh: $tamanho \n\n")
}