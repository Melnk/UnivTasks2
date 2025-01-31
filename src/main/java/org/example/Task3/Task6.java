package org.example.Task3;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

// Task6.java
public class Task6 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        // а) Арифметическая прогрессия
        int a = 3, p = 2;
        int[] arithProgression = new int[10];
        for (int i = 0; i < 10; i++) {
            arithProgression[i] = a + i * p;
            System.out.print(arithProgression[i] + " ");
        }
        System.out.println();

        // б) Последовательность Фибоначчи
        int[] fibonacci = new int[20];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < 20; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            System.out.print(fibonacci[i] + " ");
        }
    }
}
