package br.ufpb.dcx.aps.atividades.atv04;

public class Professor {

    private String siape;
    private String nome;

    public Professor(String siape, String nome) {
        this.siape = siape;
        this.nome = nome;
    }

    public String getSiape() {
        return siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
