package br.ufpb.dcx.rodrigor.strategy.form;

import java.util.List;

public class Resultado {

    private boolean erro;
    private String msg;

    private List<String> mensagens;

    public Resultado(){

    }

    public Resultado(boolean erro) {
        this.erro = erro;
    }

    public Resultado(boolean erro, String msg) {
        this.erro = erro;
        this.msg = msg;
    }

    public List<String> getMensagens() {
        return mensagens;

    }

    public boolean isErro(){
        return erro;
    }
}
