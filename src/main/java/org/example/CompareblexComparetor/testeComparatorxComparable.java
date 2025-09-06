package org.example.CompareblexComparetor;

import java.util.ArrayList;
import java.util.Collections;

public class testeComparatorxComparable {
    private ArrayList<Pessoa> pessoas;

    public testeComparatorxComparable() {
        this.pessoas = new ArrayList<>();
    }

    public void addPessoa(String nome, int idade){
        pessoas.add(new Pessoa(nome, idade));
    }

    public void infoPessoa(){

        System.out.println("Não organizado");
        System.out.println(pessoas);
        System.out.println("Organizado por Nome");
        Collections.sort(pessoas);
        System.out.println(pessoas);

        System.out.println("Organizado por Idade");
        Collections.sort(pessoas, new  BuscaPessoaIdade());
        System.out.println(pessoas);

        System.out.println("Organizado por nome e idade");
        Collections.sort(pessoas, new BuscaPessoaNomeIdade());
        System.out.println(pessoas);
    }
}
