package org.example.Task2;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        double resultA = (a >= -2 && a <= 2) ? (a * a) : 4;
        double resultB = (a <= 2) ? (a * a + 4 * a + 5) : (1.0 / (a * a + 4 * a + 5));
        System.out.println("Result A: " + resultA);
        System.out.println("Result B: " + resultB);
    }
}
