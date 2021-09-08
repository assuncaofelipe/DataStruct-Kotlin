package basic_algoritmo

// leia 3 notas de um aluno e diga se ele foi aprovado ou não
// Aprovado >= 7, Reprovado < 7 ou aprovado com louvor = 10

fun main() {
    print("Nota A: ")
    val notaA = Integer.valueOf(readLine())

    print("Nota B: ")
    val notaB = Integer.valueOf(readLine())

    print("Nota C: ")
    val notaC = Integer.valueOf(readLine())

    val result = (notaA+ notaB+ notaC)/3

    when{
        result == 10 -> print("Aprovado com louvor\n")

        // isto é: result < 10 && result >= 7
        result in 7..9 -> print("Aprovado com nota regular\n")

        result <= 3 -> print("vai estudar carai\n")

        else -> print("Reprovado")

    }
}