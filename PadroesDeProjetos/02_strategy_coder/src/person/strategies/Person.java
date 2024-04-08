package person.strategies;

import person.strategies.eat.EatStrategy;
import person.strategies.transportation.TransportationStrategy;
import person.strategies.work.WorkStrategy;

public class Person {

    private EatStrategy eatStrategy;
    private WorkStrategy workStrategy;
    private TransportationStrategy transportationStrategy;
    private String name;

    public Person(String name, EatStrategy eatStrategy, TransportationStrategy transportationStrategy, WorkStrategy workStrategy) {
        this.name = name;
        this.eatStrategy = eatStrategy;
        this.workStrategy = workStrategy;
        this.transportationStrategy = transportationStrategy;
    }

    public String getName() {
        return name;
    }


    public void eat() {
        eatStrategy.eat();
    }

    public void move() {
        transportationStrategy.move();
    }

    public void work() {
        workStrategy.work();
    }


}
