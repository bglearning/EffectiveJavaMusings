package ejm.chapter08.item47;

import java.util.Random;

public class App {

    private static final Random rnd = new Random();

    public static int random(int n) {
        return Math.abs(rnd.nextInt()) % n;
    }

    public static void main(String[] args) {

        int n = 2 * (Integer.MAX_VALUE / 3);
        int low1 = 0;
        for (int i = 0; i < 1000000; i++) {
            if (random(n) < n/2)
                low1++;
        }

        int low2 = 0;
        for (int i = 0; i < 1000000; i++) {
            if (rnd.nextInt(n) < n/2)
                low2++;
        }
        System.out.println("Low should be around half a million");
        System.out.println("Low1: " + low1);
        System.out.println("Low2: " + low2);
    }

}
