// faça um programa que verifica numeros ímpar/par e diga se é negativo ou positivo
// utilize when

fun main() {
    print("Insira o numero: ")
    val num = Integer.valueOf(readLine())

    if (num < 0) print("Número negativo\n")

    when {
        num == 0 -> {
            print("Numero neutro \n")
        }
        num % 2 == 0 && num > 0 -> {
            print("Numero par positivo\n")
        }
        else -> {
            print("Número ímpar \n")
        }
    }

}