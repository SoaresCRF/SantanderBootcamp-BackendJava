package listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private final List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public final void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public final void removerTarefa(String nome) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getNOME().toLowerCase().equals(nome.toLowerCase())) {
                tarefas.remove(tarefa);
            }
        }
    }

    public final int obterNumeroTotalTarefas() {
        return tarefas.size();
    }

    public final void obterDescricoesTarefas() {
        for (Tarefa tarefa : tarefas) {
            System.out.println(tarefa.getNOME());
        }
    }
}
