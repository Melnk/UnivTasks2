package org.example.HomeWork2;

// Файл: Task4.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HW4 {
    /**
     * Проверяет, есть ли в массиве ровно два числа, длина которых 3 или 5 цифр,
     * и все цифры которых либо четные, либо нечетные.
     * @param nums массив чисел
     * @return true, если таких чисел ровно два, иначе false
     */
    public static boolean hasTwoSpecificNumbers(int[] nums) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8"));
        int count = 0;
        for (int num : nums) {
            int length = String.valueOf(Math.abs(num)).length();
            if ((length == 3 || length == 5) && allDigitsEvenOrOdd(num)) {
                count++;
            }
        }
        return count == 2;
    }

    /**
     * Проверяет, все ли цифры числа либо четные, либо нечетные.
     * @param num число для проверки
     * @return true, если все цифры имеют одинаковую четность, иначе false
     */
    private static boolean allDigitsEvenOrOdd(int num) {
        num = Math.abs(num);
        boolean even = num % 10 % 2 == 0;
        while (num > 0) {
            if ((num % 10 % 2 == 0) != even) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива и его элементы:");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Есть два специфических числа: " + hasTwoSpecificNumbers(nums));
        scanner.close();
    }
}
