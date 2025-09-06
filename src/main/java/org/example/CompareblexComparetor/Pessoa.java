package org.example.CompareblexComparetor;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int age;

    public Pessoa(String nome, int age){
        this.nome = nome;
        this.age = age;
    }
    @Override
    public int compareTo(Pessoa p) {
        return nome.compareTo(p.nome);
    }

    public String getNome() {
        return nome;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", age=" + age +
                '}';
    }
}

class BuscaPessoaIdade implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        if (p1.getAge()< p2.getAge())
            return -1;
        if(p1.getAge() > p2.getAge())
            return 1;
        else
            return 0;
    }
}
//Compara por nome em questão de empate
class BuscaPessoaNomeIdade implements Comparator<Pessoa>{
    @Override
    public int compare(Pessoa p1, Pessoa p2)   {
        int age = Integer.compare(p1.getAge(), p2.getAge());
        if(age!=0)
            return age;
        return p1.getNome().compareTo(p2.getNome());
    }


}