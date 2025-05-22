package me.giovanni.homeworks;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class WorkWithMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter columns: ");
        int cols = scanner.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(1, 51);
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        int evenRowSum = 0;
        int oddRowSum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i % 2 == 0) {
                    evenRowSum += matrix[i][j];
                } else {
                    oddRowSum += matrix[i][j];
                }
            }
        }

        int evenColProduct = 1;
        int oddColProduct = 1;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (j % 2 == 0) {
                    evenColProduct *= matrix[i][j];
                } else {
                    oddColProduct *= matrix[i][j];
                }
            }
        }
        System.out.println("Even rows sum: " + evenRowSum);
        System.out.println("Odd rows sum: " + oddRowSum);
        System.out.println("Even columns product: " + evenColProduct);
        System.out.println("Odd columns product: " + oddColProduct);
        boolean isMagic = true;
        if (rows != cols) {
            isMagic = false;
        } else {
            int sum = 0;
            for (int i = 0; i < cols; i++) {
                sum += matrix[0][i];
            }
            for (int i = 1; i < rows; i++) {
                int rowSum = 0;
                for (int j = 0; j < cols; j++) {
                    rowSum += matrix[i][j];
                }
                if (rowSum != sum) {
                    isMagic = false;
                    break;
                }
            }
            if (isMagic) {
                for (int j = 0; j < cols; j++) {
                    int colSum = 0;
                    for (int i = 0; i < rows; i++) {
                        colSum += matrix[i][j];
                    }
                    if (colSum != sum) {
                        isMagic = false;
                        break;
                    }
                }
            }

            if (isMagic) {
                int d1 = 0;
                int d2 = 0;
                for (int i = 0; i < rows; i++) {
                    d1 += matrix[i][i];
                    d2 += matrix[i][cols - 1 - i];
                }
                if (d1 != sum || d2 != sum) {
                    isMagic = false;
                }
            }
        }

        if (isMagic) {
            System.out.println("This is a magic square.");
        } else {
            System.out.println("This is not a magic square.");
        }
    }
}