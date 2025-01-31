package org.example.Tasks5;

import java.util.Scanner;

public class Task3 {
    public static int maxOfSum(int[][] array, int k, int s) {
        int rowSum = 0, colSum = 0;

        for (int i = 0; i < array[k].length; i++) {
            rowSum += array[k][i];
        }

        for (int i = 0; i < array.length; i++) {
            colSum += array[i][s];
        }

        return Math.max(rowSum, colSum);
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(maxOfSum(array, 1, 2));
    }
}

