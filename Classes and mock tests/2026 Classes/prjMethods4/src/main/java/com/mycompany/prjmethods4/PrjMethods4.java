/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjmethods4;

/**
 *
 * @author Stephen D
 */
public class PrjMethods4 {

    public static void main(String[] args) {

        String strDisplay = hello();

        System.out.println("The method said: " + strDisplay);

    }

    public static String hello()

    {
        String strGreeting = "Salutations"; // is local to this method

        return strGreeting;
        

    }
}
