package basic_algoritmo

// faça um programa que verifica numeros ímpares e pares com if e else if

fun main() {

    print("Insira o numero: ")
    val num = Integer.valueOf(readLine())

    if (num == 0 ) print("Numero neutro \n")
    else if (num % 2 == 0) print("Numero par \n")
    else print("Número ímpar \n")

}