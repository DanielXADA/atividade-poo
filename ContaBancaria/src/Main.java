public class Main {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();


        conta1.numeroConta = "18726-8";
        conta1.titular = "Daniel Lucas";
        conta1.saldo = 982.00;

        conta2.numeroConta = "94732-0";
        conta2.titular = "Lisboa Cardoso";
        conta2.saldo = 741.00;


        System.out.println("--- Operações na Primeira Conta ---");
        conta1.consultarSaldo();
        conta1.depositar(250.00);
        conta1.sacar(150.00);
        conta1.consultarSaldo();

        System.out.println("\n--- Operações na Segunda Conta ---");
        conta2.consultarSaldo();
        conta2.depositar(500.00);
        conta2.sacar(1200.00);
        conta2.consultarSaldo();
    }
}