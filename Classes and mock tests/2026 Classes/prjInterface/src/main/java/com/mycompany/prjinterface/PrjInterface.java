/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinterface;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjInterface {

    public static void main(String[] args) {

        // java interface  order
        // class processOrder
        
        // using JOptionPane get the price and the amount
        
        double dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price: "));

        int intAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the amount to order: "));
        
        ProcessOrder po = new ProcessOrder();
        
        po.setPrice(dblPrice);
        
        po.setAmount(intAmount);
        
        JOptionPane.showMessageDialog(null, "TOTAL DUE: " + po.getTotal());
    }
}
