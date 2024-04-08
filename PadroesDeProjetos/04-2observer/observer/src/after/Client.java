package after;

public class Client {

    public static void main(String[] args) {
        Doorman doorman = new Doorman();
        doorman.add(new Wife());
        doorman.add(new Friend());

        System.out.println("Husband is comming");
        doorman.setStatus(true);
        doorman.setStatus(true);

        doorman.setStatus(false);
        doorman.setStatus(true);

    }
    
}
