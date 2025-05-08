package me.giovanni.homeworks;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        taskByForLoop();
        taskByWhileLoop();
        taskByDoWhileLoop();
    }
    private static void taskByForLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter bound: ");
        int bound = scanner.nextInt();

        int summary = 0;
        for (int i = 1, num = 1; i <= bound; i++, num++) {
            summary += i;
            System.out.printf("%d) Num is %d, sum is %d\n", num, i, summary);
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d", summary);
    }

    private static void taskByWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter bound: ");
        int bound = scanner.nextInt();

        int summary = 0;
        int i = 1;
        int num = 1;
        while(i <= bound) {
            summary += i;
            System.out.printf("%d) Num is %d, sum is %d\n", num, i, summary);
            num++;
            i++;
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d\n", summary);


    }

    private static void taskByDoWhileLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter bound: ");
        int bound = scanner.nextInt();

        int summary = 0;
        int i = 1;
        int num = 1;

        do {
            summary += i;
            System.out.printf("%d) Num is %d, sum is %d\n", num, i, summary);
            num++;
            i++;

        } while(i <= bound);
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d", summary);
    }
}
