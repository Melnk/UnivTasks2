package org.example.Task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = scanner.nextInt();
        if (hour >= 6 && hour < 12) System.out.println("Доброе утро");
        else if (hour >= 12 && hour < 18) System.out.println("Добрый день");
        else if (hour >= 18 && hour < 24) System.out.println("Добрый вечер");
        else System.out.println("Доброй ночи");
    }
}
