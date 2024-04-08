package br.ufpb.dcx.aps.atividade.observer;

public class PrevisorDeTempo implements Listener{
    //public void notificarNovaTemperatura(double temperatura) {
        // Implementar lógica de previsão de tempo aqui...
    //}

    @Override
    public void atualizar(double valor) {
        System.out.println("Previsão de tempo: " + valor);

    }

    public void notificarNovaTemperatura(double temperatura) {

        // Implementar lógica de previsão de tempo aqui...
        System.out.println("Previsão de tempo: " + temperatura);


    }
}
