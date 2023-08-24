package biblioteca;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        CatalogoLivros cl = new CatalogoLivros();

        cl.adicionarLivro(new Livro("matematica", "matheus", 2010));
        cl.adicionarLivro(new Livro("portugues", "joao", 2012));
        cl.adicionarLivro(new Livro("xadrez", "fabricio", 2020));
        cl.adicionarLivro(new Livro("fisica", "matheus", 2017));
        cl.adicionarLivro(new Livro("dama", "rebeca", 2022));
        cl.adicionarLivro(new Livro("dama", "geovana", 2023));

        System.out.println("Pesquisa por autor: ");
        for (Livro livro : cl.pesquisarPorAutor("matheus")) {
            System.out.println(livro.toString());
        }

        System.out.println("\nPesquisa por intervalo de ano: ");
        for (Livro livro : cl.pesquisarPorIntervaloAnos(2010, 2018)) {
            System.out.println(livro.toString());
        }

        System.out.println("\nPesquisa por titulo: ");
        Livro livroPorTitulo = cl.pesquisarPorTitulo("dama");
        if (livroPorTitulo != null) {
            System.out.println(livroPorTitulo.toString());
        }
    }
}
