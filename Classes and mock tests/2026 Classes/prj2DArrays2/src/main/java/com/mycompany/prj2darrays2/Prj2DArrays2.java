/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj2darrays2;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class Prj2DArrays2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[][] productDetails = new int[4][3];
        
        for (int index = 0; index < 3; index++) 
        {
            System.out.println("Please enter the product code");
            while (!scan.hasNextInt()) {
            System.out.println("Error: That is not a valid integer.");
            System.out.print("Please try again: ");
            scan.next();}
            productDetails[index][0] = scan.nextInt();
            
            System.out.println("Please enter the product price");
            while (!scan.hasNextInt()) {
            System.out.println("Error: That is not a valid integer.");
            System.out.print("Please try again: ");
            scan.next();}
            productDetails[index][1] = scan.nextInt();
            
            System.out.println("Please enter the qty of the product");
            while (!scan.hasNextInt()) {
            System.out.println("Error: That is not a valid integer.");
            System.out.print("Please try again: ");
            scan.next();}
            productDetails[index][2] = scan.nextInt();
        }
     
        int intTotal = 0;
        
        for (int index = 0; index < 4; index++) 
        {
            intTotal += productDetails[index][1] * productDetails[index][2];
        }
        
        System.out.println("Total Cost of the stock on hand is : R" + intTotal);
        
    }
}
