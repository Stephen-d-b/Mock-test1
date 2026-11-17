/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmenu;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjMenu {

    public static void main(String[] args) {
        
        Greeter greet = new Greeter();
        
        String strInput = JOptionPane.showInputDialog(null,
                "--- Simple Greetings Menu --- \n"
                        + "1. Enter Application \n"
                        + "2. Exit Application\n"
                        + "Please enter your Choice");
        
        String strResult = processUserInput(strInput, greet);
        
        JOptionPane.showMessageDialog(null, strResult);
    }
    
    public static String processUserInput(String strInput, Greeter greet)
    {
        if (greet.isValidInput(strInput))
        {
            int intChoice = Integer.parseInt(strInput);
            return greet.getGreeting(intChoice);
        }
        else
        {
            return "Invalid input. Please enter a Number!";
        }
    }
    
}
