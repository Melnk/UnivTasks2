package org.example.HomeWork2;

// File: Task3.java
import java.util.Scanner;

public class HW3 {
    public static void compareFractions(int m, int n) {
        final double PI = 3.141592653589793;
        double fraction1 = (double) m / n;
        double fraction2 = (double) n / m;

        if (Math.abs(fraction1 - PI) < Math.abs(fraction2 - PI)) {
            m *= 10;
        } else {
            n *= 2;
        }

        System.out.println("Updated values: m = " + m + ", n = " + n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m and n:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        compareFractions(m, n);
        scanner.close();
    }
}

