package org.example.Tasks5;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static int[][] sumOfArrays(int[][] array1, int[][] array2) {
        int rows = array1.length;
        int cols = array1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }

    public static int[][] arraySigns(int[][] array1, int[][] array2) {
        int rows = array1.length;
        int cols = array1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((array1[i][j] > 0 && array2[i][j] > 0) || (array1[i][j] < 0 && array2[i][j] < 0)) {
                    result[i][j] = 100;
                } else {
                    result[i][j] = 0;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] array2 = {{7, 8, 9}, {10, 11, 12}};

        int[][] sum = sumOfArrays(array1, array2);
        int[][] signs = arraySigns(array1, array2);

        System.out.println(Arrays.deepToString(sum));
        System.out.println(Arrays.deepToString(signs));
    }
}

