package br.ufpb.dcx.rodrigor.strategy.form;

public class Campo implements ItemFormulario {






    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public void setValor(String valor) {

    }

    @Override
    public Resultado validar() {
        return null;
    }

    @Override
    public void setObrigatorio(boolean obrigatorio) {

    }

    @Override
    public boolean isObrigatorio() {
        return false;
    }

    @Override
    public boolean isPreenchido() {
        return false;
    }
}
