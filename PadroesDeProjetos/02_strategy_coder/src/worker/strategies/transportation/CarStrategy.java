package worker.strategies.transportation;

public class CarStrategy implements TransportationStrategy {

    @Override
    public void move() {
        System.out.println("I am moving by car");
    }
}
