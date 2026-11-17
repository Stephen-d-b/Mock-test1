/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjloops3;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjLoops3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Reminder re = new Reminder();
        
        int intAccountNumber, intMonthCounter, intYearCounter; //all loop control variables
        final int intMonths = 12;
        final int intYears = 3;
        final int intQuit = -1; // sentinel value
        
        System.out.println("Please enter your account number or " + intQuit + " to exit the Program");
        
        intAccountNumber = getValidInput(scan); //Method Call pass scanner
        
        while (intAccountNumber != intQuit)
        {
            
            intYearCounter = 1; //First step for a year loop
            
            while(intYearCounter <= intYears)
            {
                
                System.out.println("\n-- Year " + intYearCounter + " --");
                
                intMonthCounter = 1; //First step for a month loop
                
                while(intMonthCounter <= intMonths)
                {
                    System.out.println(re.getReminder(intMonthCounter, intYearCounter));
                    
                    intMonthCounter++;
                    
                }//endWhile for the month loop
                
                intYearCounter++;
                
            }//endWhile for the Year loop
            
            System.out.println("\nPlease enter your account number or " + intQuit + " to exit the Program");
        
            intAccountNumber = getValidInput(scan); //Method Call pass scanner
            
        }//endWhile for the indefinite loop.
        
        System.out.println("Program Ended. Goodbye!");
        
    }//outside of the main
    
    public static int getValidInput(Scanner scan)
    {
        
        while(!scan.hasNextInt())
        {
        
            System.out.println("Invalid Input Please enter a number!");
            scan.next(); // clears the bad input clears the loop.

        }
        
        return scan.nextInt();
        
    }
    
}
