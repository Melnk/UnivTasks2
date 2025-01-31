package org.example.Task3;

// Task9.java
public class Task9 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1, 7}; // Примерный массив
        if (arr[1] < arr[0]) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }

        System.out.println("Число в последнем элементе: " + arr[arr.length - 1]);
    }
}
