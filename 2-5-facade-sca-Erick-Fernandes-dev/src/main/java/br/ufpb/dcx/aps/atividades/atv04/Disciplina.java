package br.ufpb.dcx.aps.atividades.atv04;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private Curso curso;

    private String codigo;
    private String nome;

    private List<Turma> turmas = new ArrayList<>();


    public Disciplina(Curso curso, String codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.curso = curso;
    }


    public Turma criarTurma(int codigo) {

        Turma novaTurma = new Turma(codigo, this);
        turmas.add(novaTurma);

        return novaTurma;
    }

    public Turma getTurma(int numero) {

        for (Turma turma : turmas) {
            if (turma.getCodigo() == numero) {
                return turma;
            }
        }
        return null;

    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso() {
        return curso;
    }


}
