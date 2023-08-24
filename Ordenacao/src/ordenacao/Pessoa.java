package ordenacao;

public final class Pessoa {

    private final String nome;
    private final int idade;
    private final double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public final String getNome() {
        return nome;
    }

    public final int getIdade() {
        return idade;
    }

    public final double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", altura=" + altura + '}';
    }

}
