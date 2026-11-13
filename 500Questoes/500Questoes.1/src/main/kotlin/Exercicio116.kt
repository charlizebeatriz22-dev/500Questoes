fun main() {
    println("=== Exercício 116: Maior entre 3 Números ===")
    print("Digite o 1º número: ")
    val a = readln().toDoubleOrNull() ?: 0.0

    print("Digite o 2º número: ")
    val b = readln().toDoubleOrNull() ?: 0.0

    print("Digite o 3º número: ")
    val c = readln().toDoubleOrNull() ?: 0.0

    if (a > b && a > c) {
        println("Maior: $a")
    } else if (b > c) {
        println("Maior: $b")
    } else {
        println("Maior: $c")
    }
}