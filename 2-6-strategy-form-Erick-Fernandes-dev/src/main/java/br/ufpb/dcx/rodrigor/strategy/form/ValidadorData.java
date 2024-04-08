package br.ufpb.dcx.rodrigor.strategy.form;

import java.util.Calendar;

public class ValidadorData implements ValidadorCampo{

    private Calendar dataMinima;
    private Calendar dataMaxima;

    public ValidadorData(Calendar dataMinima, Calendar dataMaxima){
        this.dataMinima = dataMinima;
        this.dataMaxima = dataMaxima;
    }

    @Override
    public Resultado validarCampo(String valor) {

        String data = valor + this.dataMinima +  " - " + this.dataMaxima;

        Resultado resultado = new Resultado(true, "Valores válidos" + data);

        if (resultado.isErro() == false) {
            return resultado;
        }

        return resultado;
        }
}
