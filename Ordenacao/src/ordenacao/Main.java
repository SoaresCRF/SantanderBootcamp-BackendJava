package ordenacao;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        final OrdenacaoPessoas op = new OrdenacaoPessoas();

        op.adicionarPessoa(new Pessoa("Matheus", 22, 1.65));
        op.adicionarPessoa(new Pessoa("Amanda", 25, 1.70));
        op.adicionarPessoa(new Pessoa("Geovanna", 20, 1.85));
        op.adicionarPessoa(new Pessoa("Marcus", 18, 1.80));
        op.adicionarPessoa(new Pessoa("Pedro", 21, 1.75));

        System.out.println("Desodernado: ");
        op.exibirPessoas();

        System.out.println("");

        System.out.println("Ordenado por nome: ");
        op.ordenarPorNome();
        op.exibirPessoas();

        System.out.println("");

        System.out.println("Ordenado por idade: ");
        op.ordenarPorIdade();
        op.exibirPessoas();

        System.out.println("");

        System.out.println("Ordenado por altura: ");
        op.ordenarPorAltura();
        op.exibirPessoas();
    }

}
