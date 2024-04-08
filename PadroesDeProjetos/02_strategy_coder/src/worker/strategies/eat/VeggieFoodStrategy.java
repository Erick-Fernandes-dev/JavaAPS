package worker.strategies.eat;

public class VeggieFoodStrategy implements EatStrategy {
    @Override
    public void eat() {
        System.out.println("Eating veggies");
    }
}
