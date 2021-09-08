package condicoes_loops

// Faça um programa para calcular a soma dos cubos (potencia de 3) de N numeros naturais
// Exemplo: Usuário insere o numero 5 para calcular o quadrado dos numeros de 1 à 5
// calculo: 1*1*1 + 2*2*2 + 3*3*3 + 4*4*4 + 5*5*5 = 225

fun main() {
    print("Numero: ")
    val number = Integer.valueOf(readLine())
    var soma=0

    for (i in 1..number) {
        soma += (i * i * i)
    }

    print("A soma do cubo dos primeiros $number numeros naturais eh: $soma\n")
}