package carrinhodecompras;

public class Main {

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
