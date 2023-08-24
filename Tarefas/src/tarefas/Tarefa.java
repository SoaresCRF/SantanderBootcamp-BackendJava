package tarefas;

public final class Tarefa {

    private final String nome;
    private boolean status;

    public Tarefa(String nome) {
        this.nome = nome;
        this.status = false;
    }

    public final String getNome() {
        return nome;
    }

    public final boolean isStatus() {
        return status;
    }

    public final void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" + "nome=" + nome + ", status=" + status + '}';
    }

}
