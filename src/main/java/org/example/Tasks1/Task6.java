package org.example.Tasks1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a > 1 && a < 3) System.out.print(a + " ");
        if (b > 1 && b < 3) System.out.print(b + " ");
        if (c > 1 && c < 3) System.out.print(c);
    }
}
