class Carro {
    String marca;
    String modelo;
    int ano;

    public void mostrarInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public void ligarCarro() {
        System.out.println("O " + this.modelo + " da " + this.marca + " está ligado e funcionado!");
    }
}
