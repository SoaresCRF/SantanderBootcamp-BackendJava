/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listatarefas;

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
        lt.adicionarTarefa(new Tarefa("estudar"));
        lt.adicionarTarefa(new Tarefa("jogar"));

        lt.obterDescricoesTarefas();
        System.out.println(lt.obterNumeroTotalTarefas());

        lt.removerTarefa("estudar");

        lt.obterDescricoesTarefas();
        System.out.println(lt.obterNumeroTotalTarefas());
    }

}
