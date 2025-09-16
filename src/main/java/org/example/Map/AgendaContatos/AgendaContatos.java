package org.example.Map.AgendaContatos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        contatos = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        contatos.put(nome, telefone);
    }
    public void removerContato(String nome){
        contatos.remove(nome);
    }
    public void exibirContatos(){
        System.out.println(contatos);
    }
    public int pesquisarPorNome(String nome){
        return contatos.get(nome);
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Mateus", 1000);
        agenda.adicionarContato("Mateus", 1001);//sobrescreve a chave mateus
        agenda.adicionarContato("Luiz", 9909);
        agenda.adicionarContato("Carlos", 7690);
        agenda.adicionarContato("Viviane", 1145);
        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Mateus"));
        agenda.removerContato("Mateus");
        agenda.exibirContatos();

    }
}
