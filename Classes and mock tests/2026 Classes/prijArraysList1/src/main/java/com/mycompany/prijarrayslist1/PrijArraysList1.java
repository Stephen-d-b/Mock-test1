/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prijarrayslist1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrijArraysList1 {
    
    private static int intAmount = 0;

    public static void main(String[] args) {
        Sales s = new Sales();
        
        try
        {
            String strAmount = JOptionPane.showInputDialog(null, "Please enter the amount of sales");
            
            if(strAmount == null)
            {
                JOptionPane.showMessageDialog(null, "GoodBye");
                System.exit(0);
            }
            
            intAmount = Integer.parseInt(strAmount);
            
            for (int index = 0; index < intAmount; index++)
            {
                double dblSales = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter in the sales made " + (index + 1)));
                
                s.addSales(dblSales);
            }
            
        }
        catch (NumberFormatException nex)
        {
            JOptionPane.showMessageDialog(null, "Please only enter in numbers!");
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The following error occured: " + ex.toString());
        }
        
        printSales(s);
    }
    
    
    private static void printSales(Sales s)
    {
        try
        {
            double dblTotal = s.calculateTotal();
            
            double dblAverage = s.calculateAverage();
            
            JOptionPane.showMessageDialog(null, "TOTAL: R" + dblTotal + "\n\n" + "AVERAGE SALES: R" + dblAverage);
        }
        
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The following error occured: " + ex.toString());
        }
    }
}
