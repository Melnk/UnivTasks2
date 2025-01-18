package org.example.HomeWork2;

import java.util.Scanner;

public class HW10 {

    public static String getAgeNaming(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("Age must be between 1 and 100.");
        }

        if (n % 10 == 1 && n % 100 != 11) {
            return n + " год";
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            return n + " года";
        } else {
            return n + " лет";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age (n <= 100):");
        int n = scanner.nextInt();

        try {
            System.out.println(getAgeNaming(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

