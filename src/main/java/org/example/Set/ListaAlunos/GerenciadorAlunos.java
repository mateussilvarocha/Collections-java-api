package org.example.Set.ListaAlunos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos{
    private Set<Aluno> alunos;

    public GerenciadorAlunos() {
        alunos = new HashSet<>();
    }

    public void  adicionarAluno(String nome, Long matricula, double media) {
        alunos.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula) {
        Set<Aluno> removerAluno = new HashSet<>();
        for(Aluno aluno: alunos){
            if(matricula == aluno.getMatricula()){
                removerAluno.add(aluno);
            }
        }
        alunos.removeAll(removerAluno);
    }

    public Set<Aluno> exibirAlunosPorNome() {
       Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        return alunosPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparePorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }
    public Set<Aluno> exibirAlunos(){
        return alunos;
    }
    public static void main(String[] args) {
        GerenciadorAlunos gerenciador = new GerenciadorAlunos();
        gerenciador.adicionarAluno("Mateus", 12364323L, 12.5);
        gerenciador.adicionarAluno("Joao", 12364L, 16.5);
        gerenciador.adicionarAluno("Carla", 1234673L, 20.5);
        gerenciador.adicionarAluno("Marcos", 12364323L, 11.5);
        gerenciador.adicionarAluno("Jepeto", 1278364L, 16.5);
        gerenciador.adicionarAluno("Camila", 123146273L, 21.5);
        System.out.println(gerenciador.exibirAlunos());
        gerenciador.removerAluno(1278364L);
        System.out.println(gerenciador.exibirAlunos());
        System.out.println(gerenciador.exibirAlunosPorNome());
        System.out.println(gerenciador.exibirAlunosPorNota());

    }
}


