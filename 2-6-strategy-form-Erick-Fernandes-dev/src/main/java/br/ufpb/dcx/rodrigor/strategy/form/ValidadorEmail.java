package br.ufpb.dcx.rodrigor.strategy.form;

public class ValidadorEmail implements  ValidadorCampo {

    private String email;


    public ValidadorEmail(){

    }

    public ValidadorEmail(String email){
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public Resultado validarCampo(String valor) {

        Resultado resultado = new Resultado(false, "Email válido" + this.email);
        if (valor == null || valor.trim().isEmpty()) {
            resultado = new Resultado(true, "Email não pode ser vazio");
        } else if (!valor.contains("@")) {
            resultado = new Resultado(true, "Email inválido");
        }
        return resultado;
    }
}
