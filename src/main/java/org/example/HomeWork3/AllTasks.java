package org.example.HomeWork3;

// Файл: AllTasks.java
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class AllTasks {

    // Метод для реверса подмассива
    public static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Метод для реверса элементов между 2-м и 10-м элементами
    public static void reverseBetweenSecondAndTenth(int[] arr) {
        reverseSubArray(arr, 2, 9);
    }

    // Метод для реверса элементов между k и s
    public static void reverseBetweenKAndS(int[] arr, int k, int s) {
        reverseSubArray(arr, k + 1, s - 1);
    }

    // Метод для реверса элементов между максимумом и минимумом
    public static void reverseBetweenMaxAndMin(int[] arr) {
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) maxIndex = i;
            if (arr[i] < arr[minIndex]) minIndex = i;
        }
        reverseSubArray(arr, Math.min(maxIndex, minIndex), Math.max(maxIndex, minIndex));
    }

    // Метод для обмена первого отрицательного и последнего положительного элементов
    public static void swapFirstNegativeAndLastPositive(int[] arr) {
        int firstNegative = -1, lastPositive = -1;
        for (int i = 0; i < arr.length; i++) {
            if (firstNegative == -1 && arr[i] < 0) firstNegative = i;
            if (arr[i] > 0) lastPositive = i;
        }
        if (firstNegative != -1 && lastPositive != -1) {
            int temp = arr[firstNegative];
            arr[firstNegative] = arr[lastPositive];
            arr[lastPositive] = temp;
        }
    }

    // Метод для получения чисел, встречающихся в массиве ровно один раз
    public static List<Integer> uniqueNumbers(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) result.add(entry.getKey());
        }
        return result;
    }

    // Метод для получения одного числа из каждой группы повторяющихся чисел
    public static List<Integer> oneFromEachGroup(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (!seen.contains(num)) {
                result.add(num);
                seen.add(num);
            }
        }
        return result;
    }

    // Метод для подсчета количества уникальных чисел
    public static int countDistinctNumbers(int[] arr) {
        return (int) Arrays.stream(arr).distinct().count();
    }

    // Метод для подсчета количества чисел, встречающихся более одного раза
    public static long countDuplicates(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        return countMap.values().stream().filter(count -> count > 1).count();
    }

    // Метод для проверки наличия дубликатов в массиве
    public static boolean hasDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }

    // Метод для вычисления суммы наибольших элементов в каждой строке матрицы
    public static double sumOfLargestElements(double[][] matrix) {
        double sum = 0;
        for (double[] row : matrix) {
            sum += Arrays.stream(row).max().orElse(0);
        }
        return sum;
    }

    // Метод для получения массива цифр числа n в обратном порядке
    public static int[] digitsInReverseOrder(int n) {
        int[] result = new int[6]; // Массив фиксированного размера 6 для n <= 999999
        int index = 0;
        while (n > 0) {
            result[index++] = n % 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.setOut(new PrintStream(System.out, true, "UTF-8")); // Устанавливаем вывод в UTF-8

        // Пример использования методов
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        reverseBetweenSecondAndTenth(arr);
        System.out.println("Реверс между 2-м и 10-м: " + Arrays.toString(arr));

        reverseBetweenKAndS(arr, 3, 8);
        System.out.println("Реверс между k и s: " + Arrays.toString(arr));

        reverseBetweenMaxAndMin(arr);
        System.out.println("Реверс между max и min: " + Arrays.toString(arr));

        swapFirstNegativeAndLastPositive(arr);
        System.out.println("Обмен первого отрицательного и последнего положительного: " + Arrays.toString(arr));

        int[] digits = digitsInReverseOrder(12345);
        System.out.println("Цифры в обратном порядке: " + Arrays.toString(digits));
    }
}
