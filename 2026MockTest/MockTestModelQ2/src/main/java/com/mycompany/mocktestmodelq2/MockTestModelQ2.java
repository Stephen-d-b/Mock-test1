/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mocktestmodelq2;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class MockTestModelQ2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Ask the user for input
        System.out.print("The cricketer name: ");
        String name = scan.nextLine();

        System.out.print("Enter the stadium: ");
        String stadium = scan.nextLine();

        System.out.print("Enter the total runs scored by " + name + " at " + stadium + ": ");
        int runs = scan.nextInt();

        // 2. Instantiate the CricketRunsScored object
        CricketRunsScored playerReport = new CricketRunsScored(name, stadium, runs);

        // 3. Call the method to print the final report
        System.out.println(); // Print a blank line for spacing
        playerReport.printReport();
    }
}
