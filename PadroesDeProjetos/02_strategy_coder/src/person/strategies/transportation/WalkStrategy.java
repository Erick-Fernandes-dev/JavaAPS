package person.strategies.transportation;

public class WalkStrategy implements TransportationStrategy{
    @Override
    public void move() {
        System.out.println("Moving by walk");
    }
}