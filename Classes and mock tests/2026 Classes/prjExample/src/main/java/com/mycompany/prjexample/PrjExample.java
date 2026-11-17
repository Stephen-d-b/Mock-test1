/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjexample;

/**
 *
 * @author Stephen D
 */
import javax.swing.JOptionPane;

public class PrjExample {

    // 1. Global VAT variable
    static double VAT = 0.15;

    public static void main(String[] args) {

        // 2. Declare variables
        String product;
        double price;
        int quantity;
        double totalDiscount;

        // Get input
        product = JOptionPane.showInputDialog("Enter product name:");
        price = Double.parseDouble(JOptionPane.showInputDialog("Enter price:"));
        quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter quantity:"));

        // 3. Call method
        totalDiscount = amountDue(price, quantity);

        // Calculate total for display
        double total = price * quantity;

        // 6. Output report
        JOptionPane.showMessageDialog(null,
                "Product Report\n" +
                "Product: " + product + "\n" +
                "Price: " + price + "\n" +
                "Quantity: " + quantity + "\n" +
                "Total: " + total + "\n" +
                "VAT Amount: " + totalDiscount);
    }

    // 4. Method to calculate VAT amount
    public static double amountDue(double price, int quantity) {

        double total = price * quantity;
        double totalDiscount = total * VAT;

        // 5. Return VAT amount
        return totalDiscount;
    }
}