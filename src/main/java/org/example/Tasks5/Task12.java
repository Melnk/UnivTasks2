package org.example.Tasks5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task12 {
    public static int sumOfSteppedArray(List<List<Integer>> steppedArray) {
        int sum = 0;
        for (List<Integer> row : steppedArray) {
            for (Integer num : row) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<List<Integer>> steppedArray = new ArrayList<>();
        steppedArray.add(Arrays.asList(1, 2, 3));
        steppedArray.add(Arrays.asList(4, 5));
        steppedArray.add(Arrays.asList(6, 7, 8));

        System.out.println("Sum of elements: " + sumOfSteppedArray(steppedArray));
    }
}
