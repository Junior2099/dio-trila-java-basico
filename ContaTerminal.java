import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // faz a solicitação dos dados do usuário da conta
        System.out.println("Por favor, digite o número da agência:");
        int agencia = scanner.nextInt();
        scanner.nextLine(); // Quebra a linha para não fica junto
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta (pode conter hífen):");
        String numeroConta = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta:");
        float saldo = scanner.nextFloat();
        
        // Exibi tudo como pedido!
        System.out.println("Olá " + nomeCliente + ", obrigado por criar sua conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e o saldo é R$" + saldo + ".");
        
        scanner.close();
    }
}
