fun main() {
    //Escreva um programa em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

    // Criando a variável para armazenar o nome
    val nome: String

    // Pedindo ao usuário para digitar o nome
    print("Digite seu nome: ")
    nome = readln()

    // Exibindo a mensagem personalizada
    println("Olá, $nome!")
}