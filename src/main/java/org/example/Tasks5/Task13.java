package org.example.Tasks5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task13 {
    public static int[] findMaxElementIndex(List<List<Integer>> steppedArray) {
        int max = Integer.MIN_VALUE;
        int rowIndex = -1, colIndex = -1;

        for (int i = 0; i < steppedArray.size(); i++) {
            for (int j = 0; j < steppedArray.get(i).size(); j++) {
                if (steppedArray.get(i).get(j) > max) {
                    max = steppedArray.get(i).get(j);
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        return new int[]{rowIndex, colIndex};
    }

    public static void main(String[] args) {
        List<List<Integer>> steppedArray = new ArrayList<>();
        steppedArray.add(Arrays.asList(1, 2, 3));
        steppedArray.add(Arrays.asList(4, 5));
        steppedArray.add(Arrays.asList(6, 7, 8));

        int[] result = findMaxElementIndex(steppedArray);
        System.out.println("Max element is at row " + result[0] + ", column " + result[1]);
    }
}
