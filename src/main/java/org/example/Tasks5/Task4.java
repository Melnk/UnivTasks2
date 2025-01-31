package org.example.Tasks5;

import java.util.Scanner;

public class Task4 {
    public static boolean hasZeroColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            boolean allZeros = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] != 0) {
                    allZeros = false;
                    break;
                }
            }
            if (allZeros) return true;
        }
        return false;
    }

    public static boolean hasColumnInRange(int[][] array, int b) {
        for (int j = 0; j < array[0].length; j++) {
            boolean allInRange = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] < 0 || array[i][j] > b) {
                    allInRange = false;
                    break;
                }
            }
            if (allInRange) return true;
        }
        return false;
    }

    public static boolean hasEvenColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            boolean allEven = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }
            if (allEven) return true;
        }
        return false;
    }

    public static boolean hasEqualPosNegColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            int positiveCount = 0, negativeCount = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] > 0) positiveCount++;
                if (array[i][j] < 0) negativeCount++;
            }
            if (positiveCount == negativeCount) return true;
        }
        return false;
    }

    public static boolean hasEqualElementsColumn(int[][] array) {
        for (int j = 0; j < array[0].length; j++) {
            boolean hasEqual = false;
            for (int i = 0; i < array.length; i++) {
                for (int k = i + 1; k < array.length; k++) {
                    if (array[i][j] == array[k][j]) {
                        hasEqual = true;
                        break;
                    }
                }
                if (hasEqual) break;
            }
            if (hasEqual) return true;
        }
        return false;
    }

    public static boolean hasThreeMinElementsColumn(int[][] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                min = Math.min(min, array[i][j]);
            }
        }

        for (int j = 0; j < array[0].length; j++) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i][j] == min) count++;
            }
            if (count >= 3) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {0, 4, 5}, {0, 6, 7}};
        System.out.println(hasZeroColumn(array));
        System.out.println(hasColumnInRange(array, 5));
        System.out.println(hasEvenColumn(array));
        System.out.println(hasEqualPosNegColumn(array));
        System.out.println(hasEqualElementsColumn(array));
        System.out.println(hasThreeMinElementsColumn(array));
    }
}
