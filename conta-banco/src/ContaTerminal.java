import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        String agencia;
        int numeroConta;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da sua Agência: ");
        agencia = sc.nextLine();
       
        System.out.println("Por favor, digite o número da sua conta: ");
        numeroConta = sc.nextInt();
        
        sc.nextLine();

        System.out.println("Por favor, digite o nome completo do client: ");
        nomeCliente = sc.nextLine();
        
        System.out.println("Por favor, digite seu saldo: ");
        saldo = sc.nextDouble();
        
        System.out.println();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco. Sua agência é: %s, conta: %d e seu saldo é %.2f e já está disponível para saque.%n", nomeCliente, agencia, numeroConta, saldo);


        sc.close();


    }
}
