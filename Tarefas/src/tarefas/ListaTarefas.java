/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarefas;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author SoaresCRF
 */
public class ListaTarefas {

    private final Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public final void adicionarTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public final void removerTarefa(String nome) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getNome().toLowerCase().equals(nome.toLowerCase())) {
                this.tarefas.remove(tarefa);
                return;
            }
        }
    }

    public final void exibirTarefas() {
        for (Tarefa tarefa : this.tarefas) {
            System.out.println(tarefa.toString());
        }
    }

    public final int contarTarefas() {
        return this.tarefas.size();
    }

    public final Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.isStatus()) {
                tarefasConcluidas.add(tarefa);
            }
        }

        return tarefasConcluidas;
    }

    public final Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        for (Tarefa tarefa : this.tarefas) {
            if (!tarefa.isStatus()) {
                tarefasPendentes.add(tarefa);
            }
        }

        return tarefasPendentes;
    }

    public final void marcarTarefaConcluida(String nome) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getNome().toLowerCase().equals(nome.toLowerCase())) {
                tarefa.setStatus(true);
            }
        }
    }

    public final void marcarTarefaPendente(String nome) {
        for (Tarefa tarefa : this.tarefas) {
            if (tarefa.getNome().toLowerCase().equals(nome.toLowerCase())) {
                tarefa.setStatus(false);
            }
        }
    }

    public final void limparListaTarefas() {
        this.tarefas.clear();
    }

}
