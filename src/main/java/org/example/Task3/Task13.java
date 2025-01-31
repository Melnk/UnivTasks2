package org.example.Task3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

// Task13.java
public class Task13 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        double[][] matrix = {
                {3, -1, 5},
                {8, 2, 4},
                {-6, 7, -3}
        };

        double max = matrix[0][0], min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) max = matrix[i][j];
                if (matrix[i][j] < min) min = matrix[i][j];
            }
        }

        double avg = (max + min) / 2;
        System.out.println("Среднее арифметическое наибольшего и наименьшего элемента: " + avg);
    }
}

