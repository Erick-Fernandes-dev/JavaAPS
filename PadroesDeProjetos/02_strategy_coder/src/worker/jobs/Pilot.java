package worker.jobs;

import worker.strategies.eat.MeatFoodStrategy;
import worker.strategies.transportation.AirplaneStrategy;
import worker.strategies.work.PilotStrategy;

public class Pilot implements Worker{
    @Override
    public void eat() {
        new MeatFoodStrategy().eat();

    }

    @Override
    public void move() {
        new AirplaneStrategy().move();

    }

    @Override
    public void work() {
        new PilotStrategy().work();

    }
}
