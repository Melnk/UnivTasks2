package org.example.Task3;

// Task14.java
public class Task14 {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 5, 0},
                {7, 0, 3},
                {0, 0, 2}
        };

        boolean foundNonZero = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    System.out.println("Ненулевой элемент найден на позиции: " + i + ", " + j);
                    foundNonZero = true;
                }
            }
        }
        if (!foundNonZero) {
            System.out.println("Ненулевых элементов нет");
        }
    }
}

