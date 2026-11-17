/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjIfExample {

    public static void main(String[] args) {
        
        String strIdNumber = "";
        int intNumSold = 0;
        final int intHigh = 25;
        
        strIdNumber = JOptionPane.showInputDialog(null, "Please enter your salesperson ID number: ");
        
        intNumSold = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of policies sold in the last month: "));
        
        if (intNumSold > intHigh) 
        {
            JOptionPane.showInputDialog(null, "Congrats! You are a High Performer");
        }
        
        JOptionPane.showMessageDialog(null, "GoodBye, Thank you for using the program");
    }
}
