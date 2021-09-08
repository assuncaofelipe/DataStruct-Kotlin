package Vetores_Arrays

import java.util.*

// faça um programa para inverter um array

fun main() {
    val numeroArray: IntArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var inverteArray = numeroArray.reversedArray()

    print(Arrays.toString((inverteArray)))
}
