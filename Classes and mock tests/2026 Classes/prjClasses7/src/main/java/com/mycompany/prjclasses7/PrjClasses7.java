/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjclasses7;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjClasses7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the First Number: ");
        double dblNum1 = scan.nextDouble();

        System.out.println("Please enter the Second Number: ");
        double dblNum2 = scan.nextDouble();
        
        Calculations c = new Calculations(dblNum1,dblNum2);
        
        printDetails(c);
    }
    
    public static void printDetails(Calculations c) {
         System.out.println ( "Your numbers sum is: " +c.getSum()  + 
                            "\nThe numbers subtracts is: " + c.getSubtract() + 
                            "\nThe numbers devided is:  " + c.getDivide()+
                            "\nThe numbers multiply is: " + c.getMultiply());
        
    }
    
}
