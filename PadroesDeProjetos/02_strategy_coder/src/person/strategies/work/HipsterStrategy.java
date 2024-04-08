package person.strategies.work;

public class HipsterStrategy implements WorkStrategy{
    @Override
    public void work() {
        System.out.println("Working as a hipster");
    }
}
