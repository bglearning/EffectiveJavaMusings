package ejm.chapter06.item30;

public class App {

    public static void main(String[] args) {

        double a = 2.0d;
        double b = 4.0d;

        for (Operation op : Operation.values() ) {
            System.out.println(String.format("%.2f %s %.2f = %.2f", a, op, b, op.apply(a, b)));
        }
        
        try {
        	System.out.println("Trying out 1/0...");
        	Operation.DIVISION.apply(1.0d, 0.0d);
        	
        } catch (IllegalArgumentException e) {
        	System.out.println(e.getMessage());
        }

    }
}
