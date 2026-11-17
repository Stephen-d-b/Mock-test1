/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mock2024q1;

import java.util.Scanner;

/**
 *
 * @author NLS - SMP
 */
public class Mock2024Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Declare and populate single-dimensional array (Cities)
        String[] cities = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        
        // 2. Declare and populate two-dimensional array (Accidents)
        // Rows: 3 cities. Columns: 0 = Car, 1 = Motorbike
        int[][] accidents = new int[3][2];

        // 3. Capture input using loops
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the number of car accidents for " + cities[i] + ": ");
            accidents[i][0] = input.nextInt();
            
            System.out.print("Enter the number of motorbike accidents for " + cities[i] + ": ");
            accidents[i][1] = input.nextInt();
        }

        // 4. Display the Report Table
        System.out.println("\n--------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s%n", "", "CAR", "MOTOR BIKE");
        
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s %-10d %-10d%n", cities[i], accidents[i][0], accidents[i][1]);
        }

        // 5. Calculate and display totals for each city
        System.out.println("--------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int maxAccidents = 0;
        String cityWithMostAccidents = "";
        int[] cityTotals = new int[3]; // Single-dimensional array to store totals

        for (int i = 0; i < cities.length; i++) {
            // Calculate total for this city
            int total = accidents[i][0] + accidents[i][1];
            cityTotals[i] = total;
            
            System.out.printf("%-15s %d%n", cities[i], total);

            // 6. Logic to determine the city with the highest number of accidents
            if (total > maxAccidents) {
                maxAccidents = total;
                cityWithMostAccidents = cities[i];
            }
        }

        System.out.println("--------------------------------------------------");
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + cityWithMostAccidents);
        System.out.println("--------------------------------------------------");
        
        input.close();
    }
}
