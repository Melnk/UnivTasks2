package org.example.Task2;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long product = 1;
        boolean found = false;
        for (int num : arr) {
            if (num % 7 == 0) {
                product *= num;
                found = true;
            }
        }
        System.out.println("Product: " + (found ? product : 0));
    }
}
