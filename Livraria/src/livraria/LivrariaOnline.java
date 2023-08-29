package livraria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivrariaOnline {

    private final Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public final void adicionarLivro(String link, Livro livro) {
        this.livroMap.put(link, livro);
    }

    public final void removerLivro(String titulo) {
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                this.livroMap.remove(entry.getKey());
                return;
            }
        }
    }

    public final List<Livro> exibirLivrosOrdenadosPorPreco() {
        List<Livro> livros = new ArrayList<>(livroMap.values());

        livros.sort((l1, l2) -> Double.compare(l1.getPreco(), l2.getPreco()));

        return livros;
    }

    public final List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()) {
            if (entry.getValue().getAutor().toLowerCase().equals(autor.toLowerCase())) {
                livrosPorAutor.add(entry.getValue());
            }
        }
        return livrosPorAutor;
    }

    public final Livro obterLivroMaisBarato() {
        List<Livro> livros = new ArrayList<>(exibirLivrosOrdenadosPorPreco());

        Livro livro = null;

        if (!livros.isEmpty()) {
            livro = livros.get(0);
        }

        return livro;
    }

    public final Livro obterLivroMaisCaro() {
        List<Livro> livros = new ArrayList<>(exibirLivrosOrdenadosPorPreco());

        Livro livro = null;

        if (!livros.isEmpty()) {
            livro = livros.get(livros.size() - 1);
        }

        return livro;
    }
}
