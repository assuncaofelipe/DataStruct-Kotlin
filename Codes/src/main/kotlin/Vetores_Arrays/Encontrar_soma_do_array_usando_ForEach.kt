package Vetores_Arrays

fun main() {
    val pegaArray =  intArrayOf(1, 2, 3, 4, 5)

    var soma = 0
    pegaArray.forEach { soma += it }

    println(soma)
}