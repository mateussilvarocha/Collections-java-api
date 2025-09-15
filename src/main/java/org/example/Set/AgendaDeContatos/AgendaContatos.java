package org.example.Set.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }
    public void exibirContatos(){
        for(Contato contato: contatos){
            System.out.println(contato);
        }
    }
    public Contato pesquisarPorNome(String nome){
        for(Contato contato: contatos){
            if(nome.equals(contato.getNome())){
                return contato;
            }
        }
        return null;
    }
    public void atualizarNumeroContato(String nome, int novoNumero){
        for(Contato contato: contatos){
            if(nome.equals(contato.getNome())){
                contato.setNumero(novoNumero);
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agenda= new AgendaContatos();
        agenda.adicionarContato("Oi", 2222222);
        agenda.adicionarContato("Mateus", 222242);
        agenda.adicionarContato("Oi", 2223452);
        agenda.adicionarContato("Ana", 51237);
        agenda.adicionarContato("Clara", 865134);
        agenda.adicionarContato("Valadão", 967213);
        agenda.exibirContatos();
        agenda.pesquisarPorNome("Oi");
        agenda.atualizarNumeroContato("Oi",1234);
        agenda.exibirContatos();
    }
}
