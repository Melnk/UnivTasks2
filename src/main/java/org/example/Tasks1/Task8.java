package org.example.Tasks1;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble(), b = scanner.nextDouble(), c = scanner.nextDouble(), d = scanner.nextDouble();
        if (a <= b && b <= c && c <= d) {
            double max = Math.max(Math.max(a, b), Math.max(c, d));
            a = b = c = d = max;
        } else if (!(a > b && b > c && c > d)) {
            a *= a;
            b *= b;
            c *= c;
            d *= d;
        }
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}
