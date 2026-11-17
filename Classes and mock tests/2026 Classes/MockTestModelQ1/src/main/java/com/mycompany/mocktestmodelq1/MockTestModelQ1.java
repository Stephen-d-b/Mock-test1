/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mocktestmodelq1;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class MockTestModelQ1 {

    public static void main(String[] args) {
        // Create the Scanner object
        Scanner scan = new Scanner(System.in);

        // 1. Declare single-dimensional arrays for names
        String[] batsmen = {"Jacques Kallis", "Hashim Amla", "AB de Villiers"};
        String[] stadiums = {"KINGSMEAD", "ST GEORGES", "WANDERERS"};

        // 2. Declare a two-dimensional array for the runs scored
        int[][] runs = new int[3][3];

        System.out.println("SA CRICKETER APPLICATION");
        System.out.println("--------------------------------------------------");

        // 3. Populate the two-dimensional array using user input
        for (int i = 0; i < stadiums.length; i++) {
            for (int j = 0; j < batsmen.length; j++) {
                System.out.print("Enter the number runs scored by " + batsmen[j] + " at " + stadiums[i] + ": ");
                runs[i][j] = scan.nextInt(); 
            }
        }

        System.out.println("\nRUNS SCORED REPORT");
        System.out.println("--------------------------------------------------");

        // 4. Print the detailed report
        for (int j = 0; j < batsmen.length; j++) {
            for (int i = 0; i < stadiums.length; i++) {
                System.out.println(batsmen[j] + " runs scored at " + stadiums[i] + ": " + runs[i][j]);
            }
            System.out.println(); // Blank line between batsmen
        }

        System.out.println("--------------------------------------------------");
        System.out.println("TOTAL RUNS AT STADIUMS");
        System.out.println("--------------------------------------------------");

        // 5. Calculate and print total runs per stadium, and find the highest
        int maxStadiumRuns = 0;
        String bestStadium = "";

        for (int i = 0; i < stadiums.length; i++) {
            int stadiumTotal = 0;
            
            // Sum the row (stadium)
            for (int j = 0; j < batsmen.length; j++) {
                stadiumTotal = stadiumTotal + runs[i][j];
            }
            
            // Print formatted total
            System.out.printf("%-15s %d%n", stadiums[i], stadiumTotal);

            // Check if this stadium has the most runs so far
            if (stadiumTotal > maxStadiumRuns) {
                maxStadiumRuns = stadiumTotal;
                bestStadium = stadiums[i];
            }
        }

        System.out.println("--------------------------------------------------");
        // 6. Display the stadium with the most runs scored
        System.out.println("STADIUM WITH THE MOST RUNS: " + bestStadium);
        System.out.println("--------------------------------------------------");
        
    }
}
