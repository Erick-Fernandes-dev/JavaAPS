package person.strategies;

import person.strategies.eat.MeatFoodStrategy;
import person.strategies.eat.VeggieFoodStrategy;
import person.strategies.transportation.AirplaneStrategy;
import person.strategies.transportation.BikeStrategy;
import person.strategies.transportation.WalkStrategy;
import person.strategies.work.DeveloperStrategy;
import person.strategies.work.NoWorkStrategy;
import person.strategies.work.PilotStrategy;


public class Cliente {

    public static void presentYourself(Person person) {
        System.out.println("Hello, my name is " + person.getName());
        person.eat();
        person.move();
        person.work();

        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {

        Person jhon = new Person("Jhon",
                new MeatFoodStrategy(),
                new WalkStrategy(),
                new DeveloperStrategy());
        presentYourself(jhon);

        Person ann = new Person("Ann",
                new MeatFoodStrategy(),
                new AirplaneStrategy(),
                new PilotStrategy());
        presentYourself(ann);

        Person carol = new Person("Alan",
                new VeggieFoodStrategy(),
                new BikeStrategy(),
                new DeveloperStrategy());
        presentYourself(carol);

        Person alan = new Person("Carol",
                new VeggieFoodStrategy(),
                new WalkStrategy(),
                new NoWorkStrategy());
        presentYourself(alan);
    }
}
