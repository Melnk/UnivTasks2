package org.example.Tasks5;

import java.util.Scanner;

public class Task2 {
    public static boolean isSumTwoDigit(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array[3].length; i++) {
            sum += array[3][i];
        }
        return sum >= 10 && sum <= 99;
    }

    public static boolean isProductLessThan(int[][] array, int colNum, int number) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i][colNum];
        }
        return product <= number;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        System.out.println(isSumTwoDigit(array));
        System.out.println(isProductLessThan(array, 1, 100));
    }
}

