package br.ufpb.dcx.aps.atividade;

import java.util.LinkedList;
import java.util.List;

public class Turma {

    private int codigo;
    private Professor professor;
    private List<Aluno> alunos = new LinkedList<>();

    public Turma(int codigo) {
        this.codigo = codigo;
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

    public Aluno getAluno(int matricula) {

        String matriculaStr = String.valueOf(matricula);

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equalsIgnoreCase(matriculaStr)) {
                return aluno;
            }
        }
        return null;
    }

    public int getCodigo() {
        return codigo;
    }
}
