package worker.strategies.transportation;

public class AirplaneStrategy implements TransportationStrategy {

        @Override
        public void move() {
            System.out.println("I am moving by airplane");
        }
}
