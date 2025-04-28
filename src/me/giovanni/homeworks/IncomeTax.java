package me.giovanni.homeworks;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your income $: ");
        double income = scanner.nextDouble();
        double tax;
        if (income >= 0 && income <= 10000) {
            tax = 2.5;
        }else if (income > 10000 && income <= 25000) {
            tax = 4.3;
        }else if (income > 25000) {
            tax = 6.7;
        }else {
            System.out.println("Error!");
            return;
        }
        double taxSuma = (income * tax) / 100;

        System.out.printf("Your tax is gonna be %.2f $", taxSuma);
    }

}
