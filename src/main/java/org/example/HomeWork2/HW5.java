package org.example.HomeWork2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HW5 {
    /**
     * Изменяет последовательность чисел:
     * если число отрицательное, прибавляет 0.5;
     * если число неотрицательное, заменяет его на 0.1.
     * @param nums массив чисел
     */
    public static void modifySequence(double[] nums) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] += 0.5;
            } else {
                nums[i] = 0.1;
            }
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива и его элементы:");
        int size = scanner.nextInt();
        double[] nums = new double[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextDouble();
        }
        modifySequence(nums);
        System.out.println("Измененная последовательность:");
        for (double num : nums) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}

