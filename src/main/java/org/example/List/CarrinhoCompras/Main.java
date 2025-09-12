package org.example.List.CarrinhoCompras;

public class Main {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        carrinho.exibirItens();
        carrinho.adicionarItem("Item1", 1,2);
        carrinho.adicionarItem("Item2", 8,2);
        carrinho.adicionarItem("Item4", 2,2);
        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();
        carrinho.removerItem("Item4");
        carrinho.adicionarItem("Item3", 4,2);
        System.out.println(carrinho.calcularValorTotal());
        carrinho.exibirItens();

    }

}
