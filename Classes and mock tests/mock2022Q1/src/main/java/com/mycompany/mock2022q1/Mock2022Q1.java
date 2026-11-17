/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mock2022q1;

/**
 *
 * @author NLS - SMP
 */

/*
 * Question 1: Home Makeover Report
 * Uses a 1D array for months and a 2D array for job counts.
 * Prints report, monthly totals, and *** for totals >= 15.
 */

public class Mock2022Q1 {

    public static void main(String[] args) {
        // 1. SINGLE-DIMENSIONAL ARRAY - stores the months
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};

        // 2. TWO-DIMENSIONAL ARRAY - stores jobs per month per type
        // Rows = months, Columns = [0]Bathrooms, [1]Kitchens, [2]Garden
        int[][] jobs = {
            {8, 2, 5},   // January
            {7, 4, 5},   // February
            {5, 5, 2},   // March
            {2, 2, 3},   // April
            {7, 7, 9},   // May
            {7, 8, 5}    // June
        };

        // 3. PRINT THE REPORT
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("==================================================");
        System.out.printf("%-6s %-14s %-10s %-10s%n", "", "Bathrooms", "Kitchens", "Garden");

        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-6s %-14d %-10d %-10d%n",
                    months[i], jobs[i][0], jobs[i][1], jobs[i][2]);
        }

        // 4. MONTHLY TOTALS
        System.out.println("--------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < months.length; i++) {
            // Calculate total for this month (add all 3 columns)
            int total = jobs[i][0] + jobs[i][1] + jobs[i][2];

            // Print month and total
            System.out.printf("%-6s %-10d", months[i], total);

            // 5. DECISION: Print *** if total >= 15
            if (total >= 15) {
                System.out.print("***");
            }

            System.out.println();  // Move to next line
        }

        System.out.println("--------------------------------------------------");
    }
}
