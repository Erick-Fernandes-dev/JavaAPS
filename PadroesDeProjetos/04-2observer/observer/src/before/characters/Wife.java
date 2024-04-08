package before.characters;

public class Wife {

    private Doorman doorman;

    public Wife(Doorman doorman) {
        this.doorman = doorman;
    }
    // esposa interfona para o porteiro a cada minuto, hora, segundo, etc
    public void startPartyIfPossible() {
        if (this.doorman.getStatus()) {
            partyTime();
        } else {
            System.out.println("Hold");
        }
    }

    public void partyTime() {
        System.out.println("Party time! :D");
    }
}
