package br.ufpb.dcx.aps.sysacademico;

public class Professor {

    private String nome;
    private String siape;

    public Professor(String nome, String siape) {
        this.nome = nome;
        this.siape = siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
}
