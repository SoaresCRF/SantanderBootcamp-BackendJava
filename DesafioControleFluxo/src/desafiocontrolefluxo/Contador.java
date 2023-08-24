package desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        // TODO code application logic here
        final Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        final int parametroUm = terminal.nextInt();

        System.out.print("\nDigite o segundo parâmetro: ");
        final int parametroDois = terminal.nextInt();

        System.out.println();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    final static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        final int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i + "°");
        }
    }
}
