import java.util.Scanner;

public class contaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;

        System.out.println("-conta do banco-");
        System.out.println("Digite o numero da conta: ");
        numero = scanner.nextInt();

        System.out.println("digite o numero da agencia: ");
        agencia = scanner.next();

        System.out.println("informe seu nome: ");
        nomeCliente = scanner.next();
        scanner.nextLine();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo 237.48 já está disponível"
				+ " para saque.", nomeCliente, agencia, numero);
        scanner.close();
    }
}
