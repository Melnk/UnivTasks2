package org.example.Task3;

// Task1.java
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // a) Номер максимального числа
        int maxIdx = n - 1;
        for (int i = 0; i < n; i++) {
            if (a[i] >= a[maxIdx]) {
                maxIdx = i;
            }
        }

        // b) Номер минимального числа
        int minIdx = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[minIdx]) {
                minIdx = i;
            }
        }

        System.out.println("Максимальный элемент на позиции: " + (maxIdx + 1));
        System.out.println("Минимальный элемент на позиции: " + (minIdx + 1));
    }
}
