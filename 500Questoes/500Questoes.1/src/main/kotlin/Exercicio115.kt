import kotlin.math.sqrt
fun main() {
    println("=== Exercício 115: Raiz do Maior e Quadrado do Menor ===")
    print("Digite o valor de x: ")
    val x = readln().toDoubleOrNull() ?: 0.0

    print("Digite o valor de y: ")
    val y = readln().toDoubleOrNull() ?: 0.0

    if (x > y) {
        println("Raiz quadrada de x (${x}): ${sqrt(x)}")
        println("Quadrado de y (${y}): ${y * y}")
    } else if (y > x) {
        println("Raiz quadrada de y (${y}): ${sqrt(y)}")
        println("Quadrado de x (${x}): ${x * x}")
    } else {
        println("Números iguais")
    }
}