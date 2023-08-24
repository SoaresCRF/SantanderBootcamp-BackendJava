package contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // TODO code application logic here
        final Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Informe seu nome: ");
        final String nomeCliente = input.nextLine();

        System.out.print("Informe número da agência: ");
        final String agencia = input.nextLine();

        System.out.print("Informe número da conta: ");
        final int numero = input.nextInt();

        System.out.print("Informe seu saldo: ");
        final double saldo = input.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
