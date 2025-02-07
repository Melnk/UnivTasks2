package org.example.HomeWork4.Task5;

import java.util.*;

public class ArrayUtils {

    // Метод для вычисления суммы элементов массива
    public static double getSum(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum;
    }

    // Метод для вычисления среднего арифметического
    public static double average(double[] array) {
        if (array.length == 0) return 0;
        return getSum(array) / array.length;
    }

    // Метод для нахождения максимального значения
    public static double max_value(double[] array) {
        if (array.length == 0) throw new IllegalArgumentException("Массив пуст");
        double max = array[0];
        for (double num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Метод для нахождения минимального значения
    public static double min_value(double[] array) {
        if (array.length == 0) throw new IllegalArgumentException("Массив пуст");
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Метод для нахождения моды (наиболее часто встречающегося элемента)
    public static Double mode(double[] array) {
        if (array.length == 0) return null;
        Map<Double, Integer> frequencyMap = new HashMap<>();

        for (double num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        double mode = array[0];
        int maxCount = 0;

        for (Map.Entry<Double, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }

    // Метод для сортировки массива по возрастанию
    public static double[] sort_ascending(double[] array) {
        double[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return sortedArray;
    }

    // Тестирование методов
    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5, 3, 3, 2, 1, 5};

        System.out.println("Сумма: " + getSum(numbers));
        System.out.println("Среднее: " + average(numbers));
        System.out.println("Максимум: " + max_value(numbers));
        System.out.println("Минимум: " + min_value(numbers));
        System.out.println("Мода: " + mode(numbers));
        System.out.println("Отсортированный массив: " + Arrays.toString(sort_ascending(numbers)));
    }
}