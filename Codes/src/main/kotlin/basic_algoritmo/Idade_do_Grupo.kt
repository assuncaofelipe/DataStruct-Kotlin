package basic_algoritmo

/* Numa eleição existem três candidatos identificados pelos números 1, 2 e 3. Faça um algoritmo que compute o resultado
de uma eleição. Inicialmente o programa deve pedir o número total de votantes. Em seguida, deve pedir para cada
votante votar (informando o numero do candidato) e ao final mostrar o número de votos de cada candidato.
*/

fun main() {
    var cand1 = 0;    var cand2 = 0;    var cand3 = 0
    var item = 1

    print("Total de eleitor: ")
    val totalEleitor = Integer.valueOf(readLine())

    while (item <= totalEleitor) {
        print("\nESCOLHA: Candidato A -> 1 | Candidato B -> 2 | Candidato C -> 3 ")
        print("\nVoto: ")
        val voto = Integer.valueOf(readLine())

        if(voto < 1 || voto > 3) return print("Encerrado")

        when (voto) {
            1 -> cand1 += 1
            2 -> cand2 += 1
            3 -> cand3 += 1
        }
        item += 1
    }

    print("O candidato A teve $cand1 votos.\n")
    print("O candidato B teve $cand2 votos.\n")
    print("O candidato C teve $cand3 votos.\n")

}