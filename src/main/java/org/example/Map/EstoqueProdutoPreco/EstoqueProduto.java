package org.example.Map.EstoqueProdutoPreco;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EstoqueProduto {
    private Map<Long, Produto> estoque;

    public EstoqueProduto() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoque.put(cod, new Produto(nome, preco,quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoque);
    }
    public double calcularValorTotalEstoque(){

        double valortotal = 0;
        for(Map.Entry<Long, Produto> entry: estoque.entrySet()){
            Produto produto = (Produto)entry.getValue();
            int quantidade = produto.getQuantidade();
            double preco = produto.getPreco();
            valortotal += quantidade * preco;
        }
        return valortotal;
    }
    public Produto obterProdutoMaisCaro(){
        Produto produto = null;
        double maisCaro = Double.MIN_VALUE;
        for(Produto p: estoque.values()){
            if(p.getPreco() > maisCaro){
                produto = p;
            }
        }
        return produto;
    }
    public Produto obterProdutoMaisBarato(){
        Produto produto = null;
        for(Produto p: estoque.values()){
            if(produto == null){
                produto = p;
            }
            if(produto.getPreco() > p.getPreco()){
                produto = p;
            }
        }
        return produto;
    }
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produto = null;
        for(Produto p: estoque.values()){
            double total = p.getPreco()*p.getQuantidade();
            if(produto == null){
                produto = p;
            }
            if(produto.getPreco()* produto.getQuantidade() < total){
                produto = p;
            }
        }
        return produto;
    }

    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();
        estoque.adicionarProduto(123,"Cocconut", 1, 12);
        estoque.adicionarProduto(124,"acerola", 12, 1);
        estoque.adicionarProduto(125,"linguica", 2, 16);
        estoque.adicionarProduto(127,"Carre", 4, 50);

        estoque.exibirProdutos();
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println(estoque.obterProdutoMaisCaro());
        System.out.println(estoque.obterProdutoMaisBarato());
        System.out.println(estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
