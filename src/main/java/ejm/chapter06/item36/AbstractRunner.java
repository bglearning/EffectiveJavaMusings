package ejm.chapter06.item36;

public abstract class AbstractRunner implements Runner {

    @Override
    public abstract void run();

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

}
