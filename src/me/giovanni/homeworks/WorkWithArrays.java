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

        // Add numbers to array
        for (int i = 0; i < arrayLength; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(-100, 100);
        }

        // Sum of negative numbers
        int negativeNumbersSum = 0;
        for (int element : array) {
            if (element < 0) {
                negativeNumbersSum += element;

            }
        }

        // Sum of even numbers
        int evenNumbers = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                evenNumbers++;
            }
        }

        // Sum of odd numbers
        int oddNumbers = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                oddNumbers++;
            }
        }

        // The smallest number
        int min = array[0];
        int smallestNumberIndex = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < min) {
                min = array[i];
                // index of the smallest number
                smallestNumberIndex = i;
            }

        }

        // The biggest number
        int max = array[0];
        int biggestNumberIndex = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] > max) {
                max = array[i];
                // index of the smallest number
                biggestNumberIndex = i;
            }

        }

        // Average after first negative number in the array
        int indexOfFirstNegativeNumber = -1; // Подсказал ChatGPT
        for (int i = 0; i < arrayLength; i++) {
            if (array[i] < 0) {
                indexOfFirstNegativeNumber = i;
                break;
            }
        }
        if (indexOfFirstNegativeNumber == -1) {
            System.out.println("There are no negative numbers in the array :/");
        }

        int arraySum = 0;
        for (int i = indexOfFirstNegativeNumber + 1; i < arrayLength; i++) {
            arraySum += array[i];
        }
        // Find Average
        double average = (double) arraySum / arrayLength;

        // Printing all...
        String fullArray = (Arrays.toString(array)); // С этим мне помог ChatGPT, потому что я не знал как вывести массив :/
        System.out.printf("Elements of arrays: %s\n", fullArray);
        System.out.printf("Sum of negativa numbers %d\n", negativeNumbersSum);
        System.out.printf("Sum of even numbers %d\n", evenNumbers);
        System.out.printf("Sum of odd numbers %d\n", oddNumbers);
        System.out.printf("The smallest number: %d with index %d\n", min, smallestNumberIndex);
        System.out.printf("The highest number: %d with index %d\n", max, biggestNumberIndex);
        System.out.printf("The average number after first negative number is: %.2f", average);
    }

}



