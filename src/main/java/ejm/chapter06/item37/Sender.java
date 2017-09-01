package ejm.chapter06.item37;

public class Sender {

    public void send(Object obj) {
        if (!(obj instanceof Sendable)) {
            throw new IllegalArgumentException("Not sendable: " + obj.getClass().getName());
        }
        System.out.println("Okay to Send... " + obj.getClass().getName() );
    }

}

