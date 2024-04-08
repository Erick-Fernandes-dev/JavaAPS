package br.ufpb.dcx.aps.sysacademico;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    private List<Aluno> alunos = new ArrayList<>();

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
        Disciplina disciplina = null;

        for (Disciplina d: this.disciplinas) {
            boolean contido = d.getCodigo().equals(codigo);

            if (contido) {
                disciplina = d;
                return disciplina;
            }
        }
        return disciplina;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void cadastrarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public Aluno getAluno()
}
