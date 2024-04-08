package br.ufpb.dcx.rodrigor.atividade;

<<<<<<< HEAD
import java.time.LocalDate;
import java.util.Objects;

public class Aluno {
    private String nome;
    private String matricula;
    private LocalDate dataDeNascimento;

    public Aluno(String nome, String matricula, LocalDate dataDeNascimento) {
=======
public class Aluno {

    private String nome;
    private String matricula;
    private String dataDeNascimento;

    public Aluno(String nome, String matricula, String dataDeNascimento) {
>>>>>>> origin/master
        this.nome = nome;
        this.matricula = matricula;
        this.dataDeNascimento = dataDeNascimento;
    }

<<<<<<< HEAD
    public String getNome() {
        return nome;
=======
    public Aluno() {
    }

    public String getNome() {
        return this.nome;
>>>>>>> origin/master
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
<<<<<<< HEAD
        return matricula;
=======
        return this.matricula;
>>>>>>> origin/master
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

<<<<<<< HEAD
    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome ='" + nome + '\'' +
                ", matricula ='" + matricula + '\'' +
                ", dataDeNascimento =" + dataDeNascimento +
                '}';
    }
}

=======
    public String getDataDeNascimento() {
        return this.dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

}
>>>>>>> origin/master
