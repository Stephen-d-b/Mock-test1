/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinterface;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjInterface {

    public static void main(String[] args) {
        int intAmount = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter amount:"));
        double dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter price:"));
        
        ProcessOrder newOrder = new ProcessOrder();
        
        newOrder.setAmount(intAmount);
        newOrder.setPrice(dblPrice);
        
        JOptionPane.showMessageDialog(null, "The total amount: R" + newOrder.getTotal());
    }
}
