package org.example.Tasks1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), y = scanner.nextDouble(), z = scanner.nextDouble();
        if (x + y + z < 1) {
            double min = Math.min(x, Math.min(y, z));
            if (min == x) x = (y + z) / 2;
            else if (min == y) y = (x + z) / 2;
            else z = (x + y) / 2;
        } else {
            if (x < y) x = (y + z) / 2;
            else y = (x + z) / 2;
        }
        System.out.println(x + " " + y + " " + z);
    }
}
