package org.example.Tasks1;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = b * b - 4 * a * c;
        if (d < 0) {
            System.out.println("No real roots");
        } else if (d == 0) {
            System.out.println(-b / (2 * a));
        } else {
            System.out.println((-b + Math.sqrt(d)) / (2 * a) + " " + (-b - Math.sqrt(d)) / (2 * a));
        }
    }
}
