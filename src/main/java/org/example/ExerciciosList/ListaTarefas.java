package org.example.ExerciciosList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefas = new ArrayList<>();
    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> removerTarefa = new ArrayList<>();

        //Não se deve alterar uma lista dentro de um for-each → tarefa : tarefa.add()/tarefa.remove() isso vai lançar ConcurrentModificationException porque você está alterando a lista enquanto percorre com for-each.
        for(Tarefa tarefa:tarefas){
            if(descricao.equals(tarefa.getDescricao())) {
                removerTarefa.add(tarefa);
            }

        }
        tarefas.removeAll(removerTarefa);
    }
    public int obterNumeroTotalTarefas(){
        return tarefas.size();
    }
    public List<String> obterDescricoesTarefas(){
        List<String> descricao = new ArrayList<>();
        for(Tarefa tarefa: tarefas){
            descricao.add(tarefa.getDescricao());
        }
        return descricao;
    }
}
