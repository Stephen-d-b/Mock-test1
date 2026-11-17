/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarraysrevision;

/**
 *
 * @author Stephen D
 */
public class PrjArraysRevision {

    public static void main(String[] args) {
       int[] intArray3;
       int sum = 0;


        intArray3 = new int[6];
        

        intArray3[0] = 12;
        intArray3[1] = 7;
        intArray3[2] = 9;
        intArray3[3] = 21;
        intArray3[4] = 5;
        intArray3[5] = 14;
        
        for (int index = 0; index < intArray3.length; index++) 
        {
            System.out.println(intArray3[index]);
            sum = sum + intArray3[index];
            
        }
        System.out.println("the sum of your array is: " + sum);
    }
}
