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

    private final String NOME;
    private final int QUANTIDADE;
    private final double PRECO;

    public Item(String nome, int quantidade, double preco) {
        this.NOME = nome;
        this.QUANTIDADE = quantidade;
        this.PRECO = preco;
    }

    public final String getNOME() {
        return NOME;
    }

    public final int getQUANTIDADE() {
        return QUANTIDADE;
    }

    public final double getPRECO() {
        return PRECO;
    }

}
