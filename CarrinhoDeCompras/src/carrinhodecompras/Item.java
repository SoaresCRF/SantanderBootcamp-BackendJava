/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrinhodecompras;

/**
 *
 * @author SoaresCRF
 */
public final class Item {

    private final String nome;
    private final int quantidade;
    private final double preco;

    public Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public final String getNome() {
        return nome;
    }

    public final int getQuantidade() {
        return quantidade;
    }

    public final double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Item{" + "nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + '}';
    }
}
