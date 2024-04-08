package person.strategies.transportation;

public class BikeStrategy implements TransportationStrategy {
    @Override
    public void move() {
        System.out.println("Moving by bike");
    }
}

