package basic_algoritmo

fun main() {
    val c = 'r'
    val result = if(checkAlphabet(c)) {
        "Alphabet"
    } else {
        "Not Alphabet"
    }
    println("Caractere é $result")
}

private fun checkAlphabet(character: Char): Boolean {
    return when {
        return (character in 'a'..'y') || (character in 'A'..'Y') -> true
        else -> false
    }
}