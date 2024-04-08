package br.ufpb.dcx.aps.atividades.atv04;

import java.util.HashMap;
import java.util.Map;

public class Disciplina {

    private Curso curso;
    private String codigo;
    private String nome;

    private Map<String, Turma> turmas = new HashMap<>();

    public Disciplina(Curso curso, String codigo, String nome) {
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Disciplina() {

    }

    public Turma criarTurma() {

        int convCodigo = Integer.parseInt(codigo);
        Turma turma = new Turma(convCodigo, this);

        this.turmas.put(this.codigo, turma);

        return turma;
    }

    public Turma getTurma(int numero) {
        String convNumero = Integer.toString(numero);
        return this.turmas.get(convNumero);
    }



    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
