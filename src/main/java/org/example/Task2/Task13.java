package org.example.Task2;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        double power = Math.pow(a, n);
        double product = 1;
        for (int i = 0; i < n; i++) {
            product *= (a + i);
        }
        double sum = 0;
        double term = a;
        for (int i = 0; i < n; i++) {
            sum += 1 / term;
            term *= (a + i + 1);
        }
        System.out.println("Power: " + power);
        System.out.println("Product: " + product);
        System.out.println("Sum Expression: " + sum);
    }
}
