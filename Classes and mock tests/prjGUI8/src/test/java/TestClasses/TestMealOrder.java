/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package TestClasses;

import com.mycompany.prjgui8.MealOrder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author tswan
 */
public class TestMealOrder {
    
   @Test
   public void testCalculateMealPrice(){
       
       MealOrder mo = new MealOrder(5, 50, "Pizza");
       double expected = 287.5;
       double actual = mo.calculateTotal(5, 50);
       assertEquals(expected, actual, "Expect total price including vat to be 287.5");
       
   }
   
   @Test
   public void testValidateDataValid(){
       
       MealOrder mo = new MealOrder(2, 75, "Burger");
       boolean actual = mo.validateData("Burger", 2, 75);
       assertTrue(actual, "Expect validation of valid data");
       
   }
   
   @Test
   public void testValidateDataEmptyMealName(){
       
       MealOrder mo = new MealOrder(2, 75, "");
       boolean actual = mo.validateData("", 2, 75);
       assertFalse(actual,"Expect validation to fail for empty meal name");
       
   }
    
   @Test
   public void testValidateDataNegativePrice(){
       
       MealOrder mo = new MealOrder(2, -75, "Burger");
       boolean actual = mo.validateData("Burger", 2, -75);
       assertFalse(actual,"Expect validation to fail for negative price");
       
   } 
   
   @Test
   public void testValidateDataZeroMealCount(){
       
       MealOrder mo = new MealOrder(0, 75, "Burger");
       boolean actual = mo.validateData("Burger", 0, 75);
       assertFalse(actual,"Expect validation to fail for 0 count");
       
   } 
}
