package org.example.HomeWork6;

// Task 1: Square Matrix Row Analysis

import java.util.*;

public class AllTasks {

    // Task 1a: Find rows with all zeros
    public static List<Integer> rowsWithAllZeros(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean allZeros = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0) {
                    allZeros = false;
                    break;
                }
            }
            if (allZeros) rows.add(i);
        }
        return rows;
    }

    // Task 1b: Find rows with identical elements
    public static List<Integer> rowsWithIdenticalElements(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean identical = true;
            int firstElement = matrix[i][0];
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != firstElement) {
                    identical = false;
                    break;
                }
            }
            if (identical) rows.add(i);
        }
        return rows;
    }

    // Task 1c: Find rows with all odd elements
    public static List<Integer> rowsWithAllOddElements(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean allOdd = true;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    allOdd = false;
                    break;
                }
            }
            if (allOdd) rows.add(i);
        }
        return rows;
    }

    // Task 1d: Find rows forming monotonic sequences
    public static List<Integer> rowsWithMonotonicSequence(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean increasing = true, decreasing = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < matrix[i][j - 1]) increasing = false;
                if (matrix[i][j] > matrix[i][j - 1]) decreasing = false;
            }
            if (increasing || decreasing) rows.add(i);
        }
        return rows;
    }

    // Task 1e: Find rows forming palindromes
    public static List<Integer> rowsWithPalindromes(int[][] matrix) {
        List<Integer> rows = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            boolean palindrome = true;
            for (int j = 0, k = matrix[i].length - 1; j < k; j++, k--) {
                if (matrix[i][j] != matrix[i][k]) {
                    palindrome = false;
                    break;
                }
            }
            if (palindrome) rows.add(i);
        }
        return rows;
    }

    // Task 2: Sum elements based on position relative to diagonal
    public static double[] sumElementsByDiagonal(double[][] matrix) {
        double below = 0, above = 0, onDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i > j) below += matrix[i][j];
                else if (i < j) above += matrix[i][j];
                else onDiagonal += matrix[i][j];
            }
        }
        return new double[]{below, above, onDiagonal};
    }

    // Task 3: Count 'o' in the first word of a sentence
    public static int countOInFirstWord(String sentence) {
        sentence = sentence.trim();
        int count = 0;
        for (char c : sentence.split(" ")[0].toCharArray()) {
            if (c == 'o' || c == 'O') count++;
        }
        return count;
    }

    // Task 4: Count identical starting symbols
    public static int countStartingIdenticalSymbols(String sequence) {
        char first = sequence.charAt(0);
        int count = 1;
        for (int i = 1; i < sequence.length(); i++) {
            if (sequence.charAt(i) == first) count++;
            else break;
        }
        return count;
    }

    // Task 5: Find max digit index in a string with spaces
    public static int findMaxDigitIndex(String text) {
        text = text.trim();
        int maxDigit = -1, maxIndex = -1;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                int digit = c - '0';
                if (digit > maxDigit) {
                    maxDigit = digit;
                    maxIndex = i;
                }
            }
        }
        return maxIndex + 1; // Return 1-based index
    }

    // Task 6: Check if a word is a palindrome
    public static boolean isPalindrome(String word) {
        word = word.trim();
        int n = word.length();
        for (int i = 0; i < n / 2; i++) {
            if (word.charAt(i) != word.charAt(n - i - 1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example usage for Task 1
        int[][] matrix = {
                {0, 0, 0},
                {1, 1, 1},
                {3, 5, 7},
                {8, 7, 6},
                {2, 3, 2}
        };

        System.out.println("Rows with all zeros: " + rowsWithAllZeros(matrix));
        System.out.println("Rows with identical elements: " + rowsWithIdenticalElements(matrix));
        System.out.println("Rows with all odd elements: " + rowsWithAllOddElements(matrix));
        System.out.println("Rows with monotonic sequence: " + rowsWithMonotonicSequence(matrix));
        System.out.println("Rows with palindromes: " + rowsWithPalindromes(matrix));

        // Example usage for Task 3
        System.out.println("Count of 'o' in first word: " + countOInFirstWord(" Hello ooo world!"));

        // Example usage for Task 6
        System.out.println("Is 'radar' a palindrome? " + isPalindrome("radar"));
    }
}
