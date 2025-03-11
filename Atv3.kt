fun main() {
    //Escreva um programa em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".


    // Criando as variáveis para armazenar o nome e a idade
    val nome: String
    val idade: Int

    // Pedindo ao usuário para digitar o nome
    print("Digite seu nome: ")
    nome = readln()

    // Pedindo ao usuário para digitar a idade
    print("Digite sua idade: ")
    idade = readln().toInt()

    // Exibindo a mensagem personalizada
    println("Olá, $nome, sua idade é $idade.")
}