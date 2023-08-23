/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatarefas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SoaresCRF
 */
public class ListaTarefas {

    private final List<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public final void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public final void removerTarefa(String descricao) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getNOME().toLowerCase().equals(descricao.toLowerCase())) {
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