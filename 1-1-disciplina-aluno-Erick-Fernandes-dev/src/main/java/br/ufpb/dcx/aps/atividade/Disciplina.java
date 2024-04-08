package br.ufpb.dcx.aps.atividade;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Disciplina {

    private String nome;
    private int codigo;
    private int codTurma;
    private Map<Integer, Turma> turmas = new HashMap<>();

    public Disciplina(int codigo) {
        this.codigo = codigo;
    }

    public Disciplina(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public Turma criarTurma() {
        var turma = new Turma(getCodigo()+1, this);

        return this.turmas.put(getCodigo() , turma);
    }

    public Turma getTurma(int codigo) {
        return this.turmas.get(codigo);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disciplina)) return false;
        Disciplina that = (Disciplina) o;
        return getCodigo() == that.getCodigo() && codTurma == that.codTurma && getNome().equals(that.getNome()) && turmas.equals(that.turmas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCodigo(), codTurma, turmas);
    }
}
