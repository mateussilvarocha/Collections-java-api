package org.example.Set.ListaDeTarefas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }
    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(descricao);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluida=" + concluida +
                '}';
    }
}
