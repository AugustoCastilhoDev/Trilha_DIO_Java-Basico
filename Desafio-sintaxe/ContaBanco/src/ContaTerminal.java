import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dados ao usuário
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do teclado
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();
        
        // Mensagem final usando concatenação
        String mensagem = "Olá " + nomeCliente + 
                          ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + 
                          ", conta " + numero + 
                          " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        // Fecha o Scanner
        scanner.close();
    }
}