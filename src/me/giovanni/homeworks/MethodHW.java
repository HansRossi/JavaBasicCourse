package me.giovanni.homeworks;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MethodHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // First method
        System.out.println(findSquare(scanner));
        // Second method
        System.out.printf("Volume is %.2f\n", findVolume(scanner));
        // Third method
        System.out.println(findArraySum(scanner));
        // Fourth method
        reverseString(scanner);
        // Fifth method
        System.out.println(calculatePow(scanner));
        // Sixth method
        printText(3, "Love u"); // Я сделал аогументами а не через сканер потому что и так 5 методов
        // на сканерах так хоть 1 будет
    }

    public static int findSquare(Scanner scanner) {
        System.out.println("Please enter a number that u would like to find the square: ");
        int number = scanner.nextInt();
        return number * number;
    }

    public static double findVolume(Scanner scanner) {
        System.out.println("Please enter a radius: ");
        double radius = scanner.nextDouble();
        System.out.println("Please enter a height: ");
        double height = scanner.nextDouble();
        // V = Sp * v; Sp = Pi * r * r;
        return Math.PI * radius * radius * height;
    }

    public static int findArraySum(Scanner scanner) {
        // Create user array
        System.out.println("How many number would u like to add to array?: ");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i <  array.length; i++) {
            System.out.printf("Please enter %d number ", i + 1);
            array[i] = scanner.nextInt();
        }
        // Print array in console
        System.out.print("Array: [");
        for (int element : array) {
            System.out.print(element + "\t");
        }
        System.out.print("]\n");
        // Count sum of elements in array
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum: ");
        return sum;
    }

    public static void reverseString(Scanner scanner) {
        System.out.println("Please enter a string: ");
        scanner.nextLine();
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(string.length() - 1 - i));
        }
    }

    public static int calculatePow(Scanner scanner) {
        System.out.println("Please enter a base number: ");
        int baseNumber = scanner.nextInt();
        System.out.println("Please enter a exponent number: ");
        int exponentNumber = scanner.nextInt();

        int result = 1;
        for (int i = 0; i < exponentNumber; i++) {
            result *= baseNumber;
        }
        return result;
    }

    public static void printText(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

}
