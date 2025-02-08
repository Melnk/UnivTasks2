package org.example.HomeWork2;

// Файл: Task2.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class HW2 {
    // Метод проверяет, есть ли в массиве ровно два локальных максимума, которые являются четными
    public static boolean hasTwoEvenLocalMaxima(int[] nums) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8")); // Устанавливаем вывод в UTF-8
        int count = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            // Проверяем, является ли nums[i] локальным максимумом и четным числом
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1] && nums[i] % 2 == 0) {
                count++;
            }
        }
        return count == 2; // Возвращаем true, если таких элементов ровно два
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива и его элементы:");
        int size = scanner.nextInt(); // Читаем размер массива
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt(); // Заполняем массив числами
        }
        System.out.println("Имеет два четных локальных максимума: " + hasTwoEvenLocalMaxima(nums)); // Выводим результат
        scanner.close(); // Закрываем сканер
    }
}
