package me.giovanni.homeworks;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraySort {
    public static void main(String[] args) {
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(1,101);
        }
        System.out.println("Array: [");
        for (int element : array) {
            System.out.println(element);
        }
        System.out.println("]");

        // Insertion sort
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }

        System.out.println("Sorted Array: [");
        for (int element : array) {
            System.out.println(element);
        }
        System.out.println("]");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number that u would like to find in array: ");
        int userNumber = scanner.nextInt();

        // Binary search
        int left = 0; // Start of array
        int right = array.length - 1; // End of array
        boolean foundIndex = false;

        while (left <= right) { // ---> <---
            int mid = left + (right - left) / 2; // Mid index
            if (array[mid] == userNumber) {
                System.out.printf("Target index: %d\n", mid);
                foundIndex = true;
                break;
            } else if (array[mid] < userNumber) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!foundIndex) {
            System.out.printf("There is no %d in the array", userNumber);
        }

    }
}
