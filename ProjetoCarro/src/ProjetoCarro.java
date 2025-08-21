public class ProjetoCarro {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro1.marca = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2010;

        carro2.marca = "Chevrolet";
        carro2.modelo = "Onix";
        carro2.ano = 2021;

        carro3.marca = "Volkswagen";
        carro3.modelo = "Gol";
        carro3.ano = 2018;

        System.out.println("--- Informações Iniciais dos Carros ---");
        System.out.println("\nCarro 1:");
        carro1.mostrarInformacoes();
        System.out.println("\nCarro 2:");
        carro2.mostrarInformacoes();
        System.out.println("\nCarro 3:");
        carro3.mostrarInformacoes();

        carro1.modelo = "siena";
        carro1.ano = 2016;

        System.out.println("\n--- Informações do Carro 1 atualizado ---");
        carro1.mostrarInformacoes();

        System.out.println("\n--- Teste Drive ---");
        System.out.println("\nUsando o Carro 1:");
        carro1.ligarCarro();
        System.out.println("\nUsando o Carro 2:");
        carro2.ligarCarro();
        System.out.println("\nUsando o Carro 3:");
        carro3.ligarCarro();
    }
}