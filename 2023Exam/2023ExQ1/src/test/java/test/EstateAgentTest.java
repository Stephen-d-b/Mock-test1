/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;

import com.mycompany.exq1.EstateAgent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NLS - SMP
 */
// Q.1.5 - Unit Test class for the EstateAgent logic.
public class EstateAgentTest {
    
    // Create an instance of the class we are testing
    EstateAgent ea = new EstateAgent();

    // Q.1.5 - Test 1: Prove Total Sales calculates correctly.
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        // Supply Joe Bloggs' sales: 800k + 1.5m + 2m
        double[] sales = {800000.0, 1500000.0, 2000000.0};
        
        // Expected total is 4,300,000. The 0.01 is a 'delta' to handle tiny decimal differences.
        assertEquals(4300000.0, ea.EstateAgentSales(sales), 0.01);
    }

    // Q.1.5 - Test 2: Prove Commission calculates correctly.
    @Test
    public void CalculateTotalCommission_ReturnsCommission() {
        // 2% of 4,300,000 is 86,000
        assertEquals(86000.0, ea.EstateAgentCommission(4300000.0), 0.01);
    }

    // Q.1.5 - Test 3: Prove Top Agent logic finds the right index.
    @Test
    public void TopAgent_ReturnsTopPosition() {
        // Joe has 4.3m, Jane has 3.5m. Joe should be the top agent.
        double[] totals = {4300000.0, 3500000.0};
        
        // We expect index 0 (Joe Bloggs) to be returned.
        assertEquals(0, ea.TopEstateAgent(totals)); 
    }
}