package worker.strategies.transportation;

public class BikeStrategy implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I am moving by bike");
    }
}
