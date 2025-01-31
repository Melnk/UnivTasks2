package org.example.Tasks1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble(), y = scanner.nextDouble(), z = scanner.nextDouble();
        if (x + y > z && x + z > y && y + z > x) {
            System.out.println("Triangle exists");
            double max = Math.max(x, Math.max(y, z));
            double sumSquares = x*x + y*y + z*z - max*max;
            System.out.println(sumSquares > max*max ? "Acute triangle" : "Not acute triangle");
        } else {
            System.out.println("Triangle does not exist");
        }
    }
}
