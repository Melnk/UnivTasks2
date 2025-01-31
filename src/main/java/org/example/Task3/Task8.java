package org.example.Task3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

// Task8.java
public class Task8 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        int[] arr = {5, 3, 8, 1, 7}; // Примерный массив
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int maxIdx = -1, minIdx = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
        }

        System.out.println("Максимальный элемент: " + max + " на индексе: " + maxIdx);
        System.out.println("Минимальный элемент: " + min + " на индексе: " + minIdx);
    }
}
