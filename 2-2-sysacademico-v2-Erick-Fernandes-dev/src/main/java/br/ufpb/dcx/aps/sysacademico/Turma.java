package br.ufpb.dcx.aps.sysacademico;

import java.util.LinkedList;
import java.util.List;

public class Turma {


    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private List<Aluno> alunos = new LinkedList<>();

    public Turma(int codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void matricularAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAluno(String matricula) {
        int matri_int = Integer.parseInt(matricula);
        Aluno alunoEncontrado = this.alunos.get(matri_int);

        return alunoEncontrado;
    }




}
