/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package test;


import com.mycompany.exq2.Data;
import com.mycompany.exq2.EstateAgent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NLS - SMP
 */


// Q.2.8 - Unit Tests for Question 2
public class EstateAgentQ2Test {
    
    // Create an instance of the logic class to test it
    EstateAgent logic = new EstateAgent();

    // Q.2.8 - Test 1: Prove the calculation is correct
    @Test
    public void CalculateCommission_CalculatedSuccessfully() {
        // 10% of 800,000 should be 80,000
        // We use a delta of 0.01 because it's a double (allows for tiny decimal differences)
        assertEquals(80000.0, logic.CalculateCommission("800000", "10"), 0.01);
    }

    // Q.2.8 - Test 2: Prove the calculation catches errors (Unsuccessful)
    @Test
    public void CalculateCommission_CalculatedUnSuccessfully() {
        // We intentionally supply the WRONG expected answer (90,000 instead of 80,000)
        // assertNotEquals proves that the actual calculation does NOT equal the wrong answer.
        assertNotEquals(90000.0, logic.CalculateCommission("800000", "10"), 0.01);
    }

    // Q.2.8 - Test 3: Prove the validation works
    @Test
    public void ValidationTest() {
        // Create a Data object with an empty name (which is invalid)
        Data invalidData = new Data("Cape Town", "", 800000, 10);
        
        // We expect the ValidateData method to return FALSE because the name is empty
        assertFalse(logic.ValidateData(invalidData));
        
        // Let's also test a valid case to be sure it returns TRUE
        Data validData = new Data("Cape Town", "Joe Bloggs", 800000, 10);
        assertTrue(logic.ValidateData(validData));
    }
}
