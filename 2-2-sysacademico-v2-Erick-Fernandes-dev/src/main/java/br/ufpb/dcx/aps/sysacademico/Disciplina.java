package br.ufpb.dcx.aps.sysacademico;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private Curso curso;
    private String nome;
    private String codigo;

    private List<Turma> turmas = new ArrayList<>();


    public Disciplina(Curso curso, String codigo, String nome) {
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;

    }

    public String getNome() {
        return nome;
    }

    public Turma criarTurma() {

        int codigoStr = Integer.parseInt(this.codigo);

        Turma turma = new Turma(codigoStr, this);

        this.turmas.add(turma);

        return turma;


    }

    public Turma getTurma(int numero) {
        Turma turmaEncontrada = this.turmas.get(numero);

        return turmaEncontrada;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }

    public String getCodigo() {
        return codigo;
    }
}
