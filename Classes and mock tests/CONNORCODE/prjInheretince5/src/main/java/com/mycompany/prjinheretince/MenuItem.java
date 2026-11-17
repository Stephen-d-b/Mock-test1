/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheretince;

/**
 *
 * @author conno
 */
public class MenuItem {
    private String name;
    private double price;
    private Category category;
    
    public MenuItem(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public Category getCategory() {
        return category;
    }
    
    public String displayItem() {
        return "Name: " + name +
                "\nPrice: R" + price +
                "\nCategory" + category;
    }
}
