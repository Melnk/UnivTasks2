package org.example.Tasks5;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static int[] getAboveMainDiagonal(int[][] array) {
        int n = array.length;
        int[] result = new int[n * (n - 1) / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    public static int[] getBelowMainDiagonal(int[][] array) {
        int n = array.length;
        int[] result = new int[n * (n - 1) / 2];
        int index = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    public static int[] getAboveSecondaryDiagonal(int[][] array) {
        int n = array.length;
        int[] result = new int[n * (n - 1) / 2];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1 - i; j < n; j++) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    public static int[] getBelowSecondaryDiagonal(int[][] array) {
        int n = array.length;
        int[] result = new int[n * (n - 1) / 2];
        int index = 0;
        for (int i = 1; i < n; i++) {
            for (int j = n - 1 - i; j >= 0; j--) {
                result[index++] = array[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println(Arrays.toString(getAboveMainDiagonal(array)));
        System.out.println(Arrays.toString(getBelowMainDiagonal(array)));
        System.out.println(Arrays.toString(getAboveSecondaryDiagonal(array)));
        System.out.println(Arrays.toString(getBelowSecondaryDiagonal(array)));
    }
}

