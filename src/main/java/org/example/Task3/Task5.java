package org.example.Task3;

// Task5.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int idx = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == 0) break;
            if (num > k) {
                idx = 1;
                System.out.println("Номер первого числа больше K: " + idx);
                break;
            }
            idx++;
        }
        if (idx == 0) System.out.println("Нет чисел, больших K");
    }
}
