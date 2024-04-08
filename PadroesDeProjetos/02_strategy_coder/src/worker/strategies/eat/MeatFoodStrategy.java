package worker.strategies.eat;

public class MeatFoodStrategy implements EatStrategy {
    @Override
    public void eat() {
        System.out.println("Eating meat");
    }
}
