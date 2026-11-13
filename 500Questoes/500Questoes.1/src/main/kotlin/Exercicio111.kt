fun main() {
    println("=== Exercício 111: Maior de Dois Números ===")
    print("Digite o 1º número: ")
    val a = readln()?.toDoubleOrNull() ?: 0.0

    print("Digite o 2º número: ")
    val b = readln()?.toDoubleOrNull() ?: 0.0

    if (a > b) {
        println("maior: $a")
    } else {
        println("maior: $b")
    }
}