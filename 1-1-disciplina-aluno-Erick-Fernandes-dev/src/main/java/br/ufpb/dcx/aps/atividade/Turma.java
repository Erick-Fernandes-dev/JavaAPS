package br.ufpb.dcx.aps.atividade;

import java.util.*;

public class Turma {

    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos = new LinkedList<>();

    public Turma(int codTurma, Disciplina disciplina) {
        this.codigo = codTurma;
        this.disciplina = disciplina;

    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Aluno getAluno(String matricula) {


        int i = Integer.parseInt(matricula);

        return this.alunos.get(i);
    }

    public List<Aluno> getAlunos() {

        return this.alunos;

    }

    public int getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Turma)) return false;
        Turma turma = (Turma) o;
        return getCodigo() == turma.getCodigo() && getDisciplina().equals(turma.getDisciplina()) && getProfessor().equals(turma.getProfessor()) && getAlunos().equals(turma.getAlunos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getDisciplina(), getProfessor(), getAlunos());
    }
}
