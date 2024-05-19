import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      Scanner scanner = new Scanner(System.in);

        double balance = 231.89;

        System.out.println("Digite seu nome");
        String clientName = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencyId = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta !");
        int accountId = scanner.nextInt();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencyId + ", conta "+ accountId + " e seu saldo " + balance  + " já está disponível para saque.");

        scanner.close();

    }
}
