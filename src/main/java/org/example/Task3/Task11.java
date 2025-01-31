package org.example.Task3;

// Task11.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[][] matrix = new double[n][9];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 9; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Среднее арифметическое каждого столбца
        for (int j = 0; j < 9; j++) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Среднее арифметическое столбца " + (j + 1) + ": " + sum / n);
        }
    }
}
