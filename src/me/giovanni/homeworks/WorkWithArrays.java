package me.giovanni.homeworks;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkWithArrays {
    public static void main(String[] args) {

        // Create array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter desired length of array: ");
        int arrayLength = scanner.nextInt();
        if (arrayLength <= 0) {
            System.out.println("Invalid array length!");
            return;
        }
        int[] array = new int[arrayLength];
        //выф
        // Add numbers to array
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }
        System.out.printf("Elements of array:\n");
        for (int element : array) {
            System.out.println(element);
        }

        // Sum of negative numbers
        int negativeNumbersSum = 0;
        for (int element : array) {
            if (element < 0) {
                negativeNumbersSum += element;
            }
        }
        System.out.printf("Sum of negative numbers %d\n", negativeNumbersSum);

        // Sum of even numbers
        int evenNumbers = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.printf("Sum of even numbers %d\n", evenNumbers);

        // Sum of odd numbers
        int oddNumbers = array.length - evenNumbers;
        System.out.printf("Sum of odd numbers %d\n", oddNumbers);

        // The smallest number
        int smallestNumberIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestNumberIndex]) {
                // index of the smallest number
                smallestNumberIndex = i;
            }
        }
        System.out.printf("The smallest number: %d with index %d\n", array[smallestNumberIndex], smallestNumberIndex);

        // The biggest number
        int biggestNumberIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[biggestNumberIndex]) {
                // index of the smallest number
                biggestNumberIndex = i;
            }
        }
        System.out.printf("The highest number: %d with index %d\n", array[biggestNumberIndex], biggestNumberIndex);

        // Average after first negative number in the array
        int indexOfFirstNegativeNumber = -1; // Подсказал ChatGPT
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                indexOfFirstNegativeNumber = i;
                break;
            }
        }
        if (indexOfFirstNegativeNumber == -1) {
            System.out.println("There are no negative numbers in the array :/");
            return;
        } else {
            int arraySum = 0;
            for (int i = indexOfFirstNegativeNumber + 1; i < array.length; i++) {
                arraySum += array[i];
            }
            // Find Average
            double average = (double) arraySum / (array.length - indexOfFirstNegativeNumber - 1);
            System.out.printf("The average number after first negative number is: %.2f\n", average);
        }
    }
}



