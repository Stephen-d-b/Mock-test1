/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods2;

/**
 *
 * @author Stephen D
 */
public class PrjMethods2 {

    public static void main(String[] args) {
        
        outputName("Stephen"); //Argument
    }
    
    public static void outputName(String strName)  //parameter
    {
        System.out.println("Your Name is: " + strName);
        
        outputAge(20);
    }
    
    public static void outputAge(int intAge) 
    {
        System.out.println("Your Age is: " + intAge);
        
        
    }
}
