package me.giovanni.homeworks;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter bound: ");
        int bound = scanner.nextInt();
        if (bound <= 0) {
            System.out.println("You must enter positive number!");
            return;
        }


        taskByForLoop(bound);
        taskByWhileLoop(bound);
        taskByDoWhileLoop(bound);
    }
    private static void taskByForLoop(int bound) {
        int summary = 0;
        int i = 1;
        for (; i <= bound; i++) {
            summary += i;
            System.out.printf("%d) Num is %d, sum is %d\n",i, i, summary);
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d\n", summary);
    }

    private static void taskByWhileLoop(int bound) {
        int summary = 0;
        int i = 1;
        while(i <= bound) {
            summary += i;
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, summary);
            i++;
        }
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d\n", summary);


    }

    private static void taskByDoWhileLoop(int bound) {
        int summary = 0;
        int i = 1;
        do {
            summary += i;
            System.out.printf("%d) Num is %d, sum is %d\n", i, i, summary);
            i++;

        } while(i <= bound);
        System.out.println("------------------------");
        System.out.printf("Sum of numbers is %d", summary);
    }
}
