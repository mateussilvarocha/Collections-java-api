package org.example.List.ExerciciosList;

public class Main {
    public static void main(String[] args) {
        ListaTarefas lista= new ListaTarefas();
        lista.adicionarTarefa("Hoje quero comer");
        lista.adicionarTarefa("Hoje quero dormir");
        lista.adicionarTarefa("Hoje devo trabalhar");
        lista.adicionarTarefa("Mas não quero");

        for(String tarefa: lista.obterDescricoesTarefas()){
            System.out.println(tarefa);
        }
        System.out.println(lista.obterNumeroTotalTarefas());
        lista.removerTarefa("Mas não quero");
        for(String tarefa: lista.obterDescricoesTarefas()){
            System.out.println(tarefa);
        }

    }
}