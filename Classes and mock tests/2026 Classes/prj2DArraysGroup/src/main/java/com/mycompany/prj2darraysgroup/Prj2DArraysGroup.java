/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj2darraysgroup;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class Prj2DArraysGroup {

    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

        int[][] arrProduct = new int[4][3];

        for(int index = 0; index < 4; index++){


            System.out.println("===============================");
            System.out.println("Please enter Product Code(" + (index+1) + ")");
            System.out.println("===============================");

            while (!scan.hasNextInt()) {
            System.out.println("\nError: That is not a valid integer.");
            System.out.print("Please try again: \n");
            scan.next();}

            arrProduct[index][0] = scan.nextInt();
            System.out.println("====================");
            System.out.println("Please enter Product Price(" + (index+1) + ")");
            System.out.println("====================");
            while (!scan.hasNextInt()) {
            System.out.println("\nError: That is not a valid integer.");
            System.out.print("Please try again: \n");
            scan.next();}

            arrProduct[index][1] = scan.nextInt();
System.out.println("====================");
            System.out.println("Please enter Product Quantity(" + (1+index) + ")");
            System.out.println("====================");
            while (!scan.hasNextInt()) {
            System.out.println("\nError: That is not a valid integer.");
            System.out.print("Please try again: \n");
            scan.next();}

            arrProduct[index][2] = scan.nextInt();

        }

        int display = 0;

        for (int index=0;index<4;index++){

            display += arrProduct[index][1] * arrProduct[index][2];

        }
        System.out.println("======================================");
        System.out.println("Total Cost off stock is R" + display);
        System.out.println("======================================\n");
    }
}

