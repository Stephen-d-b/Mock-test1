package com.mycompany.exq1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author NLS - SMP
 */


// Q.1.4 - The interface required by the exam paper.
// It defines the "contract" that the EstateAgent class must fulfill.
public interface IEstateAgent {
    
    // Q.1.4 - Calculates the total sales for a single agent.
    // Receives an array of the 3 monthly sales figures and returns the sum.
    double EstateAgentSales(double[] propertySales);

    // Q.1.4 - Calculates the commission based on a total sales amount.
    // Receives the total sales and returns the calculated 2% commission.
    double EstateAgentCommission(double propertySales);

    // Q.1.4 - Determines which agent sold the most.
    // Receives an array of total sales and returns the index (position) of the highest one.
    int TopEstateAgent(double[] totalSales);
}
