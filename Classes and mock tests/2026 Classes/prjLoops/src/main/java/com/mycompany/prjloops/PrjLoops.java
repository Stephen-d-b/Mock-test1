/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjloops;

/**
 *
 * @author Stephen D
 */
public class PrjLoops {

    public static void main(String[] args) {
        
//        int intNumber;
//        final int intMAX = 20;
//        
//        intNumber = 1;
//        
//        while (intNumber <= intMAX)
//        {
//            System.out.println(intNumber);
//            intNumber = intNumber + 1;
//        }

    int intYear;
    int intFinalYear;
    int intAdd = 5;
    final int intMAX = 30;
    
    
    intYear = 2015;
    
    intFinalYear = (intYear + intMAX);
    
    while(intYear <= intFinalYear)
    {
        System.out.println(intYear);
        intYear = intYear + intAdd;
    }

    }
    
    
}
