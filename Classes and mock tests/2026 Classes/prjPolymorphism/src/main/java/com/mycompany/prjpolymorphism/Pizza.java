/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjpolymorphism;

/**
 *
 * @author Stephen D
 */
public class Pizza {
    
    public String order(String strToppingA)
    {
        return "Topping on the Pizza: " + strToppingA;
    }
    
    public String order(String strToppingA, String strToppingB)
    {
        return "Toppings on Pizza: " + strToppingA + " and " + strToppingB;
    }
    
    public String order()
    {
        return "Plain piza, no Toppings";
    }
    
    public String order(int intQty)
    {
        return intQty + " plain pizza bases";
    }
    
}
