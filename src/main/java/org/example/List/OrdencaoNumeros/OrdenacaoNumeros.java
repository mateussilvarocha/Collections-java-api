package org.example.List.OrdencaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }
    public List<Integer> ordenarAscendente(){
        Collections.sort(numeros);
        return numeros;
    }
    public List<Integer> ordenarDescendente(){
        Collections.reverse(numeros);
        return numeros;
    }
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(21);
        numeros.add(34);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(78);
        numeros.add(5);
        numeros.add(32);
        numeros.add(14);
        numeros.add(65);
        numeros.add(71);
        numeros.add(90);
        OrdenacaoNumeros ordenacao = new OrdenacaoNumeros(numeros);
        System.out.println(ordenacao.ordenarAscendente());
        System.out.println(ordenacao.ordenarDescendente());
    }
}
