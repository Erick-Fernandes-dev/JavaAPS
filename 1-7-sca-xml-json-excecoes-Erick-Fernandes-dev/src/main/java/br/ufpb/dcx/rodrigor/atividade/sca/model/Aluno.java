package br.ufpb.dcx.rodrigor.atividade.sca.model;

import java.time.LocalDate;

public class Aluno {
    private String matricula;
    private String nome;
    private LocalDate dataNascimento;

    // formate o datanascimento
    // LocalDate dataNascimento = LocalDate.parse("2016-08-16");
    // LocalDate dataNascimento = LocalDate.parse("16/08/2016", DateTimeFormatter.ofPattern("dd/MM/yyyy"));

    public Aluno(String matricula, String nome, LocalDate dataNascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    // Métodos Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
