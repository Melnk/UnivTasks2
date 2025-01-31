package org.example.Task2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double num : arr) {
            if (num > 0) sum += num;
        }
        System.out.println("Double Sum: " + (2 * sum));
    }
}
