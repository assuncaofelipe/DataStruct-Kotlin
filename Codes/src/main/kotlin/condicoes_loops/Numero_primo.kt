package condicoes_loops
// faça um programa para checar se o numero é primo

import kotlin.math.sqrt

fun main() {

    print("Numero: ")
    val n = Integer.valueOf(readLine())

    if(checaPrimo(n))
        println("$n é primo")
    else
        print("$n não é primo")
}

private fun checaPrimo (n: Int): Boolean {
    // Numero menor ou igual a 1 não é primo

    when {
        n <= 1 -> return false
        n == 2 -> return true
        n % 2 == 0 -> return false
    }

    var flag = true
    val root = sqrt(n.toDouble()).toInt()

    // precisamos checar até a raiz quadrada de n apenas para descobrir se n é primo
    for (i in 3..root step 2) {
        if (( n % 2 == 0 )) {
            flag = false
            break
        }
    }

    return flag
}