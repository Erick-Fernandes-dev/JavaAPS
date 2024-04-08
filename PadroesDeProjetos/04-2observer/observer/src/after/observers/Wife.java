package observer.src.after.observers;

public class Wife implements Observer {

    public void partyTime() {
        System.out.println("Let's party!");

    }

    @Override
    public void update(boolean status) {
        if (status) {
            partyTime();
        } else {
            System.out.println("Hold");
        }
    }


}
