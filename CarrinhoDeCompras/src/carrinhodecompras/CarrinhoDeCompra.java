package carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public final class CarrinhoDeCompra {

    private final List<Item> itens;

    public CarrinhoDeCompra() {
        this.itens = new ArrayList<>();
    }

    public final void adicionarItem(Item item) {
        itens.add(item);
    }

    public final void removerItem(String nome) {
        for (Item item : itens) {
            if (item.getNome().toLowerCase().equals(nome.toLowerCase())) {
                itens.remove(item);
            }
        }
    }

    public final double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itens) {
            valorTotal += item.getQuantidade() * item.getPreco();
        }
        return valorTotal;
    }

    public final void exibirItens() {
        for (Item item : itens) {
            System.out.println(item.toString());
        }
    }

}
