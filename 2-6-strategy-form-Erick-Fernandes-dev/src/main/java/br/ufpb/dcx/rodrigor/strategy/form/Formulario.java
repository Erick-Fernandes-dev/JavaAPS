package br.ufpb.dcx.rodrigor.strategy.form;

import java.util.ArrayList;
import java.util.List;

public class Formulario  {

    private String titulo;
    private List<ItemFormulario> itens = new ArrayList<>();


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void addItemFormulario(ItemFormulario item) {
        this.itens.add(item);
    }

    public ItemFormulario getItemFormulario(String id) {
        for (ItemFormulario item : itens) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public Resultado validar() {
        Resultado resultado = new Resultado();
        for (ItemFormulario item : itens) {
            Resultado r = item.validar();
            if (r.isErro()) {
                //resultado.setErro(true);
                resultado.getMensagens().addAll(r.getMensagens());
            }
        }
        return resultado;
    }
}
