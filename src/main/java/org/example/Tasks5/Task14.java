package org.example.Tasks5;

public class Task14 {
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;  // возвращаем -1, если элемент не найден
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 7, 9, 2};
        int target = 7;
        int index = linearSearch(array, target);
        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
