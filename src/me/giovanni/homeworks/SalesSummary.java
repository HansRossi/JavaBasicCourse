package me.giovanni.homeworks;

import java.util.Scanner;

public class SalesSummary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the product name: ");
        String product = scanner.nextLine();
        System.out.println("Please, enter the product quantity: ");
        int quantity = scanner.nextInt();
        System.out.println("Please, enter the product price: ");
        double price = scanner.nextDouble();
        System.out.println("Please, enter the numbers of days u sold the product: ");
        int salesDays = scanner.nextInt();

        double salesSummary = quantity * price * salesDays;
        double salesPerDay = salesSummary / salesDays;

        System.out.printf("Product No 1: %s\n", product);
        System.out.printf("total sales for %d days is EUR %.2f\n", salesDays, salesSummary);
        System.out.printf("sales by day is EUR %.2f\n", salesPerDay);

        System.out.println("Please, enter the second product name: ");
        scanner.nextLine();
        product = scanner.nextLine();
        System.out.println("Please, enter the product quantity: ");
        quantity = scanner.nextInt();
        System.out.println("Please, enter the product price: ");
        price = scanner.nextDouble();
        System.out.println("Please, enter the numbers of days u sold the product: ");
        salesDays = scanner.nextInt();

        salesSummary = quantity * price * salesDays;
        salesPerDay = salesSummary / salesDays;

        System.out.printf("Product No 2: %s\n", product);
        System.out.printf("total sales for %d days is EUR %.2f\n", salesDays, salesSummary);
        System.out.printf("sales by day is EUR %.2f\n", salesPerDay);




    }
}
