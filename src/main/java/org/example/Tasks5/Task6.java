package org.example.Tasks5;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static int[] getFirstEvenInColumn(int[][] array) {
        int[] result = new int[array[0].length];
        for (int j = 0; j < array[0].length; j++) {
            boolean found = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] % 2 == 0) {
                    result[j] = array[i][j];
                    found = true;
                    break;
                }
            }
            if (!found) result[j] = 0;
        }
        return result;
    }

    public static int[] getLastOddInRow(int[][] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            boolean found = false;
            for (int j = array[i].length - 1; j >= 0; j--) {
                if (array[i][j] % 2 != 0) {
                    result[i] = array[i][j];
                    found = true;
                    break;
                }
            }
            if (!found) result[i] = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] firstEvenInColumn = getFirstEvenInColumn(array);
        int[] lastOddInRow = getLastOddInRow(array);

        System.out.println(Arrays.toString(firstEvenInColumn));
        System.out.println(Arrays.toString(lastOddInRow));
    }
}

