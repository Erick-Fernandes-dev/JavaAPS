package br.ufpb.dcx.aps.atividades.banco;

import java.util.Objects;

public class Correntista {


    private String cpf;
    private String nome;
    private Conta conta;


    public Correntista(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Correntista(String cpf, String nome, Conta conta) {
        this.cpf = cpf;
        this.nome = nome;
        this.conta = conta;
    }

    public String getCpf() {
        return cpf;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public static boolean cpfValido(String cpf){
//        if(cpf.length() != 11){
//            return false;}
        String cpfSemSeparadores = removeSeparadores(cpf);
        if (cpfSemSeparadores.equals("00000000000") ||
                cpfSemSeparadores.equals("11111111111") ||
                cpfSemSeparadores.equals("22222222222") || cpfSemSeparadores.equals("33333333333") ||
                cpfSemSeparadores.equals("44444444444") || cpfSemSeparadores.equals("55555555555") ||
                cpfSemSeparadores.equals("66666666666") || cpfSemSeparadores.equals("77777777777") ||
                cpfSemSeparadores.equals("88888888888") || cpfSemSeparadores.equals("99999999999") ||
                (cpfSemSeparadores.length() != 11))
            return(false);
        return true;
    }

    public static  String removeSeparadores(String cpf){
        return cpf.replaceAll("[^0-9]", "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Correntista)) return false;
        Correntista that = (Correntista) o;
        return getCpf().equals(that.getCpf()) && getNome().equals(that.getNome()) && getConta().equals(that.getConta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCpf(), getNome(), getConta());
    }
}
