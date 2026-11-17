/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import com.mycompany.prjmenu.Greeter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Stephen D
 */
public class TestGreeter {

    @Test
    public void testGreetingOption1() 
    {
        Greeter greet = new Greeter();

        String expected = "Hello Welcome to the Application";

        String actual = greet.getGreeting(1);
        
        assertEquals(expected, actual, "Expecting Welcome message for option 1");
    }
    
    @Test
    public void testGreetingOption2()
    {
        Greeter greet = new Greeter();
        
        String expected = "Goodbye for now";
        
        String actual = greet.getGreeting(2);
        
        assertEquals(expected, actual, "Expecting exiting message for option 2");
    }
    
    //True and False
    
    @Test
    public void testValidInput()
    {
        Greeter greet = new Greeter();
        
        boolean actual = greet.isValidInput("1");
        
        assertTrue(actual, "Expecting input to be valid digets");
    }
    
    @Test void testInvalidInput()
    {
        Greeter greet = new Greeter();
        
        boolean actual = greet.isValidInput("xyz");
        
        assertFalse (actual, "Expeting input to be invalid");
    }

}
