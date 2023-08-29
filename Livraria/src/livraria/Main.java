package livraria;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        LivrariaOnline lo = new LivrariaOnline();

        lo.adicionarLivro("a", new Livro("league of legends", "matheus", 15));
        lo.adicionarLivro("b", new Livro("vayne", "matheus", 20));
        lo.adicionarLivro("c", new Livro("lux", "ingrid", 5));
        lo.adicionarLivro("d", new Livro("nami", "carla", 60));
        lo.adicionarLivro("e", new Livro("jhin", "amanda", 10));

        System.out.println("Livro mais barato: ");
        Livro livroMaisBarato = lo.obterLivroMaisBarato();
        if (livroMaisBarato != null) {
            System.out.println(livroMaisBarato.toString());
        }
        System.out.println("");

        System.out.println("Livro mais caro: ");
        Livro livroMaisCaro = lo.obterLivroMaisCaro();
        if (livroMaisCaro != null) {
            System.out.println(livroMaisCaro.toString());
        }
        System.out.println("");

        System.out.println("Livros ordenado pelo preço: ");
        for (Livro livro : lo.exibirLivrosOrdenadosPorPreco()) {
            System.out.println(livro.toString());
        }
        System.out.println("");

        System.out.println("Livros por autor: ");
        for (Livro livro : lo.pesquisarLivrosPorAutor("matheus")) {
            System.out.println(livro.toString());
        }
        System.out.println("");

        lo.removerLivro("league of legends");

        System.out.println("Livros por autor: ");
        for (Livro livro : lo.pesquisarLivrosPorAutor("matheus")) {
            System.out.println(livro.toString());
        }
        System.out.println("");

        System.out.println("Livros ordenado pelo preço: ");
        for (Livro livro : lo.exibirLivrosOrdenadosPorPreco()) {
            System.out.println(livro.toString());
        }
        System.out.println("");

    }

}
