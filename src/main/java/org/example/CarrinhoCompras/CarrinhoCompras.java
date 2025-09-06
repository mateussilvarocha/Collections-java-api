package org.example.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinhoItem;

    public CarrinhoCompras() {
        this.carrinhoItem = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoItem.add(new Item(nome, preco, quantidade));
    }
    public void removerItem(String nome){
        List<Item> removerItem = new ArrayList<>();
        for(Item item: carrinhoItem){
            if(nome.equals(item.getNome())){
                System.out.println("nome = " + nome);
                removerItem.add(item);
            }
        }
        carrinhoItem.removeAll(removerItem);
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item item: carrinhoItem){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }
    public void exibirItens(){
        for(Item item: carrinhoItem){
            System.out.printf("%s: \nPreço: %s\nQuantidade: %s\n==============\n", item.getNome(), item.getPreco(), item.getQuantidade());
        }
    }
}
