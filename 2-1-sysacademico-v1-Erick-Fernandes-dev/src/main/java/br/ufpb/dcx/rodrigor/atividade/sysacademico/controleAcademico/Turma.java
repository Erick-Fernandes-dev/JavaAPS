package br.ufpb.dcx.rodrigor.atividade.sysacademico.controleAcademico;

import java.util.LinkedList;
import java.util.List;

public class Turma {

    private int numeroTurma;
    private Disciplina disciplina;

    private List<Aluno> alunos;
    public Turma(Disciplina disciplina, int numeroTurma) {
        this.disciplina = disciplina;
        this.numeroTurma = numeroTurma;
        alunos = new LinkedList<>();
    }

    public int getNumeroTurma(){
        return this.numeroTurma;
    }

    public Disciplina getDisciplina(){
        return this.disciplina;
    }

    public String toString(){
        return this.disciplina.getNome()+": Turma "+this.numeroTurma;
    }
//Altere a matrícula de aluno em disciplina, de modo que um aluno só possa ser matriculado numa turma se estiver cadastrado no curso.
    public void matricularAluno(Aluno novoAluno) throws AlunoMatriculadoException {

        boolean alunoMatriculado = this.disciplina.alunoMatriculado(novoAluno, novoAluno.getMatricula());

        if (alunoMatriculado) {

            throw new AlunoMatriculadoException("Aluno já matriculado no curso");

        }
        this.alunos.add(novoAluno);
    }


    public List<Aluno> getAlunos() {
        return this.alunos;
    }
}
