package org.example.Set.ListaDeTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas;

    public ListaTarefas() {
        this.tarefas = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefas.add(new Tarefa(descricao));
    }

    public void exibirTarefas(){
        if(tarefas.isEmpty()){
            System.out.println("Nenhuma tarefa encontrada.");
        } else {
            for(Tarefa tarefa: tarefas){
                System.out.println(tarefa);
            }
        }
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa tarefa: tarefas){
            if(tarefa.isConcluida()){
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa tarefa: tarefas){
            if(!tarefa.isConcluida()){
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for(Tarefa tarefa: tarefas){
            if(descricao.equals(tarefa.getDescricao())){
                tarefa.setConcluida(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for(Tarefa tarefa: tarefas){
            if(descricao.equals(tarefa.getDescricao())){
                tarefa.setConcluida(false);
                break;
            }
        }
    }

    public void removerTarefa(String descricao){
        tarefas.removeIf(tarefa -> descricao.equals(tarefa.getDescricao()));
    }

    public int contarTarefas(){
        return tarefas.size();
    }

    public void limparListaTarefas(){
        tarefas.clear();
    }
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Estudar Java");
        lista.adicionarTarefa("Fazer exercícios");
        lista.adicionarTarefa("Ler um livro");

        System.out.println("\n📌 Todas as tarefas:");
        lista.exibirTarefas();

        lista.marcarTarefaConcluida("Estudar Java");

        System.out.println("\n✅ Tarefas concluídas:");
        lista.obterTarefasConcluidas().forEach(System.out::println);

        System.out.println("\n⌛ Tarefas pendentes:");
        lista.obterTarefasPendentes().forEach(System.out::println);

        System.out.println("\nNúmero total de tarefas: " + lista.contarTarefas());

        lista.removerTarefa("Ler um livro");

        System.out.println("\n📌 Depois de remover 'Ler um livro':");
        lista.exibirTarefas();

        lista.limparListaTarefas();

        System.out.println("\n📌 Lista após limpar:");
        lista.exibirTarefas();
    }
}
