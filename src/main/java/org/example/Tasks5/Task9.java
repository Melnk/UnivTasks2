package org.example.Tasks5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task9 {
    public static int[] getMultiplesOfThree(int[][] array) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 3 == 0) {
                    resultList.add(array[i][j]);
                }
            }
        }
        return resultList.stream().mapToInt(i -> i).toArray();
    }

    public static void splitPositiveNegative(int[][] array) {
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    positives.add(array[i][j]);
                } else {
                    negatives.add(array[i][j]);
                }
            }
        }

        System.out.println("Positives: " + positives);
        System.out.println("Negatives: " + negatives);
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(Arrays.toString(getMultiplesOfThree(array)));
        splitPositiveNegative(array);
    }
}
