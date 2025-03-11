import kotlin.math.PI

fun main() {
    // Variáveis para armazenar os valores de entrada e a área calculada
    var opcao: Int
    var base: Double
    var altura: Double
    var lado: Double
    var diagonalMaior: Double
    var diagonalMenor: Double
    var baseMaior: Double
    var baseMenor: Double
    var raio: Double
    var area: Double

    // Menu de opções
    println("Escolha a forma geométrica para calcular a área:")
    println("1 - Retângulo")
    println("2 - Quadrado")
    println("3 - Losango")
    println("4 - Trapézio")
    println("5 - Paralelogramo")
    println("6 - Triângulo")
    println("7 - Círculo")
    print("Digite o número da opção: ")
    opcao = readln().toInt()

    when (opcao) {
        1 -> {
            // Retângulo
            print("Digite a base do retângulo: ")
            base = readln().toDouble()
            print("Digite a altura do retângulo: ")
            altura = readln().toDouble()
            area = base * altura
            println("A área do retângulo é: $area")
        }

        2 -> {
            // Quadrado
            print("Digite o lado do quadrado: ")
            lado = readln().toDouble()
            area = lado * lado
            println("A área do quadrado é: $area")
        }

        3 -> {
            // Losango
            print("Digite a diagonal maior do losango: ")
            diagonalMaior = readln().toDouble()
            print("Digite a diagonal menor do losango: ")
            diagonalMenor = readln().toDouble()
            area = (diagonalMaior * diagonalMenor) / 2
            println("A área do losango é: $area")
        }

        4 -> {
            // Trapézio
            print("Digite a base maior do trapézio: ")
            baseMaior = readln().toDouble()
            print("Digite a base menor do trapézio: ")
            baseMenor = readln().toDouble()
            print("Digite a altura do trapézio: ")
            altura = readln().toDouble()
            area = ((baseMaior + baseMenor) * altura) / 2
            println("A área do trapézio é: $area")
        }

        5 -> {
            // Paralelogramo
            print("Digite a base do paralelogramo: ")
            base = readln().toDouble()
            print("Digite a altura do paralelogramo: ")
            altura = readln().toDouble()
            area = base * altura
            println("A área do paralelogramo é: $area")
        }

        6 -> {
            // Triângulo
            print("Digite a base do triângulo: ")
            base = readln().toDouble()
            print("Digite a altura do triângulo: ")
            altura = readln().toDouble()
            area = (base * altura) / 2
            println("A área do triângulo é: $area")
        }

        7 -> {
            // Círculo
            print("Digite o raio do círculo: ")
            raio = readln().toDouble()
            area = PI * raio * raio
            println("A área do círculo é: $area")
        }

        else -> {
            println("Opção inválida!")
        }
    }
}