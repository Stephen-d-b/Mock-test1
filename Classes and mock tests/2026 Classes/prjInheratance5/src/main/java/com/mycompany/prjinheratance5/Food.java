/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheratance5;

/**
 *
 * @author Stephen D
 */
public class Food extends MenuItem{
    
    private boolean vegetarian;
    
    public Food(String name, double price, boolean vegetarian) {
        super(name, price, Category.FOOD);
        
        this.vegetarian = vegetarian;
    }
    
    public boolean isVegetarian()
    {
        return vegetarian;
    }
    
    
    @Override
    public String displayItem()
    {
        return super.displayItem() + "\nVegetarian: " + vegetarian;
    }
    
    
    
    
    
    
    
    
    
    
}
