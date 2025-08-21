public class ProjetoLivraria {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.titulo = "Java Básico";
        livro1.autor = "Daniel Lucas";
        livro1.preco = 50.90;
        Livro livro2 = new Livro();
        livro2.titulo = "Programação Orientada a Objetos";
        livro2.autor = "Maria Oliveira";
        livro2.preco = 70.90;

        System.out.println("Livro 1: " + livro1.titulo + " - " + livro1.autor + " - R$ " + livro1.preco);
        livro1.cadastrar();
        livro1.vender();

        System.out.println("Livro 2: " + livro2.titulo + " - " + livro2.autor + " - R$ " + livro2.preco);
        livro2.cadastrar();
        livro2.vender();


        Cliente cliente1 = new Cliente();
        cliente1.nome = "Daniel Lucas Lisboa Cardoso";
        cliente1.cpf = "044.537.662-14";
        cliente1.idade = 22;
        cliente1.cadastrar();
        cliente1.comprarLivro(livro2.titulo);
    }
}
