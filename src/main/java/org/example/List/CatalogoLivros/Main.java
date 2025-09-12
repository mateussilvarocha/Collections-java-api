package org.example.List.CatalogoLivros;



public class Main {
    public static void main(String[] args){
        CatalogoLivro catalogo = new CatalogoLivro();
        catalogo.adicionarLivro("Livro1", "Eu mesmo", 1990);
        catalogo.adicionarLivro("Livro2", "Eu mesmo", 2010);
        catalogo.adicionarLivro("Livro3", "ele ali", 2018);
        catalogo.adicionarLivro("Livro4", "Eu mesmo", 2020);
        catalogo.adicionarLivro("Livro5", "ala o cara", 2025);
        catalogo.adicionarLivro("Livro6", "Eu mesmo", 2020);
        System.out.println("Por autor");
        System.out.println("Por ano \"Eu mesmo\"");
        for(Livro livro: catalogo.pesquisarPorAutor("Eu mesmo")){
            System.out.println(livro.getTitulo());
        }
        System.out.println("Por ano \"ele ali\"");
        for(Livro livro: catalogo.pesquisarPorAutor("ele ali")){
            System.out.println(livro.getTitulo());
        }
        System.out.println("Por ano \"ala o cara\"");
        for(Livro livro: catalogo.pesquisarPorAutor("ala o cara")){
            System.out.println(livro.getTitulo());
        }
        System.out.println("Por ano");
        System.out.println("2000,2010");
        for(Livro livro: catalogo.pesquisarPorIntervaloAnos(2000,2010)){
            System.out.println(livro.getTitulo());
        }
        System.out.println("1980,2020");
        for(Livro livro: catalogo.pesquisarPorIntervaloAnos(1980,2020)){
            System.out.println(livro.getTitulo());
        }
        System.out.println("2000,2020");
        for(Livro livro: catalogo.pesquisarPorIntervaloAnos(2000,2020)){
            System.out.println(livro.getTitulo());
        }
        System.out.println("Por titulo " + catalogo.pesquisarPorTitulo("Livro1").getTitulo());

    }
}
