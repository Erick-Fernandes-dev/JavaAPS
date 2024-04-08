package br.ufpb.dcx.aps.atividades.banco;

import java.util.Calendar;

public class Transacao {

    private int id;
    private Calendar data;
    private double valor;

    public Transacao(int id, double valor) {
        this.id = id;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public int getId() {
        return id;
    }

    public Calendar getDataTransacao() {

        return this.data;


    }

    @Override
    public String toString() {
        return "Transacao{" +
                "id=" + id +
                ", data=" + data +
                ", valor=" + valor +
                '}';
    }
}
