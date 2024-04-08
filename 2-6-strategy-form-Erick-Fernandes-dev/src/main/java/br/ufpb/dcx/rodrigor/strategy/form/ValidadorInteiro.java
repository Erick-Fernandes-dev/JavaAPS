package br.ufpb.dcx.rodrigor.strategy.form;

public class ValidadorInteiro implements  ValidadorCampo{

    private int valorMaximo;
    private int valorMinimo;

    public ValidadorInteiro(){

    }

    public ValidadorInteiro(int valorMinimo, int valorMaximo){
        this.valorMinimo = valorMinimo;
        this.valorMaximo = valorMaximo;
    }



    @Override
    public Resultado validarCampo(String valor) {

            Resultado resultado = new Resultado(true, "Valor válido");

            if (valor == null || valor.trim().isEmpty()) {
                resultado = new Resultado(true, "Valor não pode ser vazio");

            } else if (!valor.matches("[0-9]+")) {
                resultado = new Resultado(true, "Valor inválido");

            } else {
                int valorInteiro = Integer.parseInt(valor);

                if (valorInteiro < valorMinimo || valorInteiro > valorMaximo) {

                    resultado = new Resultado(true, "Valor fora da faixa");
                }

            }

        return resultado;
    }
}
