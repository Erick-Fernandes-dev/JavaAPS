package br.ufpb.dcx.aps.atividades.banco;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    private Map<Integer, Conta> contas = new HashMap<>();
    private int numeroContalivre;
    private Map<String, Correntista> correntistas = new HashMap<>();
    private String nome;

    public Banco(String nome) {
        this.nome = nome;
    }



    public Conta criarConta(Correntista correntista) {
        Conta conta = new Conta(correntista, numeroContalivre, this);
        contas.put(numeroContalivre, conta);
        return conta;
    }

    public Conta getConta(int numeroConta) {
        return contas.get(numeroConta);
    }

    public void addCorrentista(Correntista correntista) throws BancoException{
        if(correntistas.containsKey(correntista.getCpf())){
            throw new BancoException("Correntista já cadastrado");
        }
        correntistas.put(correntista.getCpf(), correntista);
    }

    public Correntista getCorrentista(String cpf) throws BancoException{
        if(!correntistas.containsKey(cpf)){
            throw new BancoException("Correntista não cadastrado");
        }
        return correntistas.get(cpf);
    }

    public String getNome() {
        return nome;
    }
}
