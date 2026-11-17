/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheratance5;

/**
 *
 * @author Stephen D
 */
public class Drink extends MenuItem {
    
    private String size;
    
    public Drink(String name, double price, String size) {
        super(name, price, Category.DRINK);
        
        this.size = size;
    }
    
    public String getSize()
    {
        return size;
    }
    
    
    @Override
    public String displayItem()
    {
        return super.displayItem() + "\nDrink Size: " + size;
    }
    
}
