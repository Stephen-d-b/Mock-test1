/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjpolymorphism;

/**
 *
 * @author Stephen D
 */
public class PrjPolymorphism {

    public static void main(String[] args) {

        Pizza piz = new Pizza();
        
        System.out.println(piz.order("Chicken"));
        
        System.out.println(piz.order("Chicken", "Mushroom"));
        
        

    }
}
