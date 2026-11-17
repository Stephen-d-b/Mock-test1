/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjstringvalidations;

/**
 *
 * @author Stephen D
 */
public class PrjStringValidations {

    public static void main(String[] args) {
        
        Validate v = new Validate();
        
        String strCheck = "HELLOworld";
        if (v.hasLowerCase(strCheck) == true)
        {
            System.out.println("The String contains lowerCase letters");
        } else 
        {
            System.out.println("No lowerCase letters found");
        }
        
        String strCheck1 = "Hello@123";
        if (v.hasNonWordChar(strCheck1))
        {
            System.out.println("The string contains non-word characters");
        } 
        else
        {
            System.out.println("All characters are word characters");
        }
        
        String strCheck2 = "Testing Space";
        if (v.hasWhiteSpace(strCheck2))
        {
            System.out.println("The string contains White Space");
        } 
        else
        {
            System.out.println("No White space");
        }
        
        String strCheck3 = "Test1";
        if (v.isOnlyDigits(strCheck3))
        {
            System.out.println("Contains only digits");
        } 
        else
        {
            System.out.println("Does not contain only digits");
        }
    }
}
