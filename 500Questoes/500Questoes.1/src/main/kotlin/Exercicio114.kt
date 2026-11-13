fun main() {
    println("=== Exercício 114: Ordem Decrescente (2 Valores) ===")
    print("Digite o 1º número: ")
    val a = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite o 2º número: ")
    val b = readLine()?.toDoubleOrNull() ?: 0.0

    if (a > b) {
        println("$a, $b")
    } else {
        println("$b, $a")
    }
}