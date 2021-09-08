package basic_algoritmo

// faça um programa que recebe e verifique a idade do usuário

fun main() {

    print("Nome: ")
    val name = readLine()
    print("Idade: ")
    val age = Integer.valueOf(readLine())

    when {
        age >= 18 -> println("$name é maior de idade - ($age anos) => Entrada livre")
        else ->      println("$name é menor de idade \n => Entrada proíbida")
    }

}