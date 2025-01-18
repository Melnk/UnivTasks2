package org.example.HomeWork2;

// File: Task5.java
import java.util.Scanner;

public class HW5 {
    public static void modifySequence(double[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] += 0.5;
            } else {
                nums[i] = 0.1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array and elements:");
        int size = scanner.nextInt();
        double[] nums = new double[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextDouble();
        }
        modifySequence(nums);
        System.out.println("Modified sequence:");
        for (double num : nums) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}
