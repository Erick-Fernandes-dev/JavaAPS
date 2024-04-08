package br.ufpb.dcx.aps.atividades.atv04;

import java.util.Collection;

public class CursoFacade {
    private Curso curso;

    public CursoFacade(String nome) {
        curso = new Curso(nome);
    }

    public Disciplina criarDisciplina(String codigo, String nome) {
        return curso.criarDisciplina(codigo, nome);
    }

    public Disciplina getDisciplina(String codigo) {
        return curso.getDisciplina(codigo);
    }

    public void matricular(Aluno aluno) {
        curso.matricular(aluno);
    }

    public Collection<Aluno> getAlunos() {
        return curso.getAlunos();
    }

    public Aluno getAlunoMatriculado(String matricula) {
        return curso.getAlunoMatriculado(matricula);
    }

    public boolean alunoMatriculado(String matricula) {
        return curso.alunoMatriculado(matricula);
    }

    public void setNome(String nome) {
        curso.setNome(nome);
    }

    public String getNome() {
        return curso.getNome();
    }
}
