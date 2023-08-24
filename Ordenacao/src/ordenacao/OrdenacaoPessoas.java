package ordenacao;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPessoas {

    private final List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        this.pessoas = new ArrayList<>();
    }

    public final void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public final void ordenarPorNome() {
        pessoas.sort((p1, p2) -> p1.getNome().compareTo(p2.getNome()));
    }

    public final void ordenarPorIdade() {
        pessoas.sort((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));
    }

    public final void ordenarPorAltura() {
        pessoas.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
    }

    public final void exibirPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }
}
