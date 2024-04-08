package br.ufpb.dcx.rodrigor.atv.composite.rede;

public class AP implements ElementoRede {

    private String nome;
    private String ip;

    public AP(){

    }

    public AP(String nome, String ip){
        this.nome = nome;
        this.ip = ip;
    }

    public AP(String s) {
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public String getIp() {
        return null;
    }
}
