package org.example.List;

import org.example.List.CompareAltura;
import org.example.List.Pessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoas;

    public OrdenacaoPessoas() {
        pessoas = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoas.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoas);
        Collections.sort(pessoasPorAltura, new CompareAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args){
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();
        ordenacao.adicionarPessoa("zé", 1, 1.80);
        ordenacao.adicionarPessoa("catatau", 2, 1.90);
        ordenacao.adicionarPessoa("zéRamalho", 4, 1.60);
        ordenacao.adicionarPessoa("Outro", 3, 1.50);
        System.out.println(ordenacao.ordenarPorIdade());
        System.out.println(ordenacao.ordenarPorAltura());

    }
}
