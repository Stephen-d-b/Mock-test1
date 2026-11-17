/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjmenu;

/**
 *
 * @author Stephen D
 */
public class Greeter {
    
    public String getGreeting(int intChoice)
    {
        if (intChoice == 1)
        {
            return "Hello Welcome to the Application";
        }
        else if (intChoice == 2)
        {
            return "Goodbye for now";
        }
        else
        {
            return "Oops! That is not a valid option!";
        }
    }
    
    public boolean isValidInput(String strInput)
    {
        return strInput != null && strInput.matches("\\d+");
        // if the input is not null AND it matches a diget return true
    }
    
}
