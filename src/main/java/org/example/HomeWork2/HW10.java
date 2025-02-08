package org.example.HomeWork2;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HW10 {

    public static String getAgeNaming(int n) {
        if (n < 1 || n > 100) {
            throw new IllegalArgumentException("Возраст должен быть от 1 до 100 лет.");
        }

        if (n % 10 == 1 && n % 100 != 11) {
            return n + " год";
        } else if (n % 10 >= 2 && n % 10 <= 4 && (n % 100 < 10 || n % 100 >= 20)) {
            return n + " года";
        } else {
            return n + " лет";
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст (n <= 100):");
        int n = scanner.nextInt();

        try {
            System.out.println(getAgeNaming(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}

