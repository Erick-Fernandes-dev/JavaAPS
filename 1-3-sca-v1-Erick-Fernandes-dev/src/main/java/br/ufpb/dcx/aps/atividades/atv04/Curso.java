package br.ufpb.dcx.aps.atividades.atv04;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Curso {


    private String nome;
    private List<Disciplina> disciplinas = new LinkedList<>();
    private List<Aluno> alunos = new LinkedList<>();

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
        Disciplina disciplina = new Disciplina(this, codigo, nome);

        this.disciplinas.add(disciplina);

        return disciplina;
    }

    public Disciplina getDisciplina(String codigo) {

        Disciplina disciplinaEncontrada = null;

        for (Disciplina d : this.disciplinas) {
            if (d.getCodigo().equals(codigo)) {
                disciplinaEncontrada = d;
                break;
            }
        }
        return disciplinaEncontrada;
    }

    public void matricular(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public Collection<Aluno> getAlunosMatriculados() {

        List<Aluno> alunosMatriculados = new LinkedList<>();

        for (Aluno a : this.alunos) {
            alunosMatriculados.add(a);

        }
        return alunosMatriculados;


    }

    public Aluno getAlunoMatriculado(String matricula) {
        Aluno alunoEncontrado = null;

        for (Aluno a : this.alunos) {
            if (a.getMatricula().equals(matricula)) {
                alunoEncontrado = a;
                break;
            }
        }

        return alunoEncontrado;
    }

    public boolean alunoMatriculado(String matricula) {
        boolean alunoMatriculado = false;

        for (Aluno a : this.alunos) {
            if (a.getMatricula().equalsIgnoreCase(matricula)) {
                alunoMatriculado = true;
                break;
            }
        }

        return alunoMatriculado;
    }

}
