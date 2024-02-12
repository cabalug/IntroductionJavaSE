package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        showMenu();
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static int enterValue(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return Integer.parseInt(sc.nextLine());
    }

    public static void showMenu() {
        int option = 0;
        int num1 = 0;
        int num2 = 0;
        do {
            System.out.println("Select the number of the desired option");
            System.out.println("1. Sum");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            option = Integer.parseInt(sc.nextLine());

            switch (option) {
                case 0:
                    System.out.println("Thanks for visiting us");
                    break;
                case 1:
                    num1 = enterValue("Enter the first value");
                    num2 = enterValue("Enter the second value");
                    System.out.println("The result is: " + addition(num1, num2));
            }
        } while (option != 0);
    }
}