package carrinhodecompras;

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
