/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exq1;

/**
 *
 * @author NLS - SMP
 */
public class Question1 {

    public static void main(String[] args) {
        String[] agents = {"Joe Bloggs", "Jane Doe"};
        double[][] salesData = {
            {800000.0, 1500000.0, 2000000.0},
            {700000.0, 1200000.0, 1600000.0}
        };

        EstateAgent ea = new EstateAgent();
        double[] totalSalesPerAgent = new double[agents.length];

        // 1. Print Header
        System.out.println("ESTATE AGENTS SALES REPORT");
        System.out.println(); // Blank line

        // 2. Print Column Headers with a dashed line
        System.out.printf("%-25s %3s %14s %14s\n", "", "JAN", "FEB", "MAR");
        System.out.println("----------------------------------------------------------------------");

        // 3. Print Monthly Sales Rows
        for (int i = 0; i < agents.length; i++) {
            // FIXED LINE: %,.1f (Comma, then Dot, then 1)
            // I removed the "12" to make it simpler. It just means "comma, 1 decimal"
            System.out.printf("%-25s R %,.1f   R %,.1f   R %,.1f\n",
                    agents[i],
                    salesData[i][0],
                    salesData[i][1],
                    salesData[i][2]);

            totalSalesPerAgent[i] = ea.EstateAgentSales(salesData[i]);
        }

        System.out.println(); // Blank line

        // 4. Print Total Sales
        for (int i = 0; i < agents.length; i++) {
            System.out.printf("Total property sales for %s = R %,.0f\n", agents[i], totalSalesPerAgent[i]);
        }

        System.out.println(); // Blank line

        // 5. Print Commissions
        for (int i = 0; i < agents.length; i++) {
            double commission = ea.EstateAgentCommission(totalSalesPerAgent[i]);
            System.out.printf("Sales Commission for %s = R %,.0f\n", agents[i], commission);
        }

        System.out.println(); // Blank line

        // 6. Print Top Agent
        int topAgentIndex = ea.TopEstateAgent(totalSalesPerAgent);
        System.out.println("Top performing estate agent: " + agents[topAgentIndex]);
    }
}
