package me.giovanni.lessons.shop;

import java.math.BigDecimal;

    public class OnlineStore {
        public static void main(String[] args) {

            // Customer name
            String name = "Alice";
            // Product
            String product = "smartphone";
            // Product price
            BigDecimal productPrice = new BigDecimal("305.99");
            // Address
            String address = "Moon Street, 10.";
            // Printing first order
            System.out.println("Order No 1 Client: " + name + ".");
            System.out.println("Product: " + product + ",");
            System.out.println("price EUR " + productPrice + "." );
            System.out.println("Address: " + address);

            // Just making margin
            System.out.println("---------------------------");

            // New customer name
            name = "Tom";
            // New product
            product = "laptop";
            // New product price
            productPrice = new BigDecimal("570.95");
            // New address
            address = "Terra Street, 17.";

            // Printing second order
            System.out.println("Order No 2 Client: " + name + ".");
            System.out.println("Product: " + product + ",");
            System.out.println("price EUR " + productPrice + "." );
            System.out.println("Address: " + address);
        }
    }
