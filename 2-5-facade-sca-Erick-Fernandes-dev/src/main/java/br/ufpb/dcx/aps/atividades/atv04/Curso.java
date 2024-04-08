package br.ufpb.dcx.aps.atividades.atv04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Curso {

    private String nome;
    private List<Disciplina> displinas = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();

    public Curso() {

    }

    public Curso(String nome) {
        this.nome = nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Disciplina criarDisciplina(String codigo, String nome) {

        Disciplina novaDisciplina = new Disciplina(this, codigo, nome);
        displinas.add(novaDisciplina);

        return novaDisciplina;
    }

    public Disciplina getDisciplina(String codigo) {

        for (Disciplina disciplina : displinas) {
            if (disciplina.getCodigo().equals(codigo)) {
                return disciplina;
            }
        }
        return null;

    }

    public void matricular(Aluno aluno) {
        alunos.add(aluno);
    }

    public Collection<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAlunoMatriculado(String matricula) {

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        return null;

    }

    public boolean alunoMatriculado(String matricula) {

        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;

    }
}
