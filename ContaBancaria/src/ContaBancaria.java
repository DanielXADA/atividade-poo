class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.printf("Depósito realizado: R$ %.2f . Novo saldo: R$ %.2f\n", valor, this.saldo);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.printf("Saque realizado: R$ %.2f . Novo saldo: R$ %.2f\n", valor, this.saldo);
        } else {
            System.out.println("Saque não realizado. Saldo insuficiente ou inválido.");
        }
    }

    public void consultarSaldo() {
        System.out.printf("O saldo atual da conta de %s é de R$ %.2f\n", this.titular, this.saldo);
    }
}