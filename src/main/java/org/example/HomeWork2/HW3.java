package org.example.HomeWork2;

// Файл: Task3.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HW3 {
    /**
     * Сравнивает две дроби m/n и n/m с числом PI и изменяет m или n в зависимости от результата.
     * @param m числитель первой дроби
     * @param n знаменатель первой дроби
     */
    public static void compareFractions(int m, int n) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        final double PI = 3.1415926535897; // Число Пи
        double fraction1 = (double) m / n;
        double fraction2 = (double) n / m;

        // Выбираем, какое значение изменить в зависимости от того, какая дробь ближе к Пи
        if (Math.abs(fraction1 - PI) < Math.abs(fraction2 - PI)) {
            m *= 10; // Умножаем m на 10
        } else {
            n *= 2; // Умножаем n на 2
        }

        System.out.println("Обновленные значения: m = " + m + ", n = " + n);
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите m и n:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        compareFractions(m, n);
        scanner.close();
    }
}