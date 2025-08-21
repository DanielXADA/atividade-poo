public class Livro {
    String titulo;
    String autor;
    double preco;

    // Método para cadastrar
    void cadastrar() {
        System.out.println("Cadastrando livro: " + titulo + " - " + autor + " - R$ " + preco);
    }

    // Método para vender
    void vender() {
        System.out.println("Livro vendido: " + titulo);
    }
}
