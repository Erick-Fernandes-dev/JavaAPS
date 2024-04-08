package br.ufpb.dcx.aps.atividades.banco;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Correntista correntista;

    private static int count;
    private int numero;
    private List<Transacao> transacaos = new ArrayList<>();
    private Banco banco;


    public Conta(Correntista correntista, int numero, Banco banco) {
        this.correntista = correntista;
        this.numero = numero;
        this.banco = banco;
    }

    public Transacao depositar(double valor) {
        Transacao transacao = null;
        double valorDepositado = 0;

        for (Transacao t: this.transacaos) {
            valorDepositado += t.getValor();
            break;
        }

        return transacao;
    }

    public Transacao sacar(double valor) {
        Transacao transacao = null;
        double valorSacado = 0;

        for (Transacao t: this.transacaos) {
            valorSacado-= t.getValor();
            break;
        }

        return transacao;
    }

    public double getSaldo() {
        double saldo = 0;

        for (Transacao t: this.transacaos) {
            saldo += t.getValor();
        }

        return saldo;
    }

    public String extrato() {
        String extrato = "";

        for (Transacao t: this.transacaos) {
            extrato += t.toString();
        }

        return extrato;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
