/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exq1;

/**
 *
 * @author NLS - SMP
 */


// Q.1.4 - The logic class that implements the interface.
// This is where all the math happens, keeping the Main class clean.
public class EstateAgent implements IEstateAgent {

    // Q.1.2 - Calculates the total property sales for one agent.
    @Override
    public double EstateAgentSales(double[] propertySales) {
        double total = 0; // Accumulator to hold the running sum
        
        // Loop through the array (Jan, Feb, Mar) and add each month to the total
        for (double sale : propertySales) {
            total += sale; 
        }
        return total; // Return the final sum
    }

    // Q.1.3 - Calculates the 2% commission earned by an agent.
    @Override
    public double EstateAgentCommission(double propertySales) {
        // The exam paper specifies a 2% commission.
        // 2% as a decimal is 0.02.
        return propertySales * 0.02; 
    }

    // Q.1.4 - Finds the top-performing agent based on total sales.
    @Override
    public int TopEstateAgent(double[] totalSales) {
        int topIndex = 0;                   // Assume the first agent (index 0) is the best
        double maxSales = totalSales[0];    // Store their sales as the current max

        // Start loop from the second agent (index 1) to compare
        for (int i = 1; i < totalSales.length; i++) {
            // If the current agent's sales are strictly greater than the max...
            if (totalSales[i] > maxSales) {
                maxSales = totalSales[i];   // Update the max sales
                topIndex = i;               // Update the index to this new top agent
            }
        }
        return topIndex; // Return the index of the winning agent
    }
}
