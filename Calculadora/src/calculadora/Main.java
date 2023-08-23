/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author SoaresCRF
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora calc = new Calculadora();

        calc.adicionarNumero(10);
        calc.adicionarNumero(5);
        calc.adicionarNumero(20);
        calc.adicionarNumero(40);
        calc.adicionarNumero(30);

        System.out.println("Soma de todos os numeros: ");
        System.out.println(calc.calcularSoma());

        System.out.println("\nMenor número: ");
        System.out.println(calc.encontrarMenorNumero());

        System.out.println("\nMaior número: ");
        System.out.println(calc.encontrarMaiorNumero());

        System.out.println("\nTodos números adicionados: ");
        calc.exibirNumeros();
    }

}
