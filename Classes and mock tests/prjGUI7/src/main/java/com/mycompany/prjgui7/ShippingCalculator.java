/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjgui7;

/**
 *
 * @author tswan
 */
public class ShippingCalculator {
    
    private double weight;
    private String shippingType;

    public ShippingCalculator(double weight, String shippingType) {
        this.weight = weight;
        this.shippingType = shippingType;
    }
    
    public double calcWeight(){
        double cost = 0;
        if (shippingType.equals("Standard")){
            cost = weight *5;
        } else if (shippingType.equals("Express")){
            cost = weight * 10;
        } else if (shippingType.equals("Overnight")){
            cost = weight * 15;
        }
        

       return cost; 
    }
    
    public String summary(){
        
        return "Shipping Type: " + shippingType + "\nWeight: " + weight + "\nCost: " + calcWeight();
        
    }
    
}
