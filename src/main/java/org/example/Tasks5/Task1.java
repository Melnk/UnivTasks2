package org.example.Tasks5;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Task1 {
    public static boolean isProductThreeDigit(int[][] array) {
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            product *= array[i][1];  // Второй столбец
        }
        return product >= 100 && product <= 999;
    }

    public static boolean isSumGreaterThan(int[][] array, int rowNum, int number) {
        int sum = 0;
        for (int i = 0; i < array[rowNum].length; i++) {
            sum += array[rowNum][i];
        }
        return sum > number;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(isProductThreeDigit(array));
        System.out.println(isSumGreaterThan(array, 1, 10));
    }
}
