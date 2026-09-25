/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjinsertionsort2;

/**
 *
 * @author conno
 */
public class PrjInsertionSort2 {

    public static void main(String[] args) {

        final int intSIZE = 5;

        int[] arrNums = {67, 420, 21, 1, 9};

        int pass = 0; // current element that is being sorted/inserted into correct position

        int iIndex = 0; //moving backwards through the sorted section

        int temp = 0; //stored value being inserted

        // starting from the 2nd element because the firs tis considered sorted already
        pass = 1;
        
        System.out.println("Unsorted array: ");
        for (int num : arrNums) {
            System.out.println(num);
        }

        while (pass < intSIZE) { //Controls the passes
            temp = arrNums[pass]; // store the current value before shifting

            iIndex = pass - 1; // start comparing with the element before it (left)

            //move backwards while:
            /*
            we have not reached the beginning of the array
            AND the current element is smaller than the compared element
             */
            while (iIndex >= 0 && arrNums[iIndex] > temp) {
                arrNums[iIndex + 1] = arrNums[iIndex];
                iIndex = iIndex - 1;
            } // endwhile inner loop
            arrNums[iIndex + 1] = temp;
            pass++;
        } //endwhile outer loop
        System.out.println("Sorted array in ascending order: ");

        for (int num : arrNums) {
            System.out.println(num);
        }
    }
}
