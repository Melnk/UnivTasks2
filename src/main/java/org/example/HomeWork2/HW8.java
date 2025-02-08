package org.example.HomeWork2;

// File: Task8.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HW8 {
    public static int[] fillArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (i % 2 == 0 ? 1 : -1) * (2 * i + 1);
        }
        return a;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = scanner.nextInt();
        int[] array = fillArray(n);
        System.out.println("Генерация массива:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        scanner.close();
    }
}