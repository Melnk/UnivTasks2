package org.example.Task3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

// Task10.java
public class Task10 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        int[] arr = {5, 3, 8, 1, 7}; // Примерный массив

        // а) Поменять второй и пятый элементы
        int temp = arr[1];
        arr[1] = arr[4];
        arr[4] = temp;

        System.out.println("Массив после изменений: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
