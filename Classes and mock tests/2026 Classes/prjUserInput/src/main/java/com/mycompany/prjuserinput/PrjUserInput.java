/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjuserinput;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjUserInput {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please Enter PRODUCT name: ");
        String strProduct = scan.nextLine();
        System.out.print("Please Enter CUSTOMER name: ");
        String strName = scan.nextLine();
        System.out.print("Please Enter DELIVERY address: ");
        String strDeliver = scan.nextLine();
        
        System.out.println("Order Details");
        System.out.println("---------------------");
        System.out.println("Name: \t\t " + strName);
        System.out.println("Product: \t " + strProduct);
        System.out.println("Delivery:  \t " + strDeliver);
        //strName = JOptionPane.showInputDialog(null, "Please enther product name");
    }
}
