package br.ufpb.dcx.rodrigor.atv.composite.rede;

import java.util.ArrayList;
import java.util.List;

public class Roteador implements  ElementoRede {

    private String nome;
    private String ip;

    private ElementoRedeComposto elementoRedeComposto;

    public Roteador(String nome){
        this.nome = nome;

    }

    public Roteador(String nome, String ip){
        this.nome = nome;
        this.ip = ip;
        elementoRedeComposto.add(new Roteador(nome, ip));

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
