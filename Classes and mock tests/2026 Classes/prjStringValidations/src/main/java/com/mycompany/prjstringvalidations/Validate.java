/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjstringvalidations;

/**
 *
 * @author Stephen D
 */
public class Validate {
    // regex
    
    // lowercase letter check
    
    public boolean hasLowerCase(String strCheck)
    {
        return strCheck.matches(".*[a-z].*");
        
        // . means any character
        // * means it can appear any amount of times
        // [a-z] means any lowercase letter
        
    }
    
    //non word character check
    
    public boolean hasNonWordChar(String strCheck)
    {
        return strCheck.matches(".\\W.*");
        
        
        // \W any symbole that is not a letter
        // Two \\ so that Java knows this is not aan escape character
        // capital W means non word character
        
    }
    
    // whitespace check
    
    public boolean hasWhiteSpace(String strCheck)
    {
        return strCheck.matches(".*\\s.*");
        
        // \s means any space, tab or line break
        
  
    }
    
    // only digits check
    
    public boolean isOnlyDigits(String strCheck)
    {
        return strCheck.matches("\\d+");
        
        // \d means any digit
        // + means it must apear atleast once, can appear more
        
    }
    
}
