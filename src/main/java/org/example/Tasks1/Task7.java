package org.example.Tasks1;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        for (int i = 2; i <= 10; i++) {
            System.out.println(i + " x " + k + " = " + (i * k));
        }
    }
}
