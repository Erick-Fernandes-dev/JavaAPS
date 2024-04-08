package br.ufpb.dcx.rodrigor.strategy.form;

public class ValidadorTextoSimples implements ValidadorCampo {


    private int max;
    private int min;

    public ValidadorTextoSimples(int max, int min){
        this.max = max;
        this.min = min;
    }

    public ValidadorTextoSimples(){

    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }


    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    @Override
    public Resultado validarCampo(String valor) {
        return null;
    }
}
