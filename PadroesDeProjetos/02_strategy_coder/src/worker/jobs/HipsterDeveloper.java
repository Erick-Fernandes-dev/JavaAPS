package worker.jobs;

import worker.strategies.eat.VeggieFoodStrategy;
import worker.strategies.transportation.BikeStrategy;
import worker.strategies.work.DeveloperStrategy;

public class HipsterDeveloper implements Worker {
    @Override
    public void eat() {
        new VeggieFoodStrategy().eat();

    }

    @Override
    public void move() {
        new BikeStrategy().move();

    }

    @Override
    public void work() {
        new DeveloperStrategy().work();

    }
}
