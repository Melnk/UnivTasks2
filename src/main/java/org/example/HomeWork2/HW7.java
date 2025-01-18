package org.example.HomeWork2;


// File: Task7.java
import java.util.Scanner;

public class HW7 {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static int firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    public static int secondLastDigit(int n) {
        return (n / 10) % 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a natural number n (n <= 100):");
        int n = scanner.nextInt();
        System.out.println("Number of digits: " + countDigits(n));
        System.out.println("Sum of digits: " + sumDigits(n));
        System.out.println("First digit: " + firstDigit(n));
        if (n >= 10) {
            System.out.println("Second last digit: " + secondLastDigit(n));
        }
        scanner.close();
    }
}