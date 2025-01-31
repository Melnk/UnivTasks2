package org.example.Tasks1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        if (a >= 0) a *= a;
        if (b >= 0) b *= b;
        if (c >= 0) c *= c;
        System.out.println(a + " " + b + " " + c);
    }
}
