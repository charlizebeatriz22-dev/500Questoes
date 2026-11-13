fun main() {
    print("Digite o 1º número: ")
    val a = readln().toDoubleOrNull() ?: 0.0

    print("Digite o 2º número: ")
    val b = readln().toDoubleOrNull() ?: 0.0

    print("Digite o 3º número: ")
    val c = readln().toDoubleOrNull() ?: 0.0

    var maior = a
    if (b > maior) {
        maior = b
    }
    if (c > maior) {
        maior = c
    }

    println("O maior número é: $maior")
}