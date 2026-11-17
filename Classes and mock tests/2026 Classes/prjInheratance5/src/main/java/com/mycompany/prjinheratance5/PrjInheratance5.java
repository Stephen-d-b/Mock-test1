/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheratance5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjInheratance5 {
    
    private static Scanner scan = new Scanner(System.in);
    private static ArrayList<MenuItem> order = new ArrayList<>(); 
    private static int[][] tables =
    {
        {0, 0, 0,},
        {0, 0, 0,}
    };

    public static void main(String[] args) {

      int choice = 0;
      
      while (choice != 7)
      {
          displayMenu();
          
          System.out.print("Please enter your Choice ");
          choice = scan.nextInt();
          scan.nextLine(); //clear the enter key left in scanner
          
          switch (choice)
          {
              case 1:
                  addFood();
                  break;
                  
              case 2:
                  addDrink();
                  break;
                  
              case 3: 
                  viewOrder();
                  break;
                  
              case 4:
                  viewTables();
                  break;
                  
              case 5:
                  allocateSeat();
                  break;
                  
              case 6:
                  deAllocateSeat();
                  break;
                  
              case 7:
                  System.out.println("\nThanks for Visiting!");
                  break;
                  
              default:
                  System.out.println("Invalid choice. Please Try again");
          }//end of case structure
      }//endWhile
    }//end of main

    private static void displayMenu() {

        System.out.println("\n--------------------------------------------------\n" +
                           "       RESTARAUNT ORDERING SYSTEMS   " + 
                           "\n1. Add Food\n" +
                           "2. Add Drink\n" +
                           "3. View Orders\n" +
                           "4. View Tables\n" +
                           "5. Allocate Seats\n" +
                           "6. DeAllocate Seats\n" +
                           "7. Exit\n" +
                           "\n--------------------------------------------------\n");
    }
    
    
    private static void addFood() {
    
        System.out.println("\n----- ADD FOOD -----\n");
        
        System.out.print("Please enter the name of your food ");
        String name = scan.nextLine();
        
        
        System.out.print("please enter price: R");
        double price = scan.nextDouble();
        
        System.out.print("Is it vegeterian (True/False) ");
        boolean vegetarian = scan.nextBoolean();
        
        
    }
    
    private static void addDrink() {
            
        System.out.println("\n----- ADD DRINK -----\n");
        
        System.out.print("Please enter the name of your drink ");
        String name = scan.nextLine();
        
        
        System.out.print("please enter price: R");
        double price = scan.nextDouble();
        
        scan.nextLine();
        
        System.out.print("What is the size ");
        String size = scan.nextLine();
        
        System.out.println("Drink added Successfully ");
        
        
    }

    private static void viewOrder() {
        
        System.out.println("\n----- VIEW ORDERS -----\n");
                
        if (order.isEmpty())
        {
            System.out.println("No items in the order. ");
        }
        else
        {
            for(MenuItem item : order)
            {
                System.out.println();
                System.out.println(item.displayItem());
                System.out.println("-------------------------------");
            }
        }
    }

    private static void viewTables() {
    
        System.out.println("\n----- RESTAURANT TABLES -----");
        
        for (int row = 0; row < tables.length; row++) 
        {
            
            System.out.print("Table " + (row + 1) + ": ");
            
            for (int column = 0; column < tables[row].length; column++) 
            {
                System.out.print("[" + tables[row][column] + "]");
            }//endfor
            
            System.out.println();
        }//endfor
        
        System.out.println("\n0 = Available");
        System.out.println(" 1 = Occupide");
    }
    

    private static void allocateSeat() 
    {
        System.out.println("\n----- ALLOWCATE SEAT -----\n");    
        
        viewTables();

        System.out.println("\nPlease enter table number: ");
        int table = scan.nextInt();
        
        System.out.println("Please enter seat Number");
        int seat = scan.nextInt();
        
        if (tables[table - 1][seat - 1] == 0) 
        {
            tables[table - 1][seat - 1] = 1;
            
            System.out.println("Seat allowcated Successfully");
        }
        else
        {
            System.out.println("Seat is alreaddy taken"); 
        }//endif
        
    }

    private static void deAllocateSeat() {
        
        System.out.println("\n----- DEALLOWCATE SEAT -----\n");
        
        viewTables();

        System.out.println("\nPlease enter table number: ");
        int table = scan.nextInt();
        
        System.out.println("Please enter seat Number");
        int seat = scan.nextInt();
        
        if (tables[table - 1][seat - 1] == 1) 
        {
            tables[table - 1][seat - 1] = 0;
            
            System.out.println("Seat deallowcated Successfully");
        }
        else
        {
            System.out.println("Seat is already Free");
        }//endif
        
    }

    
    
    
}
