/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjabstractclasses1;

import java.util.Scanner;

/**
 *
 * @author conno
 */
public class PrjAbstractClasses1 {

    public static void main(String[] args) {
        /*
        
        Orders is abstract because it is the general/template class
        
        We dont want to create generic order; we want to create spcific type of order
        
        The parent class -order - holds the common code
        
        the child classs - processorder - represents the actual obhect
        */
        
        Scanner scan  = new Scanner(System.in);
        
        System.out.print("Enter your product: ");
        String strProduct = scan.nextLine();
        
        System.out.print("Enter your Price: ");
        double dblPrice = scan.nextDouble();
        
        System.out.println("Enter your quantity: ");
        int intQuant = scan.nextInt();
        
        ProcessOrder newOrder = new ProcessOrder(strProduct, dblPrice, intQuant);
        
        System.out.println(newOrder.printReport());
        
        
    }
}
