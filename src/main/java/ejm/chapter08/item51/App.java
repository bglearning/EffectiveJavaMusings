package ejm.chapter08.item51;

public class App {

    public static void main(String[] args) {
        int num = 100;

        String hundredNums = "";

        long start = System.nanoTime();

        System.out.println("Hundred strings");

        for (int i = 1; i <= num; i++) {
            hundredNums += String.valueOf(i);
        }

        System.out.println("Concatenation Time: " + (System.nanoTime() - start));

        start = System.nanoTime();

        StringBuilder b = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            b.append(String.valueOf(i));
        }

        String anotherHundredNums = b.toString();

        System.out.println("Builder Time: " + (System.nanoTime() - start));

    }
}

