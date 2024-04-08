package observer;

import java.util.Date;

// Carregar os dados do evento
public class ChegadaAniversarianteEvent {

    private final Date horaDaChegada;

    public ChegadaAniversarianteEvent(Date horaDaChegada) {
        this.horaDaChegada = horaDaChegada;
    }

    public Date getHoraDaChegada() {
        return horaDaChegada;
    }

}
