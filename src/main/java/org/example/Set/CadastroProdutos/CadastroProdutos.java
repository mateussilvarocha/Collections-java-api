package org.example.Set.CadastroProdutos;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        produtos = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtos.add(new Produto(nome,cod,preco,quantidade));
    }
    private Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtos);
        return produtoPorNome;
    }
    private Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new CompareProdutoPreco());
        produtoPorPreco.addAll(produtos);
        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(111,"oii", 20.21,2);
        cadastro.adicionarProduto(110,"dois", 10.21,5);
        cadastro.adicionarProduto(101,"quatro", 30.21,10);
        cadastro.adicionarProduto(011,"oii", 23.21,1);
        cadastro.adicionarProduto(011,"dois", 10.21,5);
        System.out.println(cadastro.exibirProdutosPorPreco());
        System.out.println(cadastro.exibirProdutosPorNome());

    }
}
