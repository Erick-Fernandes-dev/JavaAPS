package br.ufpb.dcx.rodrigor.atividade;

public class Aluno {

    private String nome;
    private String matricula;
    private String dataDeNascimento;

    public Aluno(String nome, String matricula, String dataDeNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataDeNascimento = dataDeNascimento;
    }

    public Aluno() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}
