public class Cliente {
    String nome;
    String cpf;
    int idade;

    void cadastrar() {
        System.out.println("Cadastrando cliente: " + nome + " - CPF: " + cpf + " - Idade: " + idade);
    }

    void comprarLivro(String tituloLivro) {
        System.out.println(nome + " comprou o livro: " + tituloLivro);
    }
}
