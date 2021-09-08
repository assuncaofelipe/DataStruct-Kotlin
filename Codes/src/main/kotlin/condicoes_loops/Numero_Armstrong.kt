package condicoes_loops

import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow
import kotlin.math.roundToInt

// Faça um programa que verifique se o numero é armstrong.
// Dica: pesquise um numero Armstrong pq eu não sei explicar KKKK

fun main() {
    print("Insira o numero: ")
    val x = Integer.valueOf(readLine())

    if (checarNumeroArmstrong(x))  print("\nSim, $x é número armstrong")
    else print("\nNo, $x não é número armstrong")
}

private fun checarNumeroArmstrong(numero: Int): Boolean {
    // GET o digito contador in numero
    val n = floor(log10(numero.toDouble()) + 1).roundToInt()

    var x = numero

    //Encontre a soma pela potência do último dígito em n a contar
    var sum = 0
    while (x > 0) {
        val digit = x % 10
        sum = (sum + (digit.toDouble().pow(n))).roundToInt()
        x /= 10
    }

    // retorna verdadeiro se soma for igual a número
    return sum == numero
}