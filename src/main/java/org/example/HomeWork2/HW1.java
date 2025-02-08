package org.example.HomeWork2;

// Файл: Task1.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HW1 {
    // Метод для перевода числа n из системы счисления с основанием k в десятичную систему
    public static int convertToDecimal(int k, int n) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8")); // Устанавливаем вывод в UTF-8
        int decimal = 0, power = 0;
        while (n > 0) {
            int digit = n % 10; // Получаем последнюю цифру числа
            if (digit >= k) {
                throw new IllegalArgumentException("Некорректная цифра для данной системы счисления");
            }
            decimal += digit * Math.pow(k, power); // Конвертируем и прибавляем к результату
            n /= 10; // Убираем последнюю цифру
            power++; // Увеличиваем степень основания
        }
        return decimal;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите основание (k) и число (n):");
        int k = scanner.nextInt(); // Читаем основание системы счисления
        int n = scanner.nextInt(); // Читаем число в этой системе
        System.out.println("Десятичное значение: " + convertToDecimal(k, n)); // Выводим результат
        scanner.close(); // Закрываем сканер
    }
}
