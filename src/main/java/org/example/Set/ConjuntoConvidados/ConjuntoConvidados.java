package org.example.Set.ConjuntoConvidados;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        convidados = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome,codigoConvite));
        System.out.println("adicionado");
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado convidado: convidados){
            if(convidado.getCodigoConvite() == codigoConvite) {
                System.out.println("removeu "+ convidado.getNome());
                convidadoParaRemover = convidado;
                break;
            }
        }
        convidados.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidados.size();
    }
    public void exibirConvidados(){
        for(Convidado convidado: convidados){
            System.out.println(convidado);
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.adicionarConvidado("Ana", 1234);
        conjunto.adicionarConvidado("Mateus", 1235);
        conjunto.adicionarConvidado("Caua", 1236);
        conjunto.adicionarConvidado("Maria", 1233);
        conjunto.adicionarConvidado("Mariana", 1233);
        System.out.println(conjunto.contarConvidados());
        conjunto.exibirConvidados();
        conjunto.removerConvidadoPorCodigoConvite(1236);
        conjunto.exibirConvidados();

    }
}
