/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package SalesTest;

import com.mycompany.exq2.ProductSales;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NLS - SMP
 */
public class ProductSalesTest {

    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        // 1. Create the object
        ProductSales ps = new ProductSales();
        
        // 2. Set the expected value
        // According to the table, the sales over 500 are 700 and 600. 
        // So we expect a count of 2.
        int expectedResult = 2;
        
        // 3. Call the method and get the actual result
        int actualResult = ps.GetSalesOverLimit();
        
        // 4. Check if they match
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        // 1. Create the object
        ProductSales ps = new ProductSales();
        
        // 2. Set the expected value
        // According to the table, the sales 500 or under are 300, 150, 250, 200.
        // So we expect a count of 4.
        int expectedResult = 4;
        
        // 3. Call the method and get the actual result
        int actualResult = ps.GetSalesUnderLimit();
        
        // 4. Check if they match
        assertEquals(expectedResult, actualResult);
    }
}
