/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjIfExample1 {

    public static void main(String[] args) {
        
        String strIdNumber = "";
        int intNumSold = 0;
        final int intHigh = 25;
        
        strIdNumber = JOptionPane.showInputDialog(null, "Please enter your salesperson ID number: ");
        
        intNumSold = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of policies sold in the last month: "));
        
        Employee emp = new Employee(strIdNumber, intNumSold);
        
        if (emp.isHighPerformer(intHigh) == true)
        {
            JOptionPane.showMessageDialog(null, "Congrats Your are a High performance athlete KIKI RAH");
        }
    }
}