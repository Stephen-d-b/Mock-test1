/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarraylist3;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjArraylist3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Menu");
        System.out.println("=========================");
        System.out.println("");
        System.out.println("1) Add customer");
        System.out.println("2) Search Customer");
        System.out.println("3) Update Customer");
        System.out.println("4) Remove Custoemr");
        System.out.println("5) Dipslay ALL Customers");
        System.out.println("6) Exit");
        System.out.println("");
        System.out.println("========================");
        
        String input = scan.nextLine();
        
        
        switch(input)
        {
            case "Add":
                System.out.println("Please enter your Name");
                scan.nextLine();
                return;
                
            case "Search":
                System.out.println("Enter the name of the customer you would like to search");
                scan.nextLine();
                return;
                
            case "Update":
                System.out.println("Please enter please update Customer");
                scan.nextLine();
                return;
                
            case "Remove":
                System.out.println("Please enter your Customer you would like to remove");
                scan.nextLine();
                return;
            
            case "Display":
                System.out.println("All names coming soon");
                return;
                
            case "Exit":
                break;
                
            default:
                System.out.println("Invalid option");
                break;
                
                //Test Push
        }
    }
}
