package org.example.Tasks1;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prev = scanner.nextInt();
        while (true) {
            int curr = scanner.nextInt();
            if (curr < prev) break;
            prev = curr;
        }
    }
}
