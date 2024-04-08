package person.strategies.transportation;

public class AirplaneStrategy implements TransportationStrategy {
    @Override
    public void move() {
        System.out.println("Moving by airplane");
    }
}
