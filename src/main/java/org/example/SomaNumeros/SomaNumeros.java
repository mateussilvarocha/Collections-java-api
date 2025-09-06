package org.example.SomaNumeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){

        numeros.add(numero);
    }
    public int calcularSoma(){
        if(numeros.isEmpty()){
            throw new NoSuchElementException("Não há elementos na lista");
        }
        int valor =0;
        for(int numero: numeros){
            valor+=numero;
        }
        return valor;
    }
    public int encontrarMaiorNumero(){
        Collections.sort(numeros);
        if(numeros.isEmpty()){
            throw new NoSuchElementException("Lista vazia não há ultimo indice");
        }
        return numeros.get(numeros.size() - 1);

    }
    public int encontrarMenorNumero(){
        Collections.sort(numeros);
        if(numeros.isEmpty()){
            throw new NoSuchElementException("Lista vazia não há primeiro indice");
        }
        return numeros.get(0);

    }
    public void exibirNumeros(){
        for(int numero: numeros){
            System.out.println(numero);
        }
    }
    public static void main(String[] args){
        SomaNumeros soma = new SomaNumeros();
        soma.adicionarNumero(1);
        soma.adicionarNumero(4);
        soma.adicionarNumero(8);
        soma.adicionarNumero(6);
        soma.adicionarNumero(8);
        soma.adicionarNumero(2);
        soma.exibirNumeros();
        System.out.println(soma.calcularSoma());
        System.out.println(soma.encontrarMenorNumero());
        System.out.println(soma.encontrarMaiorNumero());
        System.out.println(soma.calcularSoma());
    }

}
