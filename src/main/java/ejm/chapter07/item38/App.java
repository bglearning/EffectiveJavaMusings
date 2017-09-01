package ejm.chapter07.item38;

public class App {

    /**
     * Computes division.
     *
     * @param dividend
     *          the dividend to be divided
     * @param divisor
     *          the divisor used to divide the dividend
     *  
     * @throws ArithmeticException if divisor is zero
     */
    public static double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisor == 0");
        }

        return dividend * 1.0d / divisor;
    }

    private static double dividePrivate(int dividend, int divisor) {

        assert divisor != 0;

        return dividend * 1.0d / divisor;
    }

    public static void main(String[] args) {

        System.out.println("Public divide...");
        try {
            System.out.printf("%.2f\n", divide(5, 6));
            System.out.printf("%.2f", divide(5, 0));
        } catch(ArithmeticException e) {
            System.out.println(e.getClass().getName() + " : " + e.getMessage());
        }

        System.out.println("Private divide...");
        System.out.printf("%.2f\n", dividePrivate(5, 6));
        System.out.printf("%.2f", dividePrivate(5, 0));
    }

}
