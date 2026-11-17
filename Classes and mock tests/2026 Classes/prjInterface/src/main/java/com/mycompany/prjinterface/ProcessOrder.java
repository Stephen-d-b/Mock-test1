/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface;

/**
 *
 * @author Stephen D
 */
public class ProcessOrder implements Order{
    
    private double dblPrice = 0, dblTotal = 0;
    private int intAmount;

    @Override
    public void setAmount(int intAmound) {

        this.intAmount = intAmount;
        
    }

    @Override
    public void setPrice(double dblPrice) {
        
        this.dblPrice = dblPrice;
    
    }

    @Override
    public double getTotal() {
        
        dblTotal = dblPrice * intAmount;
        return dblTotal;

    }
    
    
    
}
