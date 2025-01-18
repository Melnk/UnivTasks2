package org.example.HomeWork2;

// File: Task4.java
import java.util.Scanner;

public class HW4 {
    public static boolean hasTwoSpecificNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int length = String.valueOf(Math.abs(num)).length();
            if ((length == 3 || length == 5) && allDigitsEvenOrOdd(num)) {
                count++;
            }
        }
        return count == 2;
    }

    private static boolean allDigitsEvenOrOdd(int num) {
        num = Math.abs(num);
        boolean even = num % 10 % 2 == 0;
        while (num > 0) {
            if ((num % 10 % 2 == 0) != even) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array and elements:");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Has two specific numbers: " + hasTwoSpecificNumbers(nums));
        scanner.close();
    }
}
