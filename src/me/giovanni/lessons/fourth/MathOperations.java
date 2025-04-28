package me.giovanni.lessons.fourth;

public class MathOperations {
    public static void main(String[] args) {
        double a = 123.31321312;
        long result = Math.round(a);
        System.out.println(result);

        a = 3312321.321321;
        System.out.printf("Rounded value = %.1f\n",a);
        String name = "Hans";
        System.out.printf("My name is %s",name);

    }
}
