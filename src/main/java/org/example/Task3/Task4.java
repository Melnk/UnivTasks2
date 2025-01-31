package org.example.Task3;

// Task4.java
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            if (num > 0 && num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Сумма положительных четных чисел: " + sum);
    }
}
