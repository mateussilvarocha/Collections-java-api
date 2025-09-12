package org.example.Set.ConjuntoPalavras;

import org.example.Set.ConjuntoConvidados.ConjuntoConvidados;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavras.add(palavra);
    }
    public void removerPalavra(String palavra){
        palavras.remove(palavra);
    }
    public boolean verificarPalavra(String palavra){
        if(palavras.isEmpty()){return false;}
        for(String p: palavras){
            if(palavra.equals(p)){
                return true;
            }
        }
        return false;
    }
    public Set<String> exibirPalavrasUnicas(){
        Set<String> listaString= new HashSet<>();
        for(String p: palavras){
            if(p.trim().contains(" ")){
                continue;
            }
            listaString.add(p);
        }
        return listaString;
    }
    public void exibirPalavras(){
        System.out.println("Mostrando");
        for(String p: palavras){
            System.out.println(p);
        }
    }
    public static void main(String[] args){
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("palavra");
        conjuntoPalavrasUnicas.adicionarPalavra("Au au");
        conjuntoPalavrasUnicas.adicionarPalavra("Mordeu");
        conjuntoPalavrasUnicas.exibirPalavras();
        System.out.println("Palavras unicas");
        for(String p: conjuntoPalavrasUnicas.exibirPalavrasUnicas()){

            System.out.println(p);
        }
        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.removerPalavra("Au au");
        if(conjuntoPalavrasUnicas.verificarPalavra("palavra")){
            System.out.println("A palavra 'palavra' existe");
        };
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
