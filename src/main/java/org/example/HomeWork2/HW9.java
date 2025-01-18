package org.example.HomeWork2;

import java.util.Scanner;

public class HW9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double a = scanner.nextDouble();
        //В
        if (a <= 0) System.out.println(0);
        else if (a <= 1) System.out.println(a);
        else System.out.println(a*a*a*a);
        //G
        if (a <= 0) System.out.println(0);
        else if (a < 1) System.out.println(a*a - a);
        else System.out.println(a*a - Math.sin(Math.PI * a * a));
    }
}
