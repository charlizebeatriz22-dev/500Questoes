fun main() {
    println("=== Exercício 113: Ordem Crescente (2 Valores) ===")
    print("Digite o 1º número: ")
    val a = readln().toDoubleOrNull() ?: 0.0

    print("Digite o 2º número: ")
    val b = readln().toDoubleOrNull() ?: 0.0

    if (a < b) {
        println("$a, $b")
    } else {
        println("$b, $a")
    }
}