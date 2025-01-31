package org.example.Task3;

// Task3.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int maxSumIdx1 = -1, maxSumIdx2 = -1;
        int minSumIdx1 = -1, minSumIdx2 = -1;

        for (int i = 0; i < n - 1; i++) {
            int sum = a[i] + a[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIdx1 = i;
                maxSumIdx2 = i + 1;
            }
            if (sum < minSum) {
                minSum = sum;
                minSumIdx1 = i;
                minSumIdx2 = i + 1;
            }
        }

        System.out.println("Максимальная сумма: " + maxSum + " на позициях: " + (maxSumIdx1 + 1) + ", " + (maxSumIdx2 + 1));
        System.out.println("Минимальная сумма: " + minSum + " на позициях: " + (minSumIdx1 + 1) + ", " + (minSumIdx2 + 1));
    }
}

