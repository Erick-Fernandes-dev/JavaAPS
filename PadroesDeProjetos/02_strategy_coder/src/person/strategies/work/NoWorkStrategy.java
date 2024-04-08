package person.strategies.work;

public class NoWorkStrategy implements WorkStrategy{
    @Override
    public void work() {
        System.out.println("Not working");
    }
}
