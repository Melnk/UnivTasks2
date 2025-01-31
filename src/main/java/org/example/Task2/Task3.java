package org.example.Task2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println("Введите номер действия: 1 – квадрат; 2 – корень; 3 – синус; 4 – косинус");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println(x * x);
            case 2 -> System.out.println(Math.sqrt(x));
            case 3 -> System.out.println(Math.sin(x));
            case 4 -> System.out.println(Math.cos(x));
            default -> System.out.println("Ошибка ввода");
        }
    }
}
