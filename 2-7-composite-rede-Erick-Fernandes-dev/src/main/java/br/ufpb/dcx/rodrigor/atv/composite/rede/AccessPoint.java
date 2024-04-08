package br.ufpb.dcx.rodrigor.atv.composite.rede;

public class AccessPoint implements  ElementoRede{

    private String nome;
    private String ip;

    public AccessPoint(){

    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getIp() {
        return this.ip;
    }
}
