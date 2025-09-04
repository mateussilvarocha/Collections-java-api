package org.example.CompareblexComparetor;

import java.util.ArrayList;

public class testeComparatorxComparable {
    private ArrayList<Pessoa> pessoas;

    public void addPessoa(String nome, int idade){
        pessoas.add(new Pessoa(nome, idade));
    }

    public void infoPessoa(){

        System.out.println("Não organizado");
        System.out.println(pessoas);
        System.out.println("Organizado");
    }
}
