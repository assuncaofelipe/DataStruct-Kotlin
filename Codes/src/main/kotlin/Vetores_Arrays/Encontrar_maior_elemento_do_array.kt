package Vetores_Arrays

// encontre o maior elemente de dentro do vetor usando funções prontas

fun main() {

    val numArray: IntArray = intArrayOf(10, 20, 30, 40, 50)
    // val numArray =  intArrayOf(1, 2, 3, 4, 5)

    var maiorElemento = numArray[0]

    for (elemento in numArray) {
        if (maiorElemento < elemento)
            maiorElemento = elemento
    }

    println("\n\tO maior elemento do Array é %d".format(maiorElemento))
}