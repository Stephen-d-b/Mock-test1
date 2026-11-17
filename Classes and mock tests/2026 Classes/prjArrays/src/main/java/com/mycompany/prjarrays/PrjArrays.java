/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjarrays;

/**
 *
 * @author Stephen D
 */
public class PrjArrays {

    public static void main(String[] args) {

//        int[] intArray1 = new int[5];
//        //declared and initialized the array
//
//        int[] intArray2 = {5, 5, 5, 5, 5};
//        //when you know the values at the time of creation
//
//        int[] intArray3;
//        //you plan on using a int array in the future
//
//        intArray3 = new int[5];
//        //setting array with 5 elements and it assigns it to intArray3
//        //all posistions are defualt to 0
//
//        intArray3[0] = 20;
//        intArray3[1] = 30;
//        intArray3[2] = 40;
//        intArray3[3] = 50;
//        intArray3[4] = 60;
//
//        String[] strStudents = new String[20];
//
//        String[] strEmployees = {"Joe", "Jeff", "Jane"};

        String[] arrNames = new String[5];

        arrNames[0] = "Piet";
        arrNames[1] = "Jeffy";
        arrNames[2] = "Mario";
        arrNames[3] = "Luigi";
        arrNames[4] = "Bowser";
        
        for(int index = 0; index < arrNames.length; index++)
        {
            System.out.println("element at index: " + index + ":" + arrNames[index]);
        }

    }
}
