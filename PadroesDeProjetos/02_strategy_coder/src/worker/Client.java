package worker;

import worker.jobs.Developer;
import worker.jobs.HipsterDeveloper;
import worker.jobs.Pilot;
import worker.jobs.Worker;

public class Client {

    public static void presentYourself(Worker worker, String name) {
        System.out.println("Hello, my name is " + name);
        worker.eat();
        worker.move();
        worker.work();

        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Worker jhon = new Developer();
        presentYourself(jhon, "Jhon");

        Worker ann = new Pilot();
        presentYourself(ann, "Ann");

        Worker carol = new HipsterDeveloper();
        presentYourself(carol, "Carol");
    }


}
