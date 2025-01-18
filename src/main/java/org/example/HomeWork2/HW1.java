package org.example.HomeWork2;

// File: Task1.java
import java.util.Scanner;

public class HW1 {
    public static int convertToDecimal(int k, int n) {
        int decimal = 0, power = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit >= k) {
                throw new IllegalArgumentException("Invalid digit for the given base");
            }
            decimal += digit * Math.pow(k, power);
            n /= 10;
            power++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base (k) and number (n):");
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println("Decimal value: " + convertToDecimal(k, n));
        scanner.close();
    }
}