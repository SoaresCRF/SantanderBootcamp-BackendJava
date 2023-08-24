/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarefas;

/**
 *
 * @author SoaresCRF
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaTarefas lt = new ListaTarefas();

        lt.adicionarTarefa(new Tarefa("comer"));
        lt.adicionarTarefa(new Tarefa("correr"));
        lt.adicionarTarefa(new Tarefa("estudar"));
        lt.adicionarTarefa(new Tarefa("estudar"));
        lt.adicionarTarefa(new Tarefa("vacinar"));
        lt.adicionarTarefa(new Tarefa("passear"));

        lt.exibirTarefas();

        lt.marcarTarefaConcluida("comer");
        lt.marcarTarefaConcluida("passear");

        System.out.println("");

        System.out.println("Números de tarefas: " + lt.contarTarefas());

        System.out.println("");

        System.out.println("Tarefas concluidas: ");
        for (Tarefa tarefa : lt.obterTarefasConcluidas()) {
            System.out.println(tarefa.toString());

        }

        lt.marcarTarefaPendente("comer");

        System.out.println("");

        System.out.println("Tarefas pendentes: ");
        for (Tarefa tarefa : lt.obterTarefasPendentes()) {
            System.out.println(tarefa.toString());
        }

        System.out.println("");

        System.out.println("Tarefas concluidas: ");
        for (Tarefa tarefa : lt.obterTarefasConcluidas()) {
            System.out.println(tarefa.toString());
        }

        System.out.println("");

        lt.removerTarefa("comer");

        lt.exibirTarefas();

        System.out.println("");

        System.out.println("Tarefas pendentes: ");
        for (Tarefa tarefa : lt.obterTarefasPendentes()) {
            System.out.println(tarefa.toString());
        }

        System.out.println("");
        lt.limparListaTarefas();

        System.out.println("Todas tarefas: ");
        lt.exibirTarefas();

        System.out.println("Tarefas pendentes: ");
        for (Tarefa tarefa : lt.obterTarefasPendentes()) {
            System.out.println(tarefa.toString());
        }

        System.out.println("Tarefas concluidas: ");
        for (Tarefa tarefa : lt.obterTarefasConcluidas()) {
            System.out.println(tarefa.toString());
        }
    }

}
