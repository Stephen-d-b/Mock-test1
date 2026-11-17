/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstractclasses2;

/**
 *
 * @author Stephen D
 */
public class CarPurchase extends Car {
    
    public CarPurchase(int intCar)
    {
        super(intCar);
    }

    @Override
    public Double getPrice() {

        return getBasePrice();

    }
    
    
    
    
    
}
