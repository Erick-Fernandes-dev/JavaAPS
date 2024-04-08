package br.ufpb.dcx.rodrigor.atv.composite.rede;

public class TV implements ElementoRede {

    private String nome;
    private String ip;

    public TV(){

    }

    public TV(String nome, String ip){
        this.nome = nome;
        this.ip = ip;
    }


    public TV(String smartTv) {
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
