package org.example.Task2;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prev = scanner.nextInt();
        int curr = scanner.nextInt();
        boolean found = false;
        while (scanner.hasNextInt()) {
            int next = scanner.nextInt();
            if (curr > prev && curr > next && curr % 2 == 0) {
                found = true;
                break;
            }
            prev = curr;
            curr = next;
        }
        System.out.println(found);
    }
}
