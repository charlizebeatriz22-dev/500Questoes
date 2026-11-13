fun main() {
    print("Digite o 1º número: ")
    var a = readln().toDoubleOrNull() ?: 0.0

    print("Digite o 2º número: ")
    var b = readln().toDoubleOrNull() ?: 0.0

    print("Digite o 3º número: ")
    var c = readln().toDoubleOrNull() ?: 0.0

    var aux: Double
    if (a > b) { aux = a; a = b; b = aux }
    if (a > c) { aux = a; a = c; c = aux }
    if (b > c) { aux = b; b = c; c = aux }

    println("Ordem Decrescente: $c, $b, $a")
}