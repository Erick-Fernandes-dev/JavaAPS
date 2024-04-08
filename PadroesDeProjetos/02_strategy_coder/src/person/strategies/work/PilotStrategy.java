package person.strategies.work;

public class PilotStrategy implements WorkStrategy{
    @Override
    public void work() {
        System.out.println("Working as a pilot");
    }
}
