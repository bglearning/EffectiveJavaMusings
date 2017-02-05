package ejm.chapter04.item15;

import java.lang.Math;

public class ComplexApp {

    public static void main(String[] args) {

        Complex c = Complex.valueOf(1, 1);
        System.out.printf("%25s %s\n", "Original:" , c);
        System.out.printf("%25s %s\n", "Add One:" , c.add(Complex.ONE));
        System.out.printf("%25s %s\n", "Subtract I:" , c.subtract(Complex.I));
        System.out.printf("%25s %s\n", "Multiply by 2:" , c.multiply(Complex.valueOf(2, 0)));
        System.out.printf("%25s %s\n\n", "Divide by I:" , c.divide(Complex.I));

        System.out.printf("%25s %s\n", "Created from polar:" , Complex.valueOfPolar(5, Math.PI / 2.0));
    }
}
