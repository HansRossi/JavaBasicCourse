//package me.giovanni.homeworks;
//
//import java.util.Scanner;
//
//public class MethodHW {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        // First method
//        System.out.println("Please enter a number that u would like to find the square: ");
//        int numberToSquare = scanner.nextInt();
//        System.out.println(findSquare(numberToSquare));
//        // Second method
//        System.out.println("Please enter a radius: ");
//        double radius = scanner.nextDouble();
//        System.out.println("Please enter a height: ");
//        double height = scanner.nextDouble();
//        System.out.println(findVolume(radius, height));
//        // Third method
//        int[] userArray = createAndPrintArray(scanner);
//        int sum = findArraySum(userArray);
//        System.out.println("Sum of array elements: " + sum);
//        // Create user array
//        System.out.println("How many number would u like to add to array?: ");
//        int arrayLength = scanner.nextInt();
//        System.out.println(createAndPrintArryaAndFindArraySum(arrayLength));
//        // Fourth method
//        System.out.println("Please enter a string: ");
//        scanner.nextLine();
//        String string = scanner.nextLine();
//
//        // Fifth method
//        System.out.println("Please enter a base number: ");
//        int baseNumber = scanner.nextInt();
//        System.out.println("Please enter a exponent number: ");
//        int exponentNumber = scanner.nextInt();
//        System.out.println(calculatePow(baseNumber, exponentNumber));
//        // Sixth method
//
//
//    }
//
//    // 1
//    public static int findSquare(int numberToSquare) {
//        return numberToSquare * numberToSquare;
//    }
//    // 2
//    public static double findVolume(double radius, double height) {
//        // V = Sp * v; Sp = Pi * r * r;
//        return Math.PI * radius * radius * height;
//    }
//    // 3
//    public static int[] createAndPrintArray(Scanner scanner) {
//        System.out.print("Enter array length: ");
//        int length = scanner.nextInt();
//        int[] array = new int[length];
//
//        for (int i = 0; i < length; i++) {
//            System.out.printf("Enter element %d: ", i + 1);
//            array[i] = scanner.nextInt();
//        }
//
//        System.out.print("Array: [");
//        for (int element : array) {
//            System.out.print(element + "\t");
//        }
//        System.out.println("]");
//
//        return array;
//    }
//    public static int findArraySum(int[] array) {
//        int sum = 0;
//        for (int value : array) {
//            sum += value;
//        }
//        return sum;
//    }
//    // 4
//    public static String reverseString(String string) {
//        for (int i = 0; i < string.length(); i++) {
//            System.out.println(string.charAt(string.length() - 1 - i));
//        }
//        return string;
//    }
//    // 5
//    public static int calculatePow(int base, int exponent) {
//        int result = 1;
//        if (exponent == 0) {
//            return 1;
//        }
//        if (exponent < 0) {
//            System.out.println("Our program doesn't support exponents lower than zero.");
//            return -1;
//        }
//        if (base < 0) {
//            System.out.println("Our program doesn't support bases lower than zero.");
//            return -1;
//        }
//        if (base == 0) {
//            return 0;
//        }
//        for (int i = 0; i < exponent; i++) {
//            result *= base;
//        }
//        return result;
//    }
//    // 6
//    public static void printText(int times, String text) {
//        for (int i = 0; i < times; i++) {
//            System.out.println(text);
//        }
//    }
//
//}
