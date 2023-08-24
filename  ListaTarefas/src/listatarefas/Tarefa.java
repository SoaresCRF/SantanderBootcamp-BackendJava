package listatarefas;

public final class Tarefa {

    private final String NOME;

    public Tarefa(String nome) {
        this.NOME = nome;
    }

    public final String getNOME() {
        return NOME;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "NOME=" + NOME + '}';
    }

}
