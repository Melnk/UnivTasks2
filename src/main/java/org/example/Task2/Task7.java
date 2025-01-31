package org.example.Task2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double z = scanner.nextDouble();
        double x = scanner.nextDouble();
        if (a % b == 0) {
            z *= x;
        } else {
            z /= x;
        }
        System.out.println(z);
    }
}
