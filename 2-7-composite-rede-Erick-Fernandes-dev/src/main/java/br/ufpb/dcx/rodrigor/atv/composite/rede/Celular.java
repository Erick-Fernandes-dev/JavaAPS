package br.ufpb.dcx.rodrigor.atv.composite.rede;

public class Celular implements  ElementoRede{

    private String nome;
    private String ip;

    public Celular(){

    }


    public Celular(String nome, String ip){
        this.nome = nome;
        this.ip = ip;
    }

    @Override
    public String getNome() {
        return this.getNome();
    }

    @Override
    public String getIp() {
        return this.ip;
    }
}
