package org.example.Tasks5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void createAndPrintSteppedArray(int rows) {
        Random rand = new Random();
        List<List<Integer>> steppedArray = new ArrayList<>();

        for (int i = 1; i <= rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                row.add(rand.nextInt(101));  // случайное число от 0 до 100
            }
            steppedArray.add(row);
        }

        for (List<Integer> row : steppedArray) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        createAndPrintSteppedArray(5);
    }
}

