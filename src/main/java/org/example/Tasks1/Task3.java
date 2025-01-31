package org.example.Tasks1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a <= b) a = 0;
        System.out.println(a + " " + b);
    }
}
