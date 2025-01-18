package org.example.HomeWork3;

// Task 1: Reverse sections of an array
import java.util.*;

public class AllTasks {

    // Reverse subsection of an array
    public static void reverseSubArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Task 1a: Reverse elements between the 2nd and 10th elements
    public static void reverseBetweenSecondAndTenth(int[] arr) {
        reverseSubArray(arr, 2, 9);
    }

    // Task 1b: Reverse elements between k and s
    public static void reverseBetweenKAndS(int[] arr, int k, int s) {
        reverseSubArray(arr, k + 1, s - 1);
    }

    // Task 1c: Reverse elements between max and min
    public static void reverseBetweenMaxAndMin(int[] arr) {
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) maxIndex = i;
            if (arr[i] < arr[minIndex]) minIndex = i;
        }
        reverseSubArray(arr, Math.min(maxIndex, minIndex), Math.max(maxIndex, minIndex));
    }

    // Task 2: Swap first negative and last positive
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

    // Task 3a: Numbers appearing exactly once
    public static List<Integer> uniqueNumbers(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) result.add(entry.getKey());
        }
        return result;
    }

    // Task 3b: One number from each group
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

    // Task 3c: Count distinct numbers
    public static int countDistinctNumbers(int[] arr) {
        return (int) Arrays.stream(arr).distinct().count();
    }

    // Task 3d: Count numbers appearing more than once
    public static long countDuplicates(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        return countMap.values().stream().filter(count -> count > 1).count();
    }

    // Task 3e: Check if any duplicates exist
    public static boolean hasDuplicates(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false;
    }

    // Task 4: Sum of largest elements in each row of a matrix
    public static double sumOfLargestElements(double[][] matrix) {
        double sum = 0;
        for (double[] row : matrix) {
            sum += Arrays.stream(row).max().orElse(0);
        }
        return sum;
    }

    // Task 5: Fill array with digits of n in reverse order
    public static int[] digitsInReverseOrder(int n) {
        int[] result = new int[6]; // Array size is 6 to accommodate n <= 999999
        int index = 0;
        while (n > 0) {
            result[index++] = n % 10;
            n /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example usage for Task 1 and Task 5
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        reverseBetweenSecondAndTenth(arr);
        System.out.println("Reversed between 2nd and 10th: " + Arrays.toString(arr));

        reverseBetweenKAndS(arr, 3, 8);
        System.out.println("Reversed between k and s: " + Arrays.toString(arr));

        reverseBetweenMaxAndMin(arr);
        System.out.println("Reversed between max and min: " + Arrays.toString(arr));

        swapFirstNegativeAndLastPositive(arr);
        System.out.println("Swapped first negative and last positive: " + Arrays.toString(arr));

        int[] digits = digitsInReverseOrder(12345);
        System.out.println("Digits in reverse order: " + Arrays.toString(digits));
    }
}
