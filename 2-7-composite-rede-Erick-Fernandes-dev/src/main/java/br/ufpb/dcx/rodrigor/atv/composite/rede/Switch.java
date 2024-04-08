package br.ufpb.dcx.rodrigor.atv.composite.rede;

public class Switch implements ElementoRede {


    private String nome;
    private String ip;

    public Switch(){

    }

    public Switch(String nome, String ip){
        this.nome = nome;
        this.ip = ip;
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
