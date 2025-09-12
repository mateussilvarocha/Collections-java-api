package org.example.Set.ConjuntoPalavras;

import java.util.Objects;

public class Palavra {
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Palavra palavra1)) return false;
        return Objects.equals(palavra, palavra1.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavra);
    }

    @Override
    public String toString() {
        return "Palavra{" +
                "palavra='" + palavra + '\'' +
                '}';
    }
}
