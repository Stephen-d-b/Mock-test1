/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjclasses4;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjClasses4 {

    public static void main(String[] args) {
        String strProduct = JOptionPane.showInputDialog(null, "Please enter the product name: ");

        double dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price for: " + strProduct));

        Product prod = new Product();

        prod.setName(strProduct);
        prod.setPrice(dblPrice);

        String strProduct2 = JOptionPane.showInputDialog(null, "Please enter another product name:");

        double dblPrice2 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Please enter the price for: " + strProduct2)
        );

        Product prod2 = new Product();

        prod2.setName(strProduct2);
        prod2.setPrice(dblPrice2);

        String strProduct3 = JOptionPane.showInputDialog(null, "Please enter another-another product name:");

        double dblPrice3 = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Please enter the price for: " + strProduct3)
        );

        Product prod3 = new Product();

        prod3.setName(strProduct3);
        prod3.setPrice(dblPrice3);

        // call 3 methods to display - display product 1, product 2, product 3
        printProduct1(prod);
        printProduct2(prod2);
        printProduct3(prod3);
    }

    public static void printProduct1(Product prod) {

        String strDisplay = "PRODUCT DETAILS:\n"
                + "PRODUCT NAME: " + prod.getName()
                + "\nPRICE: " + prod.getPrice();

        JOptionPane.showMessageDialog(null, strDisplay);

    }
    public static void printProduct2(Product prod2) {

        String strDisplay = "PRODUCT DETAILS:\n"
                + "PRODUCT NAME: " + prod2.getName()
                + "\nPRICE: " + prod2.getPrice();

        JOptionPane.showMessageDialog(null, strDisplay);

    }
    public static void printProduct3(Product prod3) {

        String strDisplay = "PRODUCT DETAILS:\n"
                + "PRODUCT NAME: " + prod3.getName()
                + "\nPRICE: " + prod3.getPrice();

        JOptionPane.showMessageDialog(null, strDisplay);

    }
    
}
