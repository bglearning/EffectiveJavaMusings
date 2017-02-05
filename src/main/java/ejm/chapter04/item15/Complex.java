package ejm.chapter04.item15;

import java.lang.Math;
import java.util.Objects;

public final class Complex {
    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public static Complex valueOfPolar(double r, double theta) {
        return new Complex(r * Math.cos(theta), r * Math.sin(theta));
    }

    public static final Complex ZERO = new Complex(0.0d, 0.0d);
    public static final Complex ONE = new Complex(1.0d, 0.0d);
    public static final Complex I = new Complex(0.0d, 1.0d);

    public double realPart() { return re; }
    public double imaginaryPart() { return im; }

    public Complex add(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }

    public Complex subtract(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }

    public Complex multiply(Complex c) {
        return new Complex(re * c.re - im * c.im, re * c.im + im * c.re); 
    }

    public Complex divide(Complex c) {
        double tmp = c.re * c.re - c.im * c.im;

        return new Complex((re * c.re + im * c.im) / tmp, 
                           (c.re * im - re * c.im) / tmp);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Complex))
            return false;

        Complex c = (Complex) o;

        return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    @Override
    public String toString() {
        return "(" + re + " + " + im + "i" + ")";
    }
}
