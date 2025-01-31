package org.example.Task2;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        double[] arr = new double[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextDouble();
        }
        System.out.print("Enter index to exclude: ");
        int excludeIndex = scanner.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != excludeIndex) {
                sum += arr[i];
                count++;
            }
        }
        System.out.println("Arithmetic Mean Excluding: " + (count > 0 ? sum / count : 0));
    }
}
