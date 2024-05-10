import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        String clientName, agency;
        int number;
        double balance;


        System.out.println("Por favor, digite o número da Agência!");
        System.out.println("Usuário:");
        number = sc.nextInt();

        System.out.println("Agência:");
        sc.nextLine();
        agency = sc.next();

        System.out.println("Seu nome:");
        sc.nextLine();
        clientName = sc.nextLine();

        System.out.println("Saldo:");
        balance = sc.nextDouble();

        System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.");

        sc.close();
    }
}
