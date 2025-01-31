package org.example.Tasks5;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void createTriangleSteppedArray(int rows) {
        int[][] array = new int[rows][];
        for (int i = 0; i < rows; i++) {
            array[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                array[i][j] = i * j;
            }
        }

        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void main(String[] args) {
        createTriangleSteppedArray(5);
    }
}

