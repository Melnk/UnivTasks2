package org.example.Task3;

// Task7.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5}; // Примерный массив
        int sum = 0, product = 1, sumSquares = 0, sumFirstSix = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            product *= arr[i];
            sumSquares += arr[i] * arr[i];
            if (i < 6) sumFirstSix += arr[i];
        }

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Произведение элементов: " + product);
        System.out.println("Сумма квадратов элементов: " + sumSquares);
        System.out.println("Сумма первых шести элементов: " + sumFirstSix);
    }
}
