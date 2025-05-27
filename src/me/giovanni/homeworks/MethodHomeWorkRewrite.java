package me.giovanni.homeworks;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MethodHomeWorkRewrite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First Method
        System.out.println("Please enter a number that u would like to square: ");
        int numberToSquare = scanner.nextInt();
        System.out.println(findSquare(numberToSquare));

        // Second Method
        System.out.println("Please enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Please enter height: ");
        double height = scanner.nextDouble();
        System.out.println(findVolume(radius, height));

        // Third Method
        System.out.println("Please enter length of array: ");
        int arrayLength = scanner.nextInt();
        int[] array = createAndPrintArray(arrayLength);
        // Find sum
        System.out.println("Sum of elements is: ");
        System.out.println(findArraySum(array));

        // Fourth Method
        scanner.nextLine();
        System.out.println("Please enter a string: ");
        String stringText = scanner.nextLine();
        String reversedString = reverseString(stringText);

        // Fifth Method
        System.out.println("\nPlease enter base: ");
        int base = scanner.nextInt();
        System.out.println("Please enter an exponent: ");
        int exponent = scanner.nextInt();
        System.out.println(calculatePow(base, exponent));

        // Sixth Method
        System.out.println("Please enter how many times would u like to type a text: ");
        int times = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Please enter a text that u would like to write %d times: ", times);
        String text = scanner.nextLine();
        printText(times, text);

    }
    // First Method
    public static int findSquare(int numberToSquare) {
        return numberToSquare * numberToSquare;
    }
    // Second Method
    public static double findVolume(double radius, double height) {
        // V = Spv; Sp = Pi r2
        return Math.PI * radius * radius * height;
    }
    // Third Method
    public static int[] createAndPrintArray(int arrayLength) {
        // Create array with random numbers
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(100);
        }
        // Print array
        System.out.println("Array: [");
        for (int element : array) {
            System.out.println(element);
        }
        System.out.println("]");
        return array;
    }
    public static int findArraySum(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }
    // Fourth Method
    public static String reverseString(String stringText) {
        for (int i = 0; i < stringText.length(); i++) {
            System.out.print(stringText.charAt(stringText.length() - 1 - i));
        }
        return stringText;
    }
    // Fifth Method
    public static int calculatePow(int base, int exponent) {
        int result = 1;
        if (exponent == 0) {
            return result;
        }
        if (exponent < 0) {
            System.out.println("Our program doesnt supports exponents lower than 0");
            return -1;
        }
        if (base < 0) {
            System.out.println("Our program doesnt supports bases lower than 0");
        }
        if (base == 0) {
            return 0;
        }
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
    // Sixth Method
    public static void printText(int times, String text) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}
