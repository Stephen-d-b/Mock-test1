/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses4;

/**
 *
 * @author Stephen D
 */
public class Product {

    private String strProductName;
    private double dblProductPrice;

    public void setName(String strProduct) {
        strProductName = strProduct;
    }

    public String getName() {
        return strProductName;
    }

    public void setPrice(double dblPrice){
        dblProductPrice = dblPrice;
    }
    
    public double getPrice(){
        return dblProductPrice;
    }
    
}

