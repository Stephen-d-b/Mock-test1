/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjMethods {

    public static void main(String[] args) {
        System.out.println("We are in the main method");
        
        calculateVat();
        
        displayData();
    }

    private static void calculateVat() 
    {
        System.out.println("We are in the calculate VAT method");
        
        Scanner scan = new Scanner(System.in);
        
        double dblPrice = 0.0;
        
        
        System.out.println("Please enter a price exluding VAT: ");
        dblPrice = scan.nextDouble();
        
        double dblUserPrice = (dblPrice * 0.15);
        double dblTotal = (dblPrice + dblUserPrice);
        
        System.out.println("ORIGNAL PRICE: R" + dblPrice);
        System.out.println("VAT AMOUNT: R" + dblUserPrice);
        System.out.println("FINAL PRICE: R" + dblTotal);
        
        
    }

    private static void displayData() //method header - access specifier, return type,name
    {
        System.out.println("We are in the displayData method");
 
        
    }

}
