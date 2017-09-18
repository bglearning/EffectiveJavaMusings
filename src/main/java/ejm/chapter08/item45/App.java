package ejm.chapter08.item45;

public class App {

    public static int square(int x) {
        return x * x;
    }

    public static void main(String[] args) {
        for (int i = 0, lim = square(3); i < lim; i++) {
            System.out.println(i);
        }

    }

}
