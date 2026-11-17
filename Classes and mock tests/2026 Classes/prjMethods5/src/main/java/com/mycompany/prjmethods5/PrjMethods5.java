/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods5;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjMethods5 {

    public static final int intTicketPrice = 250;
        public static void main (String[] args){
            
            int intQuantity= 0;
            int intTotalCost = 0;
            
            intQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Please enter the number of tickets: "));
            
            intTotalCost = calculateTotal(intQuantity);
            
            JOptionPane.showMessageDialog(null, "Total cost is for "+ intQuantity + " Tickets is: R" + intTotalCost);
            
            
            
    }
        
        private static int calculateTotal(int intQuantity)
        {
            int intTotal = intQuantity * intTicketPrice;
            
            return intTotal;
        }
}
