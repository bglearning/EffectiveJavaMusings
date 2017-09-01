package ejm.chapter06.item37;

public class App {

    public static void main(String[] args) {
        Sender sender = new Sender();

        Email email = new Email();

        try {
            sender.send(email);
            sender.send(new Integer(7));
        } catch(IllegalArgumentException e) {
            System.out.println(e.getClass().getName() + " : " + e.getMessage());
        }
    }

}
