/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SoaresCRF
 */
public final class CatalogoLivros {

    private final List<Livro> livros;

    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    public final void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public final List<Livro> pesquisarPorAutor(String autor) {
        final List<Livro> livrosPorAutor = new ArrayList<>();

        for (Livro livro : this.livros) {
            if (livro.getAutor().toLowerCase().equals(autor.toLowerCase())) {
                livrosPorAutor.add(livro);
            }
        }
        return livrosPorAutor;
    }

    public final List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        final List<Livro> livrosPorIntervalo = new ArrayList<>();

        for (Livro livro : this.livros) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                livrosPorIntervalo.add(livro);
            }
        }
        return livrosPorIntervalo;
    }

    public final Livro pesquisarPorTitulo(String titulo) {
        for (Livro livro : this.livros) {
            if (livro.getTitulo().toLowerCase().equals(titulo.toLowerCase())) {
                return livro;
            }
        }
        return null;
    }
}
