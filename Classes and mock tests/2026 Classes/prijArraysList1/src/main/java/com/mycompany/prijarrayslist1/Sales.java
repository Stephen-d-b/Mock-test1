/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prijarrayslist1;

import java.util.ArrayList;

/**
 *
 * @author Stephen D
 */
public class Sales {
    
    private ArrayList<Double> dblSales = new ArrayList<>();
    
    public void addSales(double dblSale)
    {
        dblSales.add(dblSale);
    }

    public double calculateTotal()
    {
        
        double dblTotal = 0.0;
        
        for (int index = 0; index < dblSales.size(); index++) 
        {
            dblTotal += dblSales.get(index);
        }
        
        return dblTotal;
        
    }
    
    public double calculateAverage()
    {
        return calculateTotal() / dblSales.size();
    }
    
}
