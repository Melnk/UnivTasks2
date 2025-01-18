package org.example.HomeWork2;

// File: Task2.java
import java.util.Scanner;

public class HW2 {
    public static boolean hasTwoEvenLocalMaxima(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1] && nums[i] % 2 == 0) {
                count++;
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array and elements:");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Has two even local maxima: " + hasTwoEvenLocalMaxima(nums));
        scanner.close();
    }
}
