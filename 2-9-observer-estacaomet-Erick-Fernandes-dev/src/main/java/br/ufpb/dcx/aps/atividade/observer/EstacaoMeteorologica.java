package br.ufpb.dcx.aps.atividade.observer;

import java.util.ArrayList;
import java.util.List;

public class EstacaoMeteorologica {
    private List<Listener> observadores = new ArrayList<>();

    public void adicionarObservador(Listener observador) {
        observadores.add(observador);
    }

    public void removerObservador(Listener observador) {
        observadores.remove(observador);
    }

    public void novaMedicaoTemperatura(double temperatura) {
        notificarObservadores(temperatura);
    }

    public void novaMedicaoPressao(double pressao) {
        notificarObservadores(pressao);
    }

    private void notificarObservadores(double valor) {
        for (Listener observador : observadores) {
            observador.atualizar(valor);
        }
    }
}

