import java.util.Scanner;

public class ProjetoAluno {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        System.out.println("--- Criando Aluno 1 ---");
        System.out.print("Digite o nome do Aluno 1: ");
        aluno1.nome = Teclado.nextLine();
        System.out.print("Digite a matrícula do Aluno 1: ");
        aluno1.matricula = Teclado.nextInt();
        System.out.print("Digite a nota da AV1 do Aluno 1: ");
        aluno1.notaAv1 = Teclado.nextDouble();
        System.out.print("Digite a nota da AV2 do Aluno 1: ");
        aluno1.notaAv2 = Teclado.nextDouble();

        Teclado.nextLine(); 

        System.out.println("\n--- Criando Aluno 2 ---");
        System.out.print("Digite o nome do Aluno 2: ");
        aluno2.nome = Teclado.nextLine();
        System.out.print("Digite a matrícula do Aluno 2: ");
        aluno2.matricula = Teclado.nextInt();
        System.out.print("Digite a nota da AV1 do Aluno 2: ");
        aluno2.notaAv1 = Teclado.nextDouble();
        System.out.print("Digite a nota da AV2 do Aluno 2: ");
        aluno2.notaAv2 = Teclado.nextDouble();

        Teclado.nextLine(); 

        System.out.println("\n--- Dados Iniciais ---");
        System.out.println("\nAluno 1:");
        aluno1.mostrarDados();
        System.out.println("\nAluno 2:");
        aluno2.mostrarDados();

        System.out.println("\n--- Atualização de Nota ---");
        System.out.print("\nDigite a nova nota da AV2 do Aluno 1: ");
        double novaNota = Teclado.nextDouble();
        aluno1.notaAv2 = novaNota;

        System.out.println("\n--- Dados Atualizados do Aluno 1 ---");
        aluno1.mostrarDados();

        System.out.println("\n--- Verificando Aprovação ---");
        System.out.println("\nVerificação para o Aluno 1:");
        aluno1.verificarAprovacao();
        
        System.out.println("\nVerificação para o Aluno 2:");
        aluno2.verificarAprovacao();

        Teclado.close();
    }
}