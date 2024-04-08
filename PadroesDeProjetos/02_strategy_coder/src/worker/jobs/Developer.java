package worker.jobs;

import worker.strategies.eat.MeatFoodStrategy;
import worker.strategies.transportation.CarStrategy;
import worker.strategies.work.DeveloperStrategy;

public class Developer implements Worker{
    @Override
    public void eat() {
        new MeatFoodStrategy().eat();

    }

    @Override
    public void move() {
        new CarStrategy().move();

    }

    @Override
    public void work() {
        new DeveloperStrategy().work();

    }
}
