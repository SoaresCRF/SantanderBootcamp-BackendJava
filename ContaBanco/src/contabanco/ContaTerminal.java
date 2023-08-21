package contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe seu nome: ");
        String nomeCliente = input.nextLine();

        System.out.print("Informe número da agência: ");
        String agencia = input.nextLine();

        System.out.print("Informe número da conta: ");
        int numero = input.nextInt();

        System.out.print("Informe seu saldo: ");
        double saldo = input.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
