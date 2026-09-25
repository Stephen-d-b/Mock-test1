/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjinheretince;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author conno
 */
public class PrjInheretince {

    public static ArrayList<MenuItem> order = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    private static int[][] tables = {
        {0, 0, 0},
        {0, 0, 0}
    };

    public static void main(String[] args) {
        int choice = 0;
        while (choice != 7) {
            displayMenu();
            System.out.println("Please enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    addFood();
                    break;
                case 2:
                    addDrink();
                    break;
                case 3:
                    viewOrder();
                    break;
                case 4:
                    viewTables();
                    break;
                case 5:
                    allocateSeat();
                    break;
                case 6:
                    deallocateSeat();
                    break;
                case 7:
                    System.out.println("Thank you for visiting");
                    break;
                default:
                    System.out.println("Out of range");
                    break;
            }
        }

    }

    private static void displayMenu() {
        System.out.println("\n----------------------------------\n"
                + "      RESTAURANT ORDERING SYSTEM\n"
                + "\n----------------------------------\n"
                + "1. Add food\n"
                + "2. Add Drink\n"
                + "3. View order\n"
                + "4. View Tables\n"
                + "5. Allocate Seat\n"
                + "6. Deallocate seat\n"
                + "7. Exit\n"
                + "----------------------------------");
    }

    private static void addFood() {
        System.out.println("\n----- ADD FOOD -----");
        System.out.println("Please emter food name: ");
        String name = scan.nextLine();

        System.out.println("Please enter price: R");
        double price = scan.nextDouble();

        System.out.println("Is vegetarian? (true/false): ");
        boolean vegetarian = scan.nextBoolean();

        scan.nextLine();

        Food food = new Food(name, price, vegetarian);

        order.add(food);

        System.out.println("Food added successfully");
    }

    private static void addDrink() {
        System.out.println("\n----- ADD DRINK -----");
        System.out.println("Please enter drink name: ");
        String name = scan.nextLine();

        System.out.println("Please enter price: R");
        double price = scan.nextDouble();

        scan.nextLine();

        System.out.println("Please enter size");
        String size = scan.nextLine();

        Drink drink = new Drink(name, price, size);

        order.add(drink);

        System.out.println("Drink added successfully");
    }

    private static void viewOrder() {
        System.out.println("\n----- VIEW ORDER -----");

        if (order.isEmpty()) {
            System.out.println("No items in the order.");
        } else {
            for (MenuItem item : order) {
                System.out.println("");
                System.out.println(item.displayItem());
                System.out.println("---------------------------");
            }
        }
    }

    private static void viewTables() {
        System.out.println("\n----- RESTURAUNT TABLES -----");

        for (int row = 0; row < tables.length; row++) {
            System.out.println("Table " + (row + 1) + ": ");
            for (int column = 0; column < tables[row].length; column++) {
                System.out.println("[" + tables[row][column] + "] ");
            }
            System.out.println("\n0 = Available");
            System.out.println("1 = Occupied");
        }
    }

    private static void allocateSeat() {
        System.out.println("\n----- ALLOCATE SEAT -----");
        viewTables();

        System.out.println("Please enter table number: ");
        int table = scan.nextInt();

        System.out.println("please enter seat number: ");
        int seat = scan.nextInt();

        scan.nextLine();

        if (tables[table - 1][seat - 1] == 0) {

            tables[table - 1][seat - 1] = 1;

            System.out.println("the seat has been allocated successfully");
        } else {
            System.out.println("This seat is already occupied");
        }
    }

    private static void deallocateSeat() {
        System.out.println("\n----- DEALLOCATE SEAT -----");

        viewTables();

        System.out.println("Please enter table number: ");
        int table = scan.nextInt();

        System.out.println("please enter seat number: ");
        int seat = scan.nextInt();

        if (tables[table - 1][seat - 1] == 1) {

            tables[table - 1][seat - 1] = 0;

            System.out.println("the seat has been deallocated successfully");
        } else {
            System.out.println("This seat is already available");
        }
    }
}
