package br.ufpb.dcx.gustavo.agenda;

import java.io.Serializable;

public class Contato implements Serializable {
    private String nome;
    private int diaAniversario;
    private int mesAniversario;

    public Contato(String nome, int diaAniversario, int mesAniversario) {
        this.nome = nome;
        this.diaAniversario = diaAniversario;
        this.mesAniversario = mesAniversario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaAniversario() {
        return diaAniversario;
    }

    public void setDiaAniversario(int diaAniversario) {
        this.diaAniversario = diaAniversario;
    }

    public int getMesAniversario() {
        return mesAniversario;
    }

    public void setMesAniversario(int mesAniversario) {
        this.mesAniversario = mesAniversario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contato contato = (Contato) o;

        if (getDiaAniversario() != contato.getDiaAniversario()) return false;
        if (getMesAniversario() != contato.getMesAniversario()) return false;
        return getNome() != null ? getNome().equals(contato.getNome()) : contato.getNome() == null;
    }

    @Override
    public int hashCode() {
        int result = getNome() != null ? getNome().hashCode() : 0;
        result = 31 * result + getDiaAniversario();
        result = 31 * result + getMesAniversario();
        return result;
    }

    @Override
    public String toString() {
        return "Contato de nome " + nome + '\'' + "aniversário: dia " + diaAniversario + " de " + mesAniversario;
    }
}
