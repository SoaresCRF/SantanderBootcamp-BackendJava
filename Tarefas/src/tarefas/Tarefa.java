package tarefas;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tarefa other = (Tarefa) obj;
        return Objects.equals(this.nome, other.nome);
    }

}
