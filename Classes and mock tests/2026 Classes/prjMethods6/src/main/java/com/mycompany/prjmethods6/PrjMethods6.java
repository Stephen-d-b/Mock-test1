/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods6;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjMethods6 {

    public static final double dblVat = 0.15;
    public static void main(String[] args) {
        
        String strProduct;
        int intQuantity;
        double dblPrice;
        double dblDiscount;
        
        
        
        strProduct = JOptionPane.showInputDialog(null, "Enter product name:");
        dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter product Price: "));
        intQuantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the Ammount of items: "));
        
        dblDiscount = amountDue(dblPrice, intQuantity );
        
        double dblTotal = dblPrice * intQuantity;
        
            JOptionPane.showMessageDialog(null,"Product name: " + strProduct + 
                                            "\nPrice of item: R" + dblPrice + 
                                            "\nQuantity: " + intQuantity + 
                                            "\nTotal: R" + dblTotal +  
                                            "\nVAT Amount: R" + dblDiscount +
                                            "\nFinal price with Vat included: R" + (dblTotal + dblDiscount));
            
    }      
        public static double amountDue(double dblPrice, int intQuantity) {

        double dblTotal = dblPrice * intQuantity;
        double dblDiscount = dblTotal * dblVat;

        // 5. Return VAT amount3
        return dblDiscount;
    }
}
