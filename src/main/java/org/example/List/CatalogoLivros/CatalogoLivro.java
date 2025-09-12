package org.example.List.CatalogoLivros;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivro {
    List<Livro> catalogo;

    public CatalogoLivro() {
        this.catalogo = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int ano){
        catalogo.add(new Livro(titulo, autor, ano));
    }
    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosEncontrados = new ArrayList<>();
        if(catalogo.isEmpty()){return livrosEncontrados;}

        for(Livro livro: catalogo){
            if(livro.getAutor().equalsIgnoreCase(autor)){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosEncontrados = new ArrayList<>();
        if(catalogo.isEmpty()){return livrosEncontrados;}

        for(Livro livro: catalogo){
            if(livro.getAno()>= anoInicial && livro.getAno()<= anoFinal){
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }
    public Livro pesquisarPorTitulo(String titulo){
        if(catalogo.isEmpty()){return null;}

        for(Livro livro: catalogo){
            if(titulo.equals(livro.getTitulo())){
                return livro;// tentando fazer cast assim '(Object) livro' vai dar erro pois o objetcs não é usado para armazenar instancias
            }
        }
        return null;
    }
}
