/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjarrayslist2;

/**
 *
 * @author Stephen D
 */
public class Customer {
    
    private String name;
    private String product;
    private double price;
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setProduct(String product){
        this.product = product;
    }
    
    public void setPrice(Double price){
        this.price = price;
    }
    
    public String getName(){
        return name;
    }
    
    public String getProduct(){
        return product;
    }
    
    public double getPrice(){
        return price;
    }
}