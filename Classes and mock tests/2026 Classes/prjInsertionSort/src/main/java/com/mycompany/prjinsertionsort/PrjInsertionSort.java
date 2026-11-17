/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinsertionsort;

/**
 *
 * @author Stephen D
 */
public class PrjInsertionSort {

    public static void main(String[] args) {
        
        final int  INTSIZE = 5;
        
        int[] someNums = {90, 85, 65, 95, 75};
        
        int pass = 0; // current element that is being sorted/inserter
        
        int index = 0; // moving backwards through the sorted sections
        
        int temp = 0; // stores value being inserted
        
        pass = 1;
        
        while (pass < INTSIZE)
        {
            temp = someNums[pass]; // Stores the current values before shifting
            
            index = pass - 1; // compares position 1 with position 0
            
            while (index >= 0 && someNums[index] > temp)
            {
                someNums[index + 1] = someNums[index];
                index = index - 1;
            }// end while 
            someNums[index + 1] = temp; // inserts temp into its correct sorted position.
            pass = pass + 1; // move to the next sorted element
        }// end while
        
        System.out.println("Sorted array in ascending order: ");
        
        for (int num : someNums)
        {
            System.out.println(num + "  ");
           
        }
    }
}
