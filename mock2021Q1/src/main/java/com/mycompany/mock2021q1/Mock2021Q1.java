/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mock2021q1;

/**
 *
 * @author Stephen D
 */
public class Mock2021Q1 {

    public static void main(String[] args) {
        // 1. Declare and populate the 2D array with the values from the table
        int[][] deliveries = {
            {128, 135, 139},   // DELIVERIES 2018
            {155, 129, 175},   // DELIVERIES 2019
            {129, 130, 185}    // DELIVERIES 2020
        };

        // 2. Parallel 1D arrays for the labels
        String[] years  = {"DELIVERIES 2018", "DELIVERIES 2019", "DELIVERIES 2020"};
        String[] months = {"JAN", "FEB", "MAR"};

        // 3. Print the report
        printReport(deliveries, years, months);

        // 4. Print the statistics
        printStatistics(deliveries);
    }

    // Method to print the deliveries table
    public static void printReport(int[][] deliveries,
                                   String[] years,
                                   String[] months) {
        System.out.println("..................................................");
        System.out.println("DELIVERIES REPORT");
        System.out.println("..................................................");

        // Header row
        System.out.printf("%-15s", "");
        for (String m : months) {
            System.out.printf("%5s", m);
        }
        System.out.println();

        // Data rows
        for (int i = 0; i < deliveries.length; i++) {
            System.out.printf("%-15s", years[i]);
            for (int j = 0; j < deliveries[i].length; j++) {
                System.out.printf("%5d", deliveries[i][j]);
            }
            System.out.println();
        }
    }

    // Method to print total, maximum and minimum
    public static void printStatistics(int[][] deliveries) {
        int total = 0;
        int max = deliveries[0][0];
        int min = deliveries[0][0];

        for (int i = 0; i < deliveries.length; i++) {
            for (int j = 0; j < deliveries[i].length; j++) {
                int value = deliveries[i][j];
                total += value;
                if (value > max) max = value;
                if (value < min) min = value;
            }
        }

        System.out.println("..................................................");
        System.out.println("DELIVERY STATISTICS");
        System.out.println("..................................................");
        System.out.println("Total Deliveries: " + total);
        System.out.println("Maximum Deliveries: " + max);
        System.out.println("Minimum Deliveries: " + min);
    }
}
