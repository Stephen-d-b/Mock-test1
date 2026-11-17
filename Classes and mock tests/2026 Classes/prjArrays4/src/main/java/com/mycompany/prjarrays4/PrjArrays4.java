/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrays4;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjArrays4 {

    public static String[] arrProducts = new String[5];
    
    private static int[] arrQuantities = new int[5];
    
    public static void main(String[] args) {
        
        for (int index = 0; index < arrProducts.length; index++)
        {
            arrProducts[index] = JOptionPane.showInputDialog(null, "Please enter product " + (index + 1) + ":");
            
             arrQuantities[index] = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter the quantity for: " + arrProducts[index] + ":"));
        
             
        }
        display();
        displayTotalQuanitity();
        displaySearch();
    }

    public static void display() 
    {
        StringBuilder sb = new StringBuilder("Products and their Quantities: \n");
        
        for (int index = 0; index < arrProducts.length; index++)
        {
            sb.append(arrProducts[index]).append(" - ").append(arrQuantities[index]).append("\n");
        }
        
        JOptionPane.showMessageDialog(null, sb.toString());
        
    }

    public static void displayTotalQuanitity()
    {
        int intTotal = 0;
        
        for (int intQty : arrQuantities)
        {
            intTotal += intQty;
        }
        JOptionPane.showMessageDialog(null, "The total quantity for all products is: " + intTotal);
    }

    public static void displaySearch() 
    {
        String strSearch = JOptionPane.showInputDialog(null, "Please enter Product Name: ");
        
        boolean bFound = false; // flag Variable
        
        for (int index =0; index < arrProducts.length; index++)
        {
            //this will be in the POE final Part:
            if(arrProducts[index].equalsIgnoreCase(strSearch))
            {
                JOptionPane.showMessageDialog(null, "Produc Found! " + arrProducts[index] + "\nQuantity: " 
                        + arrQuantities[index]);
                
                bFound = true;
                break;
            }
        }
        
        if (!bFound)
        {
            JOptionPane.showInputDialog(null, "Product not Found");
        }
    }
}
