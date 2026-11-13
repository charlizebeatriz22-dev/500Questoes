fun main() {
    println("=== Exercício 110: Iguais ou Diferentes ===")
    print("Digite o 1º número: ")
    val a = readln(). toDoubleOrNull() ?: 0.0

    print("Digite o 2º número: ")
    val b = readln(). toDoubleOrNull() ?: 0.0

    // Utiliza a estrutura condicional se/senão (if/else) para comparar os valores
    if (a == b) {
        println("Iguais")
    } else {
        println("Diferentes")
    }
}