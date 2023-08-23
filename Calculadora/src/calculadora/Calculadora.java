/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SoaresCRF
 */
public final class Calculadora {

    private final List<Integer> numeros;

    public Calculadora() {
        this.numeros = new ArrayList<>();
    }

    public final void adicionarNumero(int numero) {
        this.numeros.add(numero);
    }

    public final int calcularSoma() {
        if (this.numeros == null || this.numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista está vazia ou nula");
        }

        int somaTotal = 0;
        for (Integer numero : numeros) {
            somaTotal += numero;
        }

        return somaTotal;
    }

    public final int encontrarMaiorNumero() {
        if (this.numeros == null || this.numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista está vazia ou nula");
        }

        int maior = this.numeros.get(0);

        for (int i = 1; i < this.numeros.size(); i++) {
            if (this.numeros.get(i) > maior) {
                maior = this.numeros.get(i);
            }
        }

        return maior;
    }

    public final int encontrarMenorNumero() {
        if (this.numeros == null || this.numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista está vazia ou nula");
        }

        int menor = this.numeros.get(0);

        for (int i = 1; i < this.numeros.size(); i++) {
            if (this.numeros.get(i) < menor) {
                menor = this.numeros.get(i);
            }
        }

        return menor;
    }

    public final void exibirNumeros() {
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
