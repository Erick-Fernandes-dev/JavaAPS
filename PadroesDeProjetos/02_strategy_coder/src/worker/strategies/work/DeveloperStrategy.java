package worker.strategies.work;

public class DeveloperStrategy implements WorkStrategy{
    @Override
    public void work() {
        System.out.println("I'm a developer, I write code");
    }
}
