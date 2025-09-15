package org.example.Set.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {
    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, long cod, double preco, int quantidade) {
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public double getPreço() {
        return preco;
    }

    public void setPreço(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Produto produto)) return false;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cod);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class CompareProdutoPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto o1, Produto o2) {
        return Double.compare(o1.getPreço(),o2.getPreço());
    }
}