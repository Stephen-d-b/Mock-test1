/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstractclasses2;

/**
 *
 * @author Stephen D
 */
public abstract class Car {
    
    private double dblPrice = 0.0;
    
    public Car(int intCar)
    {
        if (intCar == 1)
        {
            dblPrice = 32;
        }
        else if (intCar == 2)
        {
            dblPrice = 64;
        }
        else if (intCar == 3 )
        {
            dblPrice = 128;
        }
        
        
    }
    
    protected double getBasePrice()
        {
            return dblPrice;
        }
    
    public abstract Double getPrice();
    
    
    
    
}
