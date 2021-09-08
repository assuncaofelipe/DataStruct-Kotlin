package Vetores_Arrays

fun main() {
    val pegaArray =  intArrayOf(1, 2, 3, 4, 5)

    /* usando a função fold */
    println(pegaArray.fold(0) { i, e -> i + e })
}