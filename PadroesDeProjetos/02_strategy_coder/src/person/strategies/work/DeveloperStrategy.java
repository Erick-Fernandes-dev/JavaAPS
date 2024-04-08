package person.strategies.work;

public class DeveloperStrategy implements WorkStrategy{
    @Override
    public void work() {
        System.out.println("Working as a developer");
    }
}
