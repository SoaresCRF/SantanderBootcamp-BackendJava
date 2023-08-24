package listatarefas;

public class Main {

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
