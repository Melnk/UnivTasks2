package org.example.Task3;

// Task5.java
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
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
