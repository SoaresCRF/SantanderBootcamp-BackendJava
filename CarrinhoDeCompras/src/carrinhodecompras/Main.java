/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrinhodecompras;

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
        CarrinhoDeCompra cc = new CarrinhoDeCompra();

        cc.adicionarItem(new Item("vinho", 2, 10));
        cc.adicionarItem(new Item("celular", 5, 10));
        cc.adicionarItem(new Item("manteiga", 3, 10));

        cc.exibirItens();
        System.out.println(cc.calcularValorTotal());

        System.out.println();

        cc.removerItem("celular");

        cc.exibirItens();
        System.out.println(cc.calcularValorTotal());

    }

}
