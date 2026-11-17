/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjswitch;

import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjSwitch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number for the NATO phonetic alphabet: ");
        int intNumber = scan.nextInt();
        
        ifMethod(intNumber);
        switchMethod(intNumber)
    }
    private static void ifMethod(int intNumber)
    {
        System.out.println("Results from if method: ");
        
        if(intNumber == 1)
        {
            System.out.println("Alpha");
        }
        else if (intNumber == 2)
        {
            System.out.println("BRAVO");
        }
        else if (intNumber == 3)
        {
            System.out.println("CHARLIE");
        }
        else 
        {
            System.out.println("This application only displays 3 items");
        }
    }
    private static void switchMethod(intNumber)
    {
        System.out.println("Results from switch method: ");
        
        if(intNumber == 1)
        {
            System.out.println("Alpha");
        }
        else if (intNumber == 2)
        {
            System.out.println("BRAVO");
        }
        else if (intNumber == 3)
        {
            System.out.println("CHARLIE");
        }
        else 
        {
            System.out.println("This application only displays 3 items");
        }
    }
}
