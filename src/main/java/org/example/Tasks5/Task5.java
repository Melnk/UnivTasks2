package org.example.Tasks5;

import java.util.Scanner;

public class Task5 {
    // С использованием дополнительного массива для строк
    public static void swapRowsWithExtraArray(int[][] array, int row1, int row2) {
        int[] temp = array[row1];
        array[row1] = array[row2];
        array[row2] = temp;
    }

    // Без использования дополнительного массива для строк
    public static void swapRowsInPlace(int[][] array, int row1, int row2) {
        for (int i = 0; i < array[row1].length; i++) {
            int temp = array[row1][i];
            array[row1][i] = array[row2][i];
            array[row2][i] = temp;
        }
    }

    // С использованием дополнительного массива для столбцов
    public static void swapColumnsWithExtraArray(int[][] array, int col1, int col2) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i][col1];
            array[i][col1] = array[i][col2];
            array[i][col2] = temp;
        }
    }

    // Без использования дополнительного массива для столбцов
    public static void swapColumnsInPlace(int[][] array, int col1, int col2) {
        for (int i = 0; i < array.length; i++) {
            array[i][col1] ^= array[i][col2];
            array[i][col2] ^= array[i][col1];
            array[i][col1] ^= array[i][col2];
        }
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        swapRowsWithExtraArray(array, 0, 2);
        swapColumnsWithExtraArray(array, 0, 2);
    }
}

