package org.example.Set.ConjuntoPalavras;


import java.util.Set;
import java.util.HashSet;

public class ConjuntoPalavrasUnicas {
    private final Set<Palavra> palavras;

    public ConjuntoPalavrasUnicas() {
        palavras = new HashSet<>();
    }

    public void adicionarPalavra(Palavra palavra){
        palavras.add(palavra);
    }
    public void removerPalavra(Palavra palavra){
        palavras.remove(palavra);
    }
    public boolean verificarPalavra(Palavra palavra){
        if(palavras.isEmpty()){return false;}
        for(Palavra p: palavras){
            if(palavra.equals(p)){
                return true;
            }
        }
        return false;
    }
    public Set<Palavra> exibirPalavrasUnicas(){
        Set<Palavra> listaPalavra= new HashSet<>();
        for(Palavra p: palavras){
            if(p.getPalavra().trim().contains(" ")){
                continue;
            }
            listaPalavra.add(p);
        }
        return listaPalavra;
    }
    public void exibirPalavras(){
        System.out.println("Mostrando");
        for(Palavra p: palavras){
            System.out.println(p);
        }
    }

    public static void main(String[] args){
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra(new Palavra("palavra"));
        conjuntoPalavrasUnicas.adicionarPalavra(new Palavra("Au au"));
        conjuntoPalavrasUnicas.adicionarPalavra(new Palavra("Au au"));
        conjuntoPalavrasUnicas.adicionarPalavra(new Palavra("Mordeu"));
        conjuntoPalavrasUnicas.adicionarPalavra(new Palavra("Mordeu"));
        conjuntoPalavrasUnicas.exibirPalavras();
        System.out.println("Palavras unicas");
        for(Palavra p: conjuntoPalavrasUnicas.exibirPalavrasUnicas()){

            System.out.println(p);
        }
        conjuntoPalavrasUnicas.exibirPalavras();
        conjuntoPalavrasUnicas.removerPalavra(new Palavra("Au au"));
        if(conjuntoPalavrasUnicas.verificarPalavra(new Palavra("palavra"))){
            System.out.println("A palavra 'palavra' existe");
        };
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }
}
