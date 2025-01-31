package org.example.Task2;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int count = 0, sum = 0;
        for (int num : arr) {
            if (num % 5 == 0 && num % 7 != 0) {
                count++;
                sum += num;
            }
        }
        System.out.println("Count: " + count + ", Sum: " + sum);
    }
}
