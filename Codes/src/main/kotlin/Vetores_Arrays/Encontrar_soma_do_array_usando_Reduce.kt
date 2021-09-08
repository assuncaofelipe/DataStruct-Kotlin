package Vetores_Arrays

fun main() {
    val pegaArray =  intArrayOf(1, 2, 3, 4, 5)

    // It vai imprimir a soma
    println(pegaArray.reduce { soma, e -> soma + e })
}