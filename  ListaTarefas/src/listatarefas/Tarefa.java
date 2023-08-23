/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listatarefas;

/**
 *
 * @author SoaresCRF
 */
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
