package org.example.HomeWork4.Task3;

public class RationalFraction {
    private int numerator;
    private int denominator;

    public RationalFraction() {
        this(0, 1);
    }

    public RationalFraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private void reduce() {
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        numerator /= gcd;
        denominator /= gcd;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public RationalFraction add(RationalFraction other) {
        return new RationalFraction(this.numerator * other.denominator + other.numerator * this.denominator,
                this.denominator * other.denominator);
    }

    public void add2(RationalFraction other) {
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator *= other.denominator;
        reduce();
    }

    public RationalFraction sub(RationalFraction other) {
        return new RationalFraction(this.numerator * other.denominator - other.numerator * this.denominator,
                this.denominator * other.denominator);
    }

    public void sub2(RationalFraction other) {
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator *= other.denominator;
        reduce();
    }

    public RationalFraction mult(RationalFraction other) {
        return new RationalFraction(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public void mult2(RationalFraction other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        reduce();
    }

    public RationalFraction div(RationalFraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return new RationalFraction(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public void div2(RationalFraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Division by zero");
        }
        this.numerator *= other.denominator;
        this.denominator *= other.numerator;
        reduce();
    }

    public double value() {
        return (double) numerator / denominator;
    }

    public int numberPart() {
        return numerator / denominator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof RationalFraction)) return false;
        RationalFraction other = (RationalFraction) obj;
        return this.numerator == other.numerator && this.denominator == other.denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public static void main(String[] args) {
        RationalFraction f1 = new RationalFraction(2, 4);
        RationalFraction f2 = new RationalFraction(1, 2);
        System.out.println(f1 + " equals " + f2 + "? " + f1.equals(f2));
        System.out.println("Sum: " + f1.add(f2));
        System.out.println("Difference: " + f1.sub(f2));
        System.out.println("Product: " + f1.mult(f2));
        System.out.println("Quotient: " + f1.div(f2));
    }
}
