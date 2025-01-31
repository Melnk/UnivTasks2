package org.example.Task3;

// Task12.java
public class Task12 {
    public static void main(String[] args) {
        double[][] matrix = {
                {2, 4, 6},
                {-3, 9, -6},
                {5, -8, 10}
        };

        double maxElem = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (Math.abs(matrix[i][j]) > Math.abs(maxElem)) {
                    maxElem = matrix[i][j];
                }
            }
        }

        // Деление всех элементов на максимальный элемент
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] /= maxElem;
            }
        }

        System.out.println("Новая матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
