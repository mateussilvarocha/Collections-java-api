package org.example.Map.EstoqueProdutoPreco;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)


import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap = new HashMap();

    public EstoqueProdutos() {
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        this.estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(this.estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = (double)0.0F;
        if (!this.estoqueProdutosMap.isEmpty()) {
            for(Produto p : this.estoqueProdutosMap.values()) {
                valorTotalEstoque += (double)p.getQuantidade() * p.getPreco();
            }
        }

        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for(Produto p : this.estoqueProdutosMap.values()) {
            if (p.getPreco() > maiorPreco) {
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }

        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for(Produto p : this.estoqueProdutosMap.values()) {
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }

        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = (double)0.0F;
        if (!this.estoqueProdutosMap.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : this.estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = ((Produto)entry.getValue()).getPreco() * (double)((Produto)entry.getValue()).getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = (Produto)entry.getValue();
                }
            }
        }

        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();
        estoque.adicionarProduto(1L, "Notebook", 1, (double)1500.0F);
        estoque.adicionarProduto(2L, "Mouse", 5, (double)25.0F);
        estoque.adicionarProduto(3L, "Monitor", 10, (double)400.0F);
        estoque.adicionarProduto(4L, "Teclado", 2, (double)40.0F);
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
    }
}
