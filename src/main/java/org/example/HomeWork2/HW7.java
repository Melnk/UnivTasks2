package org.example.HomeWork2;

// File: Task7.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HW7 {
    /**
     * Метод подсчитывает количество цифр в числе.
     * @param n натуральное число
     * @return количество цифр
     */
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    /**
     * Метод вычисляет сумму цифр числа.
     * @param n натуральное число
     * @return сумма цифр
     */
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Метод находит первую цифру числа.
     * @param n натуральное число
     * @return первая цифра
     */
    public static int firstDigit(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    /**
     * Метод находит предпоследнюю цифру числа.
     * @param n натуральное число (n >= 10)
     * @return предпоследняя цифра
     */
    public static int secondLastDigit(int n) {
        return (n / 10) % 10;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число n (n <= 100):");
        int n = scanner.nextInt();
        System.out.println("Количество цифр: " + countDigits(n));
        System.out.println("Сумма цифр: " + sumDigits(n));
        System.out.println("Первая цифра: " + firstDigit(n));
        if (n >= 10) {
            System.out.println("Предпоследняя цифра: " + secondLastDigit(n));
        }
        scanner.close();
    }
}
